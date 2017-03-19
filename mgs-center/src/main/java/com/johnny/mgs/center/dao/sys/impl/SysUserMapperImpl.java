package com.johnny.mgs.center.dao.sys.impl;

import org.springframework.stereotype.Component;

import com.johnny.mgs.center.dao.base.impl.BaseMapperImpl;
import com.johnny.mgs.center.dao.sys.SysUserMapper;
import com.johnny.mgs.model.sys.SysUser;

/**
 * Created by johnny on 03/19/2017.
 */
 
@Component
public class SysUserMapperImpl extends BaseMapperImpl<SysUser, Long> implements SysUserMapper {
	private static final String NAMESPACE = "com.johnny.mgs.center.dao.sys.SysUserMapper.";
	
	@Override
	public String getMapperNamespace(String state) {
		 return NAMESPACE + state;
	}
}