package com.moviepsycho.javabrains.messenger.beans;

import javax.ws.rs.QueryParam;

public class MessageFilterBean {

	private @QueryParam("year") int year;
	 private @QueryParam("start") int start;
	 private @QueryParam("size") int size;
	 
	 public MessageFilterBean()
	 {
		 start=-1;
		 size=-1;
	 }
	 
	public MessageFilterBean(int year, int start, int size) {
		super();
		this.year = year;
		this.start = start;
		this.size = size;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int siz) {
		this.size = size;
	} ;
}
