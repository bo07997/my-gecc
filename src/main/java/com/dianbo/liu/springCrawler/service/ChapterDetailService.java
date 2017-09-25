package com.dianbo.liu.springCrawler.service;

import com.dianbo.liu.springCrawler.crawler.chapter.ChapterDetail;
import com.dianbo.liu.springCrawler.crawler.chapter.ChapterInfo;

public interface ChapterDetailService {
	public int insertChapterInfo(ChapterDetail chapterDetail);

	//批量插入,选择性
	public void insertChapterInfoList(ChapterInfo chapterInfo);
}
