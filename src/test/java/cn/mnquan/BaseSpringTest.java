package cn.mnquan;

import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 标题<br>
 * User: wangkecheng Date: 2018/8/30
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
//@Transactional(transactionManager = "transactionManager")
public class BaseSpringTest extends Thread{

}
