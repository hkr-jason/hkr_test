package cn.mapper;

import java.util.List;
import java.util.Map;

import cn.pojo.Person;

public interface PersonMapper {
	public List<Person> FindAll();
	
	public Person GetUserByID(int id);
	
	public List<Person> FindAllBySql(Map<String ,Object> data);
}
