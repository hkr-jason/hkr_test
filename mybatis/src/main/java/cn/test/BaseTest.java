package cn.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

public class BaseTest {
	protected SqlSession  session;
	
	
	@Before
	public void beforeClass(){
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			
			SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
			
			session = sqlSessionFactory.openSession();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
