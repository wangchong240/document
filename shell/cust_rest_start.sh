NAME='crm-rest-cust'  
F_PATH='/home/crm3user/cust-rest'
echo $NAME  
ID=`ps -ef | grep "$NAME" | grep -v "grep" | awk '{print $2}'`  
echo $ID  
echo "---------------"  
for id in $ID  
do  
kill -9 $ID
echo "killed $ID"  
done  
echo "------killed $NAME---------"  

echo "------start $NAME ---------"  
nohup java -jar "$F_PATH"/"$NAME".jar >"$F_PATH"/nohup.out &
