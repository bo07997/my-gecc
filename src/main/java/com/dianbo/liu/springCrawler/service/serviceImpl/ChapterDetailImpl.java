package com.dianbo.liu.springCrawler.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dianbo.liu.springCrawler.crawler.chapter.ChapterDetail;
import com.dianbo.liu.springCrawler.crawler.chapter.ChapterInfo;
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
	public void insertChapterInfoList(ChapterInfo chapterInfo) {

		//先从数据库查看已有章节的url(以url做比较)
		List<String> urlList = chapterDetailMapper.selectUrlsByBookId(chapterInfo.getBook_id());
		if (urlList == null) {
			chapterDetailMapper.insertChapterList(chapterInfo.getChapterDetails());
		}
		else {
			//比较结果
			List<ChapterDetail> chapterDetails = judgeUrls(chapterInfo.getChapterDetails(),urlList);
			chapterDetailMapper.insertChapterList(chapterDetails);
		}
	
	}

	//判断数据库章节的重复，从后往前
	private List<ChapterDetail> judgeUrls(List<ChapterDetail> chapterDetails,
			List<String> urlList) {

		//临时
		List<ChapterDetail> resultcChapterDetails1 = new ArrayList<ChapterDetail>();
		//最终
		List<ChapterDetail> resultcChapterDetails2 = new ArrayList<ChapterDetail>();
		boolean resultTag = false;//循环是否结束
		for(int i=chapterDetails.size()-1;i>=0;i--){
			for(int j=urlList.size()-1;j>=0;j--){
				
				if(chapterDetails.get(i).getChapterUrl().equals(urlList.get(j))){
					resultTag = true;
					break;
				}else {
					if (j==0) {
						resultcChapterDetails1.add(chapterDetails.get(i));
					}
					
				}
				
			}
			if(resultTag == true){
				break;
			}
		}
		//调转顺序
		if(resultcChapterDetails1!=null){
			for(int i=resultcChapterDetails1.size()-1;i>=0;i--){
				resultcChapterDetails2.add(resultcChapterDetails1.get(i));
			}
		}
		
		return resultcChapterDetails2;
	}
	
	

}
