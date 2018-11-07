package com.demo.dao;

import com.demo.entity.RedDot;

import java.util.Collection;
import java.util.List;

/**
 * @author hejq
 * @date 2018-09-30 10:39
 */
public interface RedDotDao {

    /**
     * 通过id查询数据
     *
     * @param id
     * @return
     */
    RedDot findById(Long id);

    /**
     * 通过集合查询数据
     *
     * @param collection
     * @return
     */
    List<RedDot> findAll(Collection<?> collection);

    /**
     * 通过集合查询数据
     *
     * @return
     */
    List<RedDot> findAll();

    Object findAllList();
}
