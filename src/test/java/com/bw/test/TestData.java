package com.bw.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.utils.IOUtils;
import com.bw.utils.StringUtil;
import com.zhaoxioaya.entity.Book;
import com.zhaoxioaya.mapper.BookMapper;

/**
 * @author zxy
 *
 * 2020年1月2日
 */
public class TestData {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookMapper mapper = ac.getBean(BookMapper.class);
		
		List<Object[]> list = IOUtils.readFile("a.txt", "\t");
		for (Object[] objects : list) {
			
			if (!StringUtil.judgeTelephoneIsOk(objects[3]+"")) {
				mapper.addError(Integer.parseInt(objects[0]+""), 0);
			}else if (!StringUtil.isNumber(objects[5]+"")) {
				mapper.addError(Integer.parseInt(objects[0]+""), 1);
			}else{
				Book book = new Book(Integer.parseInt(objects[0]+""), objects[1]+"", objects[2]+"", objects[3]+"", objects[4]+"", Integer.parseInt(objects[5]+""));
				mapper.addBook(book);
			}
			
		}
		
		
	}
	
}
