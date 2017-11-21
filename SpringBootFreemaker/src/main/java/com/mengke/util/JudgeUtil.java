package com.mengke.util;
/**
 * 字符串空判断
 * JudgeUtil<br/>
 * 创建人:曾翔<br/>
 * 时间：2017年11月2日-上午10:17:01 <br/>
 * @version 1.0.0<br/>
 *
 */
public class JudgeUtil {
	
	public static boolean isNull(String content){
		return content==null || "".equals(content);
	}
	public static boolean isNotNull(String content){
		return !isNull(content);
	}
}