package com.zhaoxioaya.mapper;

import org.apache.ibatis.annotations.Param;

import com.zhaoxioaya.entity.Book;

/**
 * @author zxy
 *
 * 2020年1月2日
 */
public interface BookMapper {

	void addError(@Param("bid")Integer bid,@Param("errorinfo")Integer errorinfo);
	
	void addBook(Book book);
}
