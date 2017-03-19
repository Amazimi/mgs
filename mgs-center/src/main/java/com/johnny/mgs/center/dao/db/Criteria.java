package com.johnny.mgs.center.dao.db;

import java.util.ArrayList;
import java.util.List;

import com.johnny.mgs.center.dao.db.type.OperateType;

public class Criteria {

	protected List<Criterion> criterions;
	
	public Criteria(){
		criterions = new ArrayList<Criterion>();
	}
	
    public boolean isValid() {
        return criterions.size() > 0;
    }
    
    public List<Criterion> getCriterions() {
		return criterions;
	}
    
    private String getCondition(String property, OperateType operateType){
    	return property + " " + operateType.operater;
    }
    
    public Criteria addIsNullCriterion(String property){
    	return addCriterion(property, OperateType.ISNULL);
    }
    
    public Criteria addIsNotNotNullCriterion(String property){
    	return addCriterion(property, OperateType.ISNOTNULL);
    }
    
    public Criteria addEqCriterion(String property, Object value){
    	return addCriterion(property, OperateType.EQ, value);
    }

	protected Criteria addCriterion(String property, OperateType operateType) {
        criterions.add(new Criterion(getCondition(property, operateType)));
        return this;
    }

    protected Criteria addCriterion(String property, OperateType operateType, Object value) {
        criterions.add(new Criterion(getCondition(property, operateType), value));
        return this;
    }

    protected Criteria addBetweenCriterion(String property, OperateType operateType, Object value1, Object value2) {
        if (value1 == null || value2 == null) {
            throw new RuntimeException("Between values for " + property + " cannot be null");
        }
        criterions.add(new Criterion(getCondition(property, operateType), value1, value2));
        return this;
    }
}
