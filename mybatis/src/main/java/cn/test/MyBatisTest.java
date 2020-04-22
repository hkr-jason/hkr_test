package cn.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.mapper.PersonMapper;
import cn.pojo.Person;

public class MyBatisTest {
	
	
	@Test
	public void test2() throws IOException{
		String str = "mybatis-config.xml";
		InputStream input = Resources.getResourceAsStream(str);
		SqlSessionFactory factory  = new SqlSessionFactoryBuilder().build(input);
		
		SqlSession session = factory.openSession();
		
		PersonMapper personMapper = session.getMapper(PersonMapper.class);
		
		Person person = personMapper.GetUserByID(1);
		
		System.out.println(person);
		
		session.close();
		
	}
	
	@Test
	public void test1() throws IOException{
		String str = "mybatis-config.xml";
		InputStream input = Resources.getResourceAsStream(str);
		SqlSessionFactory factory  = new SqlSessionFactoryBuilder().build(input);
				
		SqlSession session = factory.openSession();
		//查询单个
		System.out.println(session.selectOne("Person.GetUserByID",4));
		/*//查询所有人员
		List<Person> list = session.selectList("Person.FindAll");
		
		for (Person person : list) {
			System.out.println(person);
		}*/
		session.close();
		
	}
}
