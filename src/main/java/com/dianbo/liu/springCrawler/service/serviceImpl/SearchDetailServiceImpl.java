package com.dianbo.liu.springCrawler.service.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dianbo.liu.springCrawler.crawler.search.SearchDetail;
import com.dianbo.liu.springCrawler.mapper.SearchDetailMapper;
import com.dianbo.liu.springCrawler.mapper.BookInfoMapper;
import com.dianbo.liu.springCrawler.service.SearchDetailService;
@Service
public class SearchDetailServiceImpl implements SearchDetailService {
	Logger Logger = LoggerFactory.getLogger(SearchDetailServiceImpl.class);
	@Autowired
	private SearchDetailMapper searchDetailMapper;
	@Override
	public int insertBookInfo(SearchDetail bookDetail) {
		int result =0;
		try {
			result = searchDetailMapper.insertSelective(bookDetail);
		} catch (Exception e) {
			Logger.error(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>【searchBookInfo】插入错误！");
		}
	
		return result;
		
	}

	

}
