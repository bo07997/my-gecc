package com.dianbo.liu.springCrawler.crawler.chapter;

import com.dianbo.liu.springCrawler.common.utils.SpringContextUtil;
import com.dianbo.liu.springCrawler.service.ChapterDetailService;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
@PipelineName("chapterPipeline")
public class ChapterPip implements Pipeline<ChapterInfo>{

	@Override
	public void process(ChapterInfo bean) {
		//获取bean
		ChapterDetailService chapterDetailService = SpringContextUtil.getBean("chapterDetailImpl");
		//为书本ID赋值
		String bookID = bean.getBook_id();
		if(bookID!=null){
		for(ChapterDetail temp:bean.getChapterDetails()){
		temp.setBookId(bookID);
	         }
	 	}
		//插入数据库
		chapterDetailService.insertChapterInfoList(bean.getChapterDetails());
		
		
		
 }
}