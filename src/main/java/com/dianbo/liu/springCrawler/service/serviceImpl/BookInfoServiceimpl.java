package com.dianbo.liu.springCrawler.service.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dianbo.liu.springCrawler.crawler.bookInfo.bookInfo;
import com.dianbo.liu.springCrawler.mapper.bookInfoMapper;
import com.dianbo.liu.springCrawler.service.BookInfoService;
import com.yyfq.commons.lang.idgenerator.IdUtils;
@Service
public class BookInfoServiceimpl implements BookInfoService {
	
	Logger Logger = LoggerFactory.getLogger(BookInfoServiceimpl.class);
	@Autowired
	private bookInfoMapper bookInfoMapper;
	


	@Override
	public int insertBookInfo(bookInfo book) {
		if(book==null){
			return -1;
		}
		//生成16位ID
		book.setBookId(IdUtils.genStringId());
		int result = 0;
		try {
			//简介超出
			if(book.getProductInstruction().length()>255){
				book.setProductInstruction(book.getProductInstruction().substring(0, 250)+"....");
			}
		    result  = bookInfoMapper.insertSelective(book);
		
		    Logger.info("【书籍信息】插入成功!");
		} catch (Exception e) {
			Logger.error("【书籍信息】插入错误!",e);
		}
		return 0;
	}
  
}
