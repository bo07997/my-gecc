package com.dianbo.liu.springCrawler.service.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dianbo.liu.springCrawler.crawler.chapter.ChapterDetail;
import com.dianbo.liu.springCrawler.mapper.ChapterDetailMapper;
import com.dianbo.liu.springCrawler.service.ChapterDetailService;
@Service
public class ChapterDetailImpl implements ChapterDetailService {

	Logger Logger = LoggerFactory.getLogger(ChapterDetailImpl.class);
	@Autowired
	private ChapterDetailMapper chapterDetailMapper;
	
	@Override
	public int insertChapterInfo(ChapterDetail chapterDetail) {
		
		return 0;
	}

	@Override
	public void insertChapterInfoList(List<ChapterDetail> chapterDetails) {

		chapterDetailMapper.insertChapterList(chapterDetails);
	}

}
