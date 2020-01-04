package com.bw.test;import com.bw.utils.StringUtil;

/**
 * @author zxy
 *
 * 2020年1月2日
 */
public class TestUtils {

	public static void main(String[] args) {
		System.out.println(StringUtil.isNumber("123"));
		System.out.println(StringUtil.isEmpty("  "));
		System.out.println(StringUtil.judgeTelephoneIsOk("13551510206"));
	}
	
}
