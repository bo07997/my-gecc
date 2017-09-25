package com.dianbo.liu.springCrawler.mapper;


import com.dianbo.liu.springCrawler.crawler.bookInfo.bookInfo;

public interface BookInfoMapper {
    int deleteByPrimaryKey(String bookId);

    int insert(bookInfo record);

    int insertSelective(bookInfo record);

    bookInfo selectByPrimaryKey(String bookId);

    int updateByPrimaryKeySelective(bookInfo record);

    int updateByPrimaryKey(bookInfo record);
}