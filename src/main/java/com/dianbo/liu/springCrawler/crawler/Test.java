package com.dianbo.liu.springCrawler.crawler;
import java.util.ArrayList;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.request.HttpGetRequest;
import com.geccocrawler.gecco.request.HttpRequest;

public class Test implements Job {
	public static void main(String[] args) {
	//HttpRequest aHttpRequest1=	new HttpGetRequest("http://zhannei.baidu.com/cse/search?s=5513259216532962936&entry=1&q=大主宰");
		HttpRequest aHttpRequest1=	new HttpGetRequest("https://book.qidian.com/info/1005392714");
	List<HttpRequest> requests = new ArrayList<HttpRequest>() ;
	requests.add(aHttpRequest1);
		GeccoEngine.create().classpath("com.dianbo.liu.springCrawler.crawler.search").thread(1)
		.interval(1000).start(requests).loop(false)
		.run();
	}

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		//HttpRequest aHttpRequest1=	new HttpGetRequest("http://www.qidian.com/");
		HttpRequest aHttpRequest1=	new HttpGetRequest("http://zhannei.baidu.com/cse/search?s=5513259216532962936&entry=1&q=大主宰");
		List<HttpRequest> requests = new ArrayList<HttpRequest>() ;
		requests.add(aHttpRequest1);
			GeccoEngine.create().classpath("com.dianbo.liu.springCrawler.crawler.search").thread(1)
			.interval(1000).start(requests).loop(false)
			.run();		
	}
    
}
