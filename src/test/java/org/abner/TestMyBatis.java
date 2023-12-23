package org.abner;

import org.abner.mapper.AssetsMapper;
import org.abner.pojo.Assets;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMyBatis {

    @Test
    public void testSelectAll() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        AssetsMapper mapper = sqlSession.getMapper(AssetsMapper.class);
        List<Assets> assets = mapper.selectAll();
        for (Assets asset : assets) {
            System.out.println(asset);
        }
        sqlSession.close();
    }
}
