/**
 * StringUtils.java
 */
package com.neusoft.crm.common.utils;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.math.NumberUtils;

/**
 * 数据字符串工具类
 * 
 * @author Lifuyou
 *
 */
public final class StringUtils {

	public static String lnProvice = "18";

	public static int lnExtIdLength = 16;

	public static String lnPadStr = "0";

	public static String grpProvince = "99";

	public static int grpExtIdLength = 12;

	private StringUtils() {
	}

	public static boolean isNumberic(final String str) {

		return NumberUtils.isNumber(str);
	}

	public static Integer toInt(final String str, final int defaultValue) {

		return NumberUtils.toInt(str, defaultValue);
	}

	public static Long toLong(final String str, final long defaultValue) {

		return NumberUtils.toLong(str, defaultValue);
	}

	public static Double toDouble(final String str, final double defaultValue) {

		return NumberUtils.toDouble(str, defaultValue);
	}

	public static BigDecimal toBigDecimal(final String str, String ifNull) {

		String stringNumber = null;
		if (StringUtils.isNumberic(str)) {
			stringNumber = str;
		} else {
			stringNumber = ifNull;
		}
		if (null == stringNumber) {
			return null;
		}
		return NumberUtils.createBigDecimal(stringNumber);

	}

	public static Float toFloat(final String str, final float defaultValue) {

		return NumberUtils.toFloat(str, defaultValue);
	}

	public static Integer toInt(final String str) {

		return NumberUtils.toInt(str);
	}

	public static Long toLong(final String str) {

		return NumberUtils.toLong(str);
	}

	public static Double toDouble(final String str) {

		return NumberUtils.toDouble(str);
	}

	public static Float toFloat(final String str) {

		return NumberUtils.toFloat(str);
	}

	public static String capitalize(String str) {

		int strLen;
		return str != null && (strLen = str.length()) != 0 ? (new StringBuffer(strLen)).append(Character.toTitleCase(str.charAt(0))).append(str.substring(1)).toString() : str;
	}

	/**
	 * 判断字符串是否不为空
	 * 
	 * @param string
	 * @return
	 */
	public static boolean isNotEmpty(final String string) {

		return org.apache.commons.lang.StringUtils.isNotEmpty(string);
	}

	/**
	 * 判断字符串是否为空
	 * 
	 * @param string
	 * @return
	 */
	public static boolean isEmpty(final String string) {

		return org.apache.commons.lang.StringUtils.isEmpty(string);
	}

	public static String reflectionToString(final Object object) {

		return ToStringBuilder.reflectionToString(object);
	}

	public static int getStringLength(final String str) {

		int length = 0;
		if (isNotEmpty(str)) {
			length = str.length();
		}
		return length;
	}

	public static boolean equals(final String str1, final String str2) {

		return org.apache.commons.lang.StringUtils.equals(str1, str2);
	}

	/**
	 * 右截取
	 * 
	 * @param str
	 * @param size
	 * @return
	 */
	public static String right(final String str, final int size) {

		return org.apache.commons.lang.StringUtils.right(str, size);
	}

	/**
	 * 左截取
	 * 
	 * @param str
	 * @param size
	 * @return
	 */
	public static String left(final String str, final int size) {

		return org.apache.commons.lang.StringUtils.left(str, size);
	}

	/**
	 * 右补齐
	 * 
	 * @param str
	 * @param size
	 * @param padStr
	 * @return
	 */
	public static String rightPad(final String str, final int size, final String padStr) {

		return org.apache.commons.lang.StringUtils.rightPad(str, size, padStr);
	}

	/**
	 * 右补齐
	 * 
	 * @param str
	 * @param size
	 * @return
	 */
	public static String rightPad(final String str, final int size) {

		return org.apache.commons.lang.StringUtils.rightPad(str, size);
	}

	/**
	 * 左补齐
	 * 
	 * @param str
	 * @param size
	 * @param padStr
	 * @return
	 */
	public static String leftPad(final String str, final int size, final String padStr) {

		return org.apache.commons.lang.StringUtils.leftPad(str, size, padStr);
	}

	/**
	 * 左补齐
	 * 
	 * @param str
	 * @param size
	 * @return
	 */
	public static String leftPad(final String str, final int size) {

		return org.apache.commons.lang.StringUtils.leftPad(str, size);
	}

	/**
	 * oracle右补齐,如果补齐位数大于实际位数则左截取,即rpad
	 * 
	 * @param str
	 * @param size
	 * @param padStr
	 * @return
	 */
	public static String rpad(final String str, final int size, final String padStr) {

		return left(rightPad(str, size, padStr), size);
	}

	/**
	 * oracle右补齐空格,如果补齐位数大于实际位数则左截取,即rpad
	 * 
	 * @param str
	 * @param size
	 * @param padStr
	 * @return
	 */
	public static String rpad(final String str, final int size) {

		return left(rightPad(str, size), size);
	}

	/**
	 * oracle左补齐空格,如果补齐位数大于实际位数则左截取,即lpad
	 * 
	 * @param str
	 * @param size
	 * @param padStr
	 * @return
	 */
	public static String lpad(final String str, final int size) {

		return left(leftPad(str, size), size);
	}

	/**
	 * 左补齐,如果补齐位数大于实际位数则左截取,即lpad
	 * 
	 * @param str
	 * @param size
	 * @param padStr
	 * @return
	 */
	public static String lpad(final String str, final int size, final String padStr) {

		return left(leftPad(str, size, padStr), size);
	}

	/**
	 * 根据间隔符拆分
	 * 
	 * @param str
	 * @param separatorChars
	 * @return
	 */
	public static String[] split(final String str, final String separatorChars) {

		return org.apache.commons.lang.StringUtils.split(str, separatorChars);
	}

	/**
	 * 是否是以某字符串开头
	 * 
	 * @param str
	 * @param prefix
	 * @return
	 */
	public static boolean startWith(final String str, final String prefix) {

		return org.springframework.util.StringUtils.startsWithIgnoreCase(str, prefix);
	}

	/**
	 * 是否包含某字符串
	 * 
	 * @param string
	 * @param searchStr
	 * @return
	 */
	public static boolean contains(final String string, final String searchStr) {

		return org.apache.commons.lang.StringUtils.contains(string, searchStr);
	}

	/**
	 * 获取包含在字符串中的一个字符串
	 * 
	 * @param str
	 * @param open
	 * @param close
	 * @return
	 */
	public static String substringBetween(final String str, final String open, final String close) {

		return org.apache.commons.lang.StringUtils.substringBetween(str, open, close);
	}

	/**
	 * 去除数组中所有字符串两方的空白符
	 * 
	 * @param strs
	 * @param stripChars
	 * @return
	 */
	public static String[] stripAll(final String[] strs) {

		return org.apache.commons.lang.StringUtils.stripAll(strs);
	}

	public static String substringAfterLast(final String str, final String separator) {

		return org.apache.commons.lang.StringUtils.substringAfterLast(str, separator);
	}

	public static String substringBeforeLast(final String str, final String separator) {

		return org.apache.commons.lang.StringUtils.substringBeforeLast(str, separator);
	}

	/**
	 * @param formatStr
	 *            被格式化字符串
	 * @param tag
	 *            不足位补充字符串
	 * @param len
	 *            字符串长度
	 * @param direction
	 *            1：左补，0：右补
	 * @return
	 */
	@SuppressWarnings("unused")
	private static String format(final Object formatStr, final String tag, final int len, final int direction) {

		final String str = formatStr.toString();
		if (len <= str.length()) {
			return str.substring(0, len);
		}
		final StringBuilder tempStr = new StringBuilder();
		for (int i = 0; i < len - str.getBytes().length; i++) {
			tempStr.append(tag);
		}
		if (direction == 0) {
			return str + tempStr;
		} else {
			return tempStr.append(formatStr).toString();
		}
	}

	/**
	 * 字节数组拷贝
	 *
	 * @param fromBytes
	 * @param toBytes
	 * @param from
	 * @param len
	 */
	private static void cpyBytes(final byte[] fromBytes, final byte[] toBytes, final int from, final int len) {

		for (int i = from; i < from + len; i++) {
			toBytes[i - from] = fromBytes[i];
		}
	}

	/**
	 * 获取字符串formatStr从from到from + len的字符串
	 *
	 * @param formatStr
	 * @param from
	 * @param len
	 * @return
	 */
	public static String substringByByte(final String formatStr, final int from, final int len) {

		if (isEmpty(formatStr))
			return null;
		final byte[] fromBytes = formatStr.getBytes();
		if (fromBytes.length < len) {
			return formatStr;
		}
		final byte[] toBytes = new byte[len];
		cpyBytes(fromBytes, toBytes, from, len);
		return new String(toBytes);
	}

	public static String getExtId(final String str, final int size, final String padStr) {

		return lnProvice + lpad(str, size, padStr);
	}

	public static String getDefaultExtId(final String str, final String padStr) {

		return lnProvice + lpad(str, lnExtIdLength, padStr);
	}

	public static String getDefaultExtId(final String str) {

		return lnProvice + lpad(str, lnExtIdLength, lnPadStr);
	}

	public static String getGrpExtId(String str) {

		if (str == null) {
			return null;
		}

		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(grpProvince).append(lnProvice).append(lnProvice).append(lpad(str, grpExtIdLength, lnPadStr));
		return strBuffer.toString();
	}

	/**
	 * 将stringBuffer的内容重置为字符串 str
	 * 
	 * @param stringBuffer
	 * @param str
	 */
	public static void resetStringBuffer(StringBuffer stringBuffer, String str) {

		if (isNotEmpty(str)) {
			stringBuffer.setLength(0);
			stringBuffer.append(str);
		}
	}

	/**
	 * 判断入参是否为空（长整型判断）
	 * 
	 * @param parameter
	 * @return
	 */
	public static boolean isEmpty(final Long parameter) {

		return parameter == null || parameter == 0;
	}

	/**
	 * 判断入参是否为空（时间类型判断）
	 * 
	 * @param parameter
	 * @return
	 */
	public static boolean isEmpty(final Date parameter) {

		return parameter == null;
	}

	/**
	 * 判断入参是否为空（数字类型判断）
	 * 
	 * @param parameter
	 * @return
	 */
	public static boolean isEmpty(final Integer parameter) {

		return parameter == null || parameter == 0;
	}

	public static boolean isBlank(String str) {

		int strLen;
		if ((str == null) || ((strLen = str.length()) == 0))
			return true;

		for (int i = 0; i < strLen; i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static String toString(final Object object) {

		if (null == object) {
			return null;
		}
		if (object instanceof Date) {
			return dateToString((Date) object);
		} else {
			return object.toString();
		}
	}

	/**
	 * @param object
	 * @return
	 */
	private static String dateToString(final Date date) {

		return DateUtils.format(date, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * <p>
	 * Description:转义特殊字符 注意：这个应用与js 弹出的信息且是用户输入的
	 * </p>
	 * <p>
	 * Remark:特殊字符： \n \t \r \f \b ' " \
	 * </p>
	 * 
	 * @param str
	 *            要转义的字符串
	 * @return
	 */
	public static String chNoteSpecialChar(String str) {

		if (null != str && !"".equals(str)) {
			// str = str.replaceAll("\\", "\\\\\\\\");
			str = str.replaceAll("\n", "\\\\n");
			str = str.replaceAll("\r", "\\\\r");
			str = str.replaceAll("\t", "\\\\t");
			str = str.replaceAll("\f", "\\\\f");
			str = str.replaceAll("\b", "\\\\b");
			str = str.replaceAll("\\\\\"", "`");
			str = str.replaceAll("\"", "`");
			str = str.replaceAll("\\\\\'", "`");
			str = str.replaceAll("\'", "`");
		} else {
			str = "";
		}
		return str;
	}

	public static String nvlToString(Object obj, String target) {

		return obj == null ? target : String.valueOf(obj);
	}

	/**
	 * 
	 * @param param
	 *            请求参数
	 * @param defult
	 *            默认值 如果不需要默认值，则和请求参数相等
	 * @param str
	 *            如果参数1 等于 str【0】 返回 str【1】
	 *            decode("1201","1201","1200","0","1201","0","2100","9" ) 返回0
	 * @return
	 */
	public static String decode(String param, String defult, String... str) {

		for (int i = 0; i < str.length; i = i + 2) {
			if (str[i].equals(param)) {
				return str[i + 1];
			}
		}
		return defult;
	}

	/**
	 * 判断o是否为null和""（空串）
	 * 如果是则返回默认值d，否则返回o
	 * 
	 * @param o
	 *            可能为null和""（空串）的字符串
	 * @param d
	 *            默认值
	 * @return String
	 */
	public static final String noe(Object o, String d) {

		String out = String.valueOf((o == null || "".equals(o) ? d : o));
		return out;
	}

	public static final String getNoSpecialString(Object o, String d) {

		String out = noe(o, d);
		return chNoteSpecialChar(out);
	}

	/**
	 * 判断o是否为null和""（空串）
	 * 如果是则返回默认值d，否则返回o
	 * 
	 * @param o
	 *            可能为null和""（空串）的字符串
	 * @param d
	 *            默认值
	 * @return integer
	 */
	public static final int noeInt(Object o, int d) {

		final String integer_regexp = "^-?\\d+$";
		String s = noe(o, String.valueOf(d));
		if (!s.matches(integer_regexp)) {
			return d;
		}
		return Integer.parseInt(s);
	}
	
	public static String toString(final Object object,String defaultValue) {
		if (null == object) {
			return defaultValue;
		}
		return StringUtils.toString(object);
	}
}
