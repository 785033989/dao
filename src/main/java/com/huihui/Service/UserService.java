package com.huihui.Service;

import com.huihui.dao.UserMapper;
import com.huihui.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author zhazhahui
 * @create 2021-07-29 9:45
 */
public class UserService {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findById(1);
        System.out.println(user);
        //List<User> all = mapper.findAll();
        //System.out.println(all);


    }
}
