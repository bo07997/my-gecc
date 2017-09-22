package com.dianbo.liu.springCrawler.crawler.search;

import com.dianbo.liu.springCrawler.common.utils.SpringContextUtil;
import com.dianbo.liu.springCrawler.service.SearchDetailService;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.yyfq.commons.lang.idgenerator.IdUtils;
@PipelineName("searchPipeline")
public class SearchPip implements Pipeline<SearchInfo>{

	@Override
	public void process(SearchInfo bean) {
		//获取bean
		SearchDetailService bookInfoServiceimpl = SpringContextUtil.getBean("searchDetailServiceImpl");
		
		//给piture url和id赋值
		if (bean.getSearchDetailsOne()!=null) {
			bean.getSearchDetailsOne().setPitureUrl(bean.getPitureOne());
			//id
			bean.getSearchDetailsOne().setId(IdUtils.genStringId());
			//简介
			bean.getSearchDetailsOne().setInstruction("QQ星小说网提供("
					+bean.getSearchDetailsOne().getAuthor()+ ")大神作品《"
							+bean.getSearchDetailsOne().getBookName()+ "》全文免费阅读,无弹窗！QQ星小说吧");
			//插入数据库
			bookInfoServiceimpl.insertBookInfo(bean.getSearchDetailsOne());
		}
		if (bean.getSearchDetailsTwo()!=null) {
			bean.getSearchDetailsTwo().setPitureUrl(bean.getPitureTwo());
			//id
			bean.getSearchDetailsTwo().setId(IdUtils.genStringId());
			//简介
			bean.getSearchDetailsTwo().setInstruction("QQ星小说网提供("
					+bean.getSearchDetailsTwo().getAuthor()+ ")大神作品《"
							+bean.getSearchDetailsTwo().getBookName()+ "》全文免费阅读,无弹窗！QQ星小说吧");
			//插入数据库
			bookInfoServiceimpl.insertBookInfo(bean.getSearchDetailsTwo());
		}
		if (bean.getSearchDetailsThree()!=null) {
			bean.getSearchDetailsThree().setPitureUrl(bean.getPitureThree());
			//id
			bean.getSearchDetailsThree().setId(IdUtils.genStringId());
			//简介
			bean.getSearchDetailsThree().setInstruction("QQ星小说网提供("
					+bean.getSearchDetailsThree().getAuthor()+ ")大神作品《"
							+bean.getSearchDetailsThree().getBookName()+ "》全文免费阅读,无弹窗！QQ星小说吧");
			//插入数据库
			bookInfoServiceimpl.insertBookInfo(bean.getSearchDetailsThree());
		}
		
	}

}
