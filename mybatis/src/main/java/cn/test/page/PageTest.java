package cn.test.page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import cn.mapper.PersonMapper;
import cn.pojo.Person;
import cn.test.BaseTest;

public class PageTest extends BaseTest{
	
	@Test
	public void testPage(){
		
		int curr = 1,page = 2;
		
		PersonMapper mapper = session.getMapper(PersonMapper.class);
		
		List<Person> list = mapper.FindAll();
		
		int first = (curr - 1) * page;
		
		int end = curr * page;
		
		List<Person> list2 = list.subList(first,end);
		
		System.out.println(list2);
		
	}
	
	@Test
	public void testPage1(){
		Map<String,Object> map  = new HashMap<String,Object>();
		
		int curr = 1,page = 2;
		
		map.put("curr", (curr-1)*page);
		map.put("page", page);
		
		
		PersonMapper mapper = session.getMapper(PersonMapper.class);
		
		List<Person> list = mapper.FindAllBySql(map);
		
		System.out.println(list);
	}
}
