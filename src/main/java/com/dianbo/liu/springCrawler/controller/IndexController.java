package com.dianbo.liu.springCrawler.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dianbo.liu.springCrawler.crawler.bookInfo.BookPip;



@Controller
@RequestMapping("index")
public class IndexController {

	@Resource
	private BookPip bookPip;
	/**
	 * 首页
	 */
	@RequestMapping
	public String index() {
		return "index";
	}

}
