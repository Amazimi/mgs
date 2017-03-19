package com.johnny.mgs.center.dao.base;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import com.johnny.mgs.center.dao.aop.DataSource;

@Component
public class MapperSupport {

	@Resource(name = "sqlSessionTemplate")
	protected SqlSessionTemplate sqlSessionTemplate;

	@SuppressWarnings("unchecked")
	@DataSource(DataSource.slave)
	public <T extends Object> T selectOne(String statement) {
		T selectOne = (T) sqlSessionTemplate.selectOne(statement);
		return selectOne;
	}

	@SuppressWarnings("unchecked")
	@DataSource(DataSource.slave)
	public <T extends Object> T selectOne(String statement, Object parameter) {
		T selectOne = (T) sqlSessionTemplate.selectOne(statement, parameter);
		return selectOne;
	}

    @DataSource(DataSource.slave)
	public <E extends Object> List<E> selectList(String statement) {
		List<E> selectList = sqlSessionTemplate.selectList(statement);
		return selectList;
	}

	@DataSource(DataSource.slave)
	public <E extends Object> List<E> selectList(String statement,
			Object parameter) {
		List<E> selectList = sqlSessionTemplate.selectList(statement, parameter);
		return selectList;
	}

	@DataSource(DataSource.slave)
	public <K extends Object, V extends Object> Map<K, V> selectMap(
			String statement, String mapKey) {
		Map<K, V> selectMap = sqlSessionTemplate.selectMap(statement, mapKey);
		return selectMap;
	}

	@DataSource(DataSource.slave)
	public <K extends Object, V extends Object> Map<K, V> selectMap(
			String statement, Object parameter, String mapKey) {
		Map<K, V> selectMap = sqlSessionTemplate.selectMap(statement, parameter,
				mapKey);
		return selectMap;
	}

	@DataSource(DataSource.master)
	public int insert(String statement) {
		return sqlSessionTemplate.insert(statement);
	}
	
	@DataSource(DataSource.master)
	public int insert(String statement, Object parameter) {
		return sqlSessionTemplate.insert(statement, parameter);
	}
	
	@DataSource(DataSource.master)
	public int update(String statement) {
		return sqlSessionTemplate.update(statement);
	}

	@DataSource(DataSource.master)
	public int update(String statement, Object parameter) {
		return sqlSessionTemplate.update(statement, parameter);
	}

	@DataSource(DataSource.master)
	public int delete(String statement) {
		return sqlSessionTemplate.delete(statement);
	}

	@DataSource(DataSource.master)
	public int delete(String statement, Object parameter) {
		return sqlSessionTemplate.delete(statement, parameter);
	}

	@DataSource(DataSource.master)
	public void commit() {
		sqlSessionTemplate.commit();
	}

	@DataSource(DataSource.master)
	public void commit(boolean force) {
		sqlSessionTemplate.commit(force);
	}

	@DataSource(DataSource.master)
	public void rollback() {
		sqlSessionTemplate.rollback();
	}

	@DataSource(DataSource.master)
	public void rollback(boolean force) {
		sqlSessionTemplate.rollback(force);
	}

	@DataSource(DataSource.master)
	public List<BatchResult> flushStatements() {
		return sqlSessionTemplate.flushStatements();
	}

	public void close() {
		sqlSessionTemplate.close();
	}
	
	public void clearCache() {
		sqlSessionTemplate.clearCache();
	}
	
	public Configuration getConfiguration() {
		return sqlSessionTemplate.getConfiguration();
	}

	@DataSource(DataSource.slave)
	public <T extends Object> T getMapper(Class<T> type) {
		return (T) sqlSessionTemplate.getMapper(type);
	}

	public Connection getConnection() {
		return sqlSessionTemplate.getConnection();
	}

	@DataSource(DataSource.slave)
	public void select(String statement, ResultHandler handler) {
		sqlSessionTemplate.select(statement, handler);

	}

	@DataSource(DataSource.slave)
	public void select(String statement, Object parameter, ResultHandler handler) {
		sqlSessionTemplate.select(statement, parameter, handler);

	}

	@DataSource(DataSource.slave)
	public void select(String statement, Object parameter, RowBounds rowBounds,
			ResultHandler handler) {
		sqlSessionTemplate.select(statement, parameter, rowBounds, handler);

	}
	
	@DataSource(DataSource.slave)
	public <E> List<E> selectList(String statement, Object parameter,
			RowBounds rowBounds) {
		List<E> selectList = sqlSessionTemplate.selectList(statement, parameter,
				rowBounds);
		return selectList;
	}
	
	@DataSource(DataSource.slave)
	public <K, V> Map<K, V> selectMap(String statement, Object parameter,
			String mapKey, RowBounds rowBounds) {
		Map<K, V> selectMap = sqlSessionTemplate.selectMap(statement, parameter,
				mapKey, rowBounds);
		return selectMap;
	}
	
}
