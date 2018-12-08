package com.acm.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acm.utils.Method;



/**
* @author 计算机网络应用 路素飞 E-mail:2512977541@qq.com
* @version 创建时间：2017年11月16日 下午1:59:00
* 类说明
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-*.xml" })
public class DaoTest {
    
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		String md5 = Method.getMd5("0413150313", "lusufei");
		System.out.println(md5);
		
		System.out.println(Method.verify("0413150313", "1231", md5));
		
	}

}
