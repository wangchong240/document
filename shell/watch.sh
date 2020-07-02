#!/bin/bash
source /etc/profile   
export LANG=$LANG
 
    for IP in `cat /u01/watch/ip_list.txt`
    do
 
       	date=`date +%Y-%m-%d.%H:%M`
    	echo ip=`ifconfig eth1 | grep "inet addr" | awk '{printf $2}' | cut -d ":" -f 2`

#磁盘监控，这里不监控扩展盘

   	disk_use=`root@$IP "df -h" | grep "/dev/sda1" | awk '{printf $5}' | cut -d '%' -f 1`
    
    	if [ $disk_use -ge 90 ];then
    
    	echo "$IP 在$date 磁盘使用: $disk_use%" | mail -v -s "告警" wang.chong-neu@neusoft.com,tanglch@neusoft.com
    
    	fi

#cpu监控
    	    
        cpu_not_use=`ssh root@$IP "top -b -n 1" | grep "Cpu" | awk '{print $5}' | cut -d "." -f 1`	

    	if [ $cpu_not_use -le 10 ];then
    
    	echo "$IP 在$date CPU 可用：$cpu_not_use%" | mail -v -s "告警" wang.chong-neu@neusoft.com,tanglch@neusoft.com
    
    	fi

#内存监控

    	men_use=`ssh root@$IP "free" | awk '/Mem/{printf("%.2f\n"), $3/$2*100}' | cut -d "." -f 1`
         
    	if [ $men_use -ge 40 ];then
    
    	echo "$IP 在$date 内存使用： $men_use%" | mail -v -s "告警" wang.chong-neu@neusoft.com,tanglch@neusoft.com
        echo $IP "=" $men_use >> a.txt    

   	fi
	
   done
