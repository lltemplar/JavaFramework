package po;

public class User {
	private String name; 
    private Integer age; 
    
    public String getName() { 
       return name; 
    } 
    public void setName(String name) { 
       this.name = name; 
    } 
    public Integer getAge() { 
       return age; 
    } 
    public void setAge(Integer age) { 
       this.age = age; 
    } 
    public User(String name, Integer age) { 
       super(); 
       this.name = name; 
       this.age = age; 
    } 
    
    public User() { 
       super(); 
    }  //必须要有这个无参构造方法，不然根据UserMapper.xml中的配置，在查询数据库时，将不能反射构造出User实例 
}
