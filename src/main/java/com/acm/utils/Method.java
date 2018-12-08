package com.acm.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
* @author 计算机网络应用 路素飞 E-mail:2512977541@qq.com
* @version 创建时间：2018年12月8日 上午9:57:53
* 类说明
*/
public class Method {
	
	//md5加密
	public static String getMd5(String id,String password) {
		  String encodeStr=DigestUtils.md5Hex(id+password);
		  return encodeStr;
	}
	
	  /**
     * MD5验证方法
     * 
     * @param text 明文
     * @param key 密钥
     * @param md5 密文
     * @return true/false
     * @throws Exception
     */
    public static boolean verify(String id, String password, String md5){
        //根据传入的密钥进行验证
        String md5Text = getMd5(id, password);
        if(md5Text.equalsIgnoreCase(md5))
        {
            System.out.println("MD5验证通过");
            return true;
        }
        return false;
    }

}
