package com.dianbo.liu.springCrawler.mapper;

import java.util.List;

import com.dianbo.liu.springCrawler.crawler.chapter.ChapterDetail;

public interface ChapterDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChapterDetail record);

    int insertSelective(ChapterDetail record);

    ChapterDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChapterDetail record);

    int updateByPrimaryKey(ChapterDetail record);
  //批量插入
  	int insertChapterList(List<ChapterDetail> chapterDetails);
   //选择Urls通过book_id
	List<String> selectUrlsByBookId(String bookId);
}