package com.johnny.mgs.center.dao.aop;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


public class MultiDataSource extends AbstractRoutingDataSource{
	
	private static final ThreadLocal<String> dataSourceKey = new ThreadLocal<String>();
	
    public  static void setDataSourceKey(String dataSource) {
        dataSourceKey.set(dataSource);
    }
    
    @Override
    protected Object determineCurrentLookupKey() {
        return dataSourceKey.get();
    }
    
    public static void clearDataSource() {
    	dataSourceKey.remove();
    }
}
