package com.zhaoxioaya.entity;

/**
 * @author zxy
 *
 * 2020年1月2日
 */
public class Book {

	private Integer bid;
	private String bname;
	private String	tid;
	private String phone;
	private String author;
	private Integer popular;
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getPopular() {
		return popular;
	}
	public void setPopular(Integer popular) {
		this.popular = popular;
	}
	public Book(Integer bid, String bname, String tid, String phone, String author, Integer popular) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.tid = tid;
		this.phone = phone;
		this.author = author;
		this.popular = popular;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", tid=" + tid + ", phone=" + phone + ", author=" + author
				+ ", popular=" + popular + "]";
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
