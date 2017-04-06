package com.oneillrpp.repositories;

import com.oneillrpp.SpringbootGuruProjectApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/*
    @Author: oneillRPP
*/

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootGuruProjectApplication.class)
@WebAppConfiguration
public class ProductRepositoryTest {

    @Test
    public void contextLoads() {
    }



}
