package com.dianbo.liu.springCrawler.crawler.search;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Image;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;
@Gecco(matchUrl = "http://zhannei.baidu.com/cse/search?s=5513259216532962936&entry=1&q={serchName}", pipelines = { "consolePipeline", "searchPipeline" })
public class SearchInfo  implements HtmlBean{

	/**
	 * uuid
	 */
	private static final long serialVersionUID = 1L;
	@Request
	private HttpRequest request;
	@RequestParameter
	private String serchName;
	@HtmlField(cssPath = "#results > div.result-list > div:nth-child(1) > div.result-game-item-detail")
	private SearchDetail searchDetailsOne;
	@HtmlField(cssPath = "#results > div.result-list > div:nth-child(2) > div.result-game-item-detail")
	private SearchDetail searchDetailsTwo;
	@HtmlField(cssPath = "#results > div.result-list > div:nth-child(3) > div.result-game-item-detail")
	private SearchDetail searchDetailsThree;
	@Image
	@HtmlField(cssPath = "#results > div.result-list > div:nth-child(1) > div.result-game-item-pic > a > img")
	private String pitureOne;
	@Image
	@HtmlField(cssPath = "#results > div.result-list > div:nth-child(2) > div.result-game-item-pic > a > img")
	private String pitureTwo;
	@Image
	@HtmlField(cssPath = "#results > div.result-list > div:nth-child(3) > div.result-game-item-pic > a > img")
	private String pitureThree;
	public HttpRequest getRequest() {
		return request;
	}
	public void setRequest(HttpRequest request) {
		this.request = request;
	}
	public String getSerchName() {
		return serchName;
	}
	public void setSerchName(String serchName) {
		this.serchName = serchName;
	}
	public SearchDetail getSearchDetailsOne() {
		return searchDetailsOne;
	}
	public void setSearchDetailsOne(SearchDetail searchDetailsOne) {
		this.searchDetailsOne = searchDetailsOne;
	}
	public SearchDetail getSearchDetailsTwo() {
		return searchDetailsTwo;
	}
	public void setSearchDetailsTwo(SearchDetail searchDetailsTwo) {
		this.searchDetailsTwo = searchDetailsTwo;
	}
	public SearchDetail getSearchDetailsThree() {
		return searchDetailsThree;
	}
	public void setSearchDetailsThree(SearchDetail searchDetailsThree) {
		this.searchDetailsThree = searchDetailsThree;
	}
	
	public String getPitureOne() {
		return pitureOne;
	}
	public void setPitureOne(String pitureOne) {
		this.pitureOne = pitureOne;
	}
	public String getPitureTwo() {
		return pitureTwo;
	}
	public void setPitureTwo(String pitureTwo) {
		this.pitureTwo = pitureTwo;
	}
	public String getPitureThree() {
		return pitureThree;
	}
	public void setPitureThree(String pitureThree) {
		this.pitureThree = pitureThree;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "SearchInfo [request=" + request + ", serchName=" + serchName
				+ ", searchDetailsOne=" + searchDetailsOne
				+ ", searchDetailsTwo=" + searchDetailsTwo
				+ ", searchDetailsThree=" + searchDetailsThree + ", pitureOne="
				+ pitureOne + ", pitureTwo=" + pitureTwo + ", pitureThree="
				+ pitureThree + "]";
	}

	
}
