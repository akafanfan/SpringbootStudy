package com.fan.sb2;

import com.fan.sb2.ioc.ann.MyBeanImport;
import com.fan.sb2.ioc.xml.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@Import(MyBeanImport.class)
//@ContextConfiguration(locations = "classpath:ioc/demo.xml")
class Sb2ApplicationTests {

    @Autowired
    private HelloService helloService;

    @Test
    void contextLoads() {
    }

    @Test
    public void testHello() {
        System.out.println(helloService.hello());
    }

}
