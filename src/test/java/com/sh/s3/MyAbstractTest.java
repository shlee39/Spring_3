package com.sh.s3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
public abstract class MyAbstractTest {

	//매번 @Runwith와 @Context~ 쓰기 귀찮아서 얘를 부모형태로 두고 갖다 쓰기 위해 추상클래스로...

}
