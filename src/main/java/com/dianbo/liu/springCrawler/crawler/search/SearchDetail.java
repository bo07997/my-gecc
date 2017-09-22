package com.dianbo.liu.springCrawler.crawler.search;

import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

public class SearchDetail implements HtmlBean{

	/**
	 * uuid
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	@HtmlField(cssPath = "h3 > a")
	private String bookName;
	@Href
	@HtmlField(cssPath = "h3 > a")
	private String bookUrl;

	private String instruction;
	@HtmlField(cssPath = "div > p:nth-child(1) > span:nth-child(2)")
	private String author;
	@HtmlField(cssPath = " div > p:nth-child(2) > span:nth-child(2)")
	private String category;
	@HtmlField(cssPath = " div > p:nth-child(3) > span:nth-child(2)")
	private String updateTime;
	@HtmlField(cssPath = " div > p:nth-child(4) > a")
	private String newChapterName;
	private String pitureUrl;
	@Href
	@HtmlField(cssPath = " div > p:nth-child(4) > a")
	private String newChapterurl;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookUrl() {
		return bookUrl;
	}
	public void setBookUrl(String bookUrl) {
		this.bookUrl = bookUrl;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getNewChapterName() {
		return newChapterName;
	}
	public void setNewChapterName(String newChapterName) {
		this.newChapterName = newChapterName;
	}
	public String getNewChapterurl() {
		return newChapterurl;
	}
	public void setNewChapterurl(String newChapterurl) {
		this.newChapterurl = newChapterurl;
	}
	
	public String getPitureUrl() {
		return pitureUrl;
	}
	public void setPitureUrl(String pitureUrl) {
		this.pitureUrl = pitureUrl;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "SearchDetail [id=" + id + ", bookName=" + bookName
				+ ", bookUrl=" + bookUrl + ", instruction=" + instruction
				+ ", author=" + author + ", category=" + category
				+ ", updateTime=" + updateTime + ", newChapterName="
				+ newChapterName + ", pitureUrl=" + pitureUrl
				+ ", newChapterurl=" + newChapterurl + "]";
	}


	
}
