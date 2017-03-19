package com.johnny.mgs.center.dao.db;

import java.util.ArrayList;
import java.util.List;


public class WhereParams {
	
	protected List<Criteria> criteriaList;

	public WhereParams() {
		this.criteriaList = new ArrayList<Criteria>();
	}

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (criteriaList.size() == 0) {
        	criteriaList.add(criteria);
        }
        return criteria;
    }
    
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

	public List<Criteria> getCriteriaList() {
		return criteriaList;
	}

	public void setCriteriaList(List<Criteria> criteriaList) {
		this.criteriaList = criteriaList;
	}
	
}
