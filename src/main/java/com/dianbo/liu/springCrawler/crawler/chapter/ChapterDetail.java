package com.dianbo.liu.springCrawler.crawler.chapter;

import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

public class ChapterDetail implements HtmlBean{
	/**
	 * UUID
	 */
	private static final long serialVersionUID = 1L;
	//自增ID
    private Integer id;
    //书本ID，通过赋值
    private String bookId;
    //章节名 #at > tbody > tr:nth-child(1) > td:nth-child(1) > a
    @HtmlField(cssPath = "a")
    private String chapterName;
    //章节url
    @Href  
    @HtmlField(cssPath = " a")
    private String chapterUrl;
    //暂定
    private String sortTag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId == null ? null : bookId.trim();
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName == null ? null : chapterName.trim();
    }

    public String getChapterUrl() {
        return chapterUrl;
    }

    public void setChapterUrl(String chapterUrl) {
        this.chapterUrl = chapterUrl == null ? null : chapterUrl.trim();
    }

    public String getSortTag() {
        return sortTag;
    }

    public void setSortTag(String sortTag) {
        this.sortTag = sortTag == null ? null : sortTag.trim();
    }
}