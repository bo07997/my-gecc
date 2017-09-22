package mySpringCrawler.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dianbo.liu.springCrawler.crawler.search.SearchDetail;
import com.dianbo.liu.springCrawler.service.SearchDetailService;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by codingBoy on 16/11/27.
 * 配置spring和junit整合，这样junit在启动时就会加载spring容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml",
"classpath:spring/spring-service.xml"})
public class SeckillDaoTest {

    //注入Dao实现类依赖
    @Resource
    private SearchDetailService seckillDao;


    @Test
    public void queryById() throws Exception {
        long seckillId=1;
        
     int seckill=seckillDao.insertBookInfo(new SearchDetail());
        System.out.println(seckill);
    }



}