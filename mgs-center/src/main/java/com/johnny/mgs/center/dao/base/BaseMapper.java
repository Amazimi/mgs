package com.johnny.mgs.center.dao.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.johnny.mgs.center.dao.db.WhereParams;


public interface BaseMapper<T, PK extends Serializable> {
	
	/**
	 * 新增
	 * @param t
	 * @return
	 */
	int insert(T t);
	
	/**
	 * 根据指定Id更新
	 * @param t
	 * @return
	 */
	int update(T t);
	
	/**
	 * 根据指定Id删除
	 * @param pk
	 * @return
	 */
	int deleteById(PK pk);
	
	/**
	 * 根据指定Id获取
	 * @param pk
	 * @return
	 */
	T getById(PK pk);
	
	/**
	 * 按条件查询列表
	 * @param params
	 * @return
	 */
	List<T> listByWhere(WhereParams params);

	/**
	 * 按条件更新
	 * @param t
	 * @param params
	 * @return
	 */
	int updateByWhere(T t, WhereParams params);
	
	/**
	 * 按条件删除
	 * @param params
	 * @return
	 */
	int deleteByWhere(WhereParams params);
	
	/**
	 * 按条件计数
	 * @param params
	 * @return
	 */
	int count(WhereParams params);

	/**
	 * 按条件分页查询
	 * @param params
	 * @return
	 */
	List<Map<String, Object>> listByWherePage(WhereParams params);
}
