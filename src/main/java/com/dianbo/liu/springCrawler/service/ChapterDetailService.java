package com.dianbo.liu.springCrawler.service;

import java.util.List;

import com.dianbo.liu.springCrawler.crawler.chapter.ChapterDetail;

public interface ChapterDetailService {
	public int insertChapterInfo(ChapterDetail chapterDetail);

	//批量插入
	public void insertChapterInfoList(List<ChapterDetail> chapterDetails);
}
