package com.moviepsycho.javabrains.messenger.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private long id;
	//@XmlElement(name="MessageText")
	private String message;
	private Date date;
	private String author;
	private Map<Long,Comment> comments = new HashMap();
	
	public Message()
	{
		
	}
	
	public Message(long id, String message,  String author) {
		super();
		this.id = id;
		this.message = message;
		this.date = new Date();
		this.author = author;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Map<Long,Comment> getComments()
	{
		return this.comments;
	}
	
	public void SetComment(Map<Long,Comment> comments)
	{
		this.comments = comments;
	}
}
