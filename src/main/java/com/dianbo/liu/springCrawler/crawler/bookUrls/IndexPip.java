package com.dianbo.liu.springCrawler.crawler.bookUrls;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import redis.clients.jedis.Jedis;

import com.dianbo.liu.springCrawler.common.util.filter.BookUrls;
import com.dianbo.liu.springCrawler.common.utils.RedisUtil;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.scheduler.SchedulerContext;
@PipelineName("indexPipeline")
public class IndexPip implements Pipeline<Index_model>{
	Logger Logger = LoggerFactory.getLogger(IndexPip.class);
	private  static Jedis Jedis = RedisUtil.getJedis();
	@Override
	public void process(Index_model bean) {
		  /*
	     * 过滤器部分,过滤非起点urls
	     */
	    List<String> urls = BookUrls.filterBookUrl_qidian(bean.getUrlsList());
	    if(urls !=null&&urls.size()>0){
	    	bean.setUrlsList(urls);
	    }
	    /*
		    * redis去重
		    */
		    synchronized (this) {
		    if(urls !=null&&urls.size()>0){
		    	for(String temp_url : urls){
		    		if(Jedis.get(temp_url)==null){
		    		
		    			//加入缓存
	    				Jedis.set(temp_url, "1");
	    				//加入爬取队列
	    				 SchedulerContext.into(bean.getRequest().subRequest(temp_url));
		    		}
		    	}
		    }
		    }
		    
		    
		    
		
	}

}
