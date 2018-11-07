package com.demo;

import com.demo.dao.RedDotDao;
import com.demo.entity.RedDot;
import com.demo.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author hejq
 * @date 2018-09-30 10:43
 */
public class RedDotTest {

    @Test
    public void findById() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSession();
            RedDotDao dotDao = sqlSession.getMapper(RedDotDao.class);
            RedDot dot = dotDao.findById(4103L);
            System.out.println(dot);
            Set<Long> idSet = new HashSet<>();
            idSet.add(4103L);
            idSet.add(4104L);
            idSet.add(4105L);
            idSet.add(4106L);
            idSet.add(4107L);
            idSet.add(4108L);
            List<RedDot> dotList = dotDao.findAll(idSet);
            System.out.println(dotList);

/*            List<RedDot> redDots = dotDao.findAll();
            System.out.println(redDots);*/
            sqlSession.commit();
        } catch (RuntimeException e) {
            System.out.println(e);
            if (null != sqlSession) {
                System.out.println("查询失败");
                sqlSession.rollback();
            } else {
                System.out.println(e);
            }
        } finally {
            if (null != sqlSession) {
                sqlSession.close();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
    }
}
