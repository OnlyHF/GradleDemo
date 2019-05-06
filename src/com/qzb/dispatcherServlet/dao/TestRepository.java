package com.qzb.dispatcherServlet.dao;

import com.qzb.dispatcherServlet.entity.TestEntity;

import java.util.List;

/**
 * test dao
 * 连接数据
 */
public interface TestRepository {

    List<TestEntity> findEntry(long max, int count);
}
