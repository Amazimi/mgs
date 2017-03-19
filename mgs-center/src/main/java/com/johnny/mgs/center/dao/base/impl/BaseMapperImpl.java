package com.johnny.mgs.center.dao.base.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;

import com.johnny.mgs.center.dao.base.BaseMapper;
import com.johnny.mgs.center.dao.base.MapperSupport;
import com.johnny.mgs.center.dao.db.WhereParams;

public abstract class BaseMapperImpl<T, PK extends Serializable> implements BaseMapper<T, PK> {

	@Autowired
	protected MapperSupport mapperSupport;
	
	public abstract String getMapperNamespace(String state);
	
	@Override
	public int insert(T t) {
		return mapperSupport.insert(getMapperNamespace("insert"), t);
	}

	@Override
	public int update(T t) {
		return mapperSupport.update(getMapperNamespace("update"), t);
	}

	@Override
	public int deleteById(PK pk) {
		return mapperSupport.delete(getMapperNamespace("deleteById"), pk);
	}

	@Override
	public T getById(PK pk) {
		return mapperSupport.selectOne(getMapperNamespace("getById"), pk);
	}

	@Override
	public List<T> listByWhere(WhereParams params) {
		Map<String, Object> map = null;
		if(params != null){
			map = new ConcurrentHashMap<String, Object>();
			map.put("params", params);
		}
		return mapperSupport.selectList(getMapperNamespace("listByWhere"), map);
	}

	@Override
	public int updateByWhere(T t, WhereParams params) {
		Map<String, Object> map = new ConcurrentHashMap<String, Object>();
		map.put("entity", t);
		map.put("params", params);
		return mapperSupport.update(getMapperNamespace("updateByWhere"), map);
	}

	@Override
	public int count(WhereParams params) {
		Map<String, Object> map = null;
		if(params != null){
			map = new ConcurrentHashMap<String, Object>();
			map.put("params", params);
		}
		return mapperSupport.selectOne(getMapperNamespace("count"), map);
	}

	@Override
	public int deleteByWhere(WhereParams params) {
		Map<String, Object> map = null;
		if(params != null){
			map = new ConcurrentHashMap<String, Object>();
			map.put("params", params);
		}
		return mapperSupport.update(getMapperNamespace("deleteByWhere"), map);
	}
	
	@Override
	public List<Map<String, Object>> listByWherePage(WhereParams params){
		Map<String, Object> map = null;
		if(params != null){
			map = new ConcurrentHashMap<String, Object>();
			map.put("params", params);
		}
		return mapperSupport.selectList(getMapperNamespace("listByWherePage"), map);
	}

}
