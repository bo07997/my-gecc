package com.dianbo.liu.springCrawler.crawler.chapter;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.spider.HtmlBean;
@Gecco(matchUrl = "http://www.23us.so/files/article/html/1/{none}/index.html?{book_id}", pipelines = { "consolePipeline", "chapterPipeline" })
public class ChapterInfo implements HtmlBean{

	/**
	 * UUID
	 */
	private static final long serialVersionUID = 1L;
	@HtmlField(cssPath = "#at > tbody>*>*")
	private List<ChapterDetail> chapterDetails;
	@RequestParameter
	private String book_id;
	
	public List<ChapterDetail> getChapterDetails() {
		return chapterDetails;
	}
	public void setChapterDetails(List<ChapterDetail> chapterDetails) {
		this.chapterDetails = chapterDetails;
	}
	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ChapterInfo [ChapterDetails=" + chapterDetails + ", book_id="
				+ book_id + "]";
	}
	
	

}
