package com.dianbo.liu.springCrawler.mapper;

import com.dianbo.liu.springCrawler.crawler.search.SearchDetail;

public interface SearchDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(SearchDetail record);

    int insertSelective(SearchDetail record);

    SearchDetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SearchDetail record);

    int updateByPrimaryKey(SearchDetail record);
}