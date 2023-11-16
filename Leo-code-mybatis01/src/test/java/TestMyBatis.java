import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.javatop.mapper.UserMapper;
import org.javatop.pojo.User;
import org.junit.Test;

import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-17 9:55
 * @description : MyBatis基本开发测试
 */
public class TestMyBatis {

    /**
    * 用于测试: MyBatis基本开发的第一种方式
    */
    @Test
    public void test01() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = userMapper.selectUserList();

        for (User user : userList) {
            System.out.println("user = " + user);
        }
    }

    /**
    * 用于测试:MyBatis 基本开发的第二种方式
    */
    @Test
    public void test02() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> userList =  sqlSession.selectList("org.javatop.mapper.UserMapper.selectUserList");
        userList.forEach(System.out::println);
        sqlSession.insert("");
    }
}
