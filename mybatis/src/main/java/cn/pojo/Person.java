package cn.pojo;


 
public class Person {
	private int id;
	private String username;
	private String passwd;
	private String sex;
	private int age;
	@Override
	public String toString() {
		return "Person [id=" + id + ", username=" + username + ", passwd="
				+ passwd + ", sex=" + sex + ", age=" + age + "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(int id, String username, String passwd, String sex, int age) {
		super();
		this.id = id;
		this.username = username;
		this.passwd = passwd;
		this.sex = sex;
		this.age = age;
	}
	
}
