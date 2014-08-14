import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import po.User;
import po.UserMapper;
import util.MyBatisUtil;

public class Main {
	public static void main(String[] args) {
		System.out.println("start....");
		SqlSessionFactory sqlSessionFactory = MyBatisUtil
				.getSqlSessionFactory();
		System.out.println("start2....");
		SqlSession sqlSession = sqlSessionFactory.openSession();
		System.out.println("start3....");
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = new User("tom", new Integer(51));
			userMapper.insertUser(user);
			sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
			System.out.println("commit success");
			
			user = new User("lili", new Integer(51));
			userMapper.insertUser(user);
			sqlSession.commit();
			System.out.println("commit success2");
		} 
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			sqlSession.close();
		}
	}
}
