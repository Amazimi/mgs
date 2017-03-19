package com.johnny.mgs.center.dao.db.type;

public enum PredictionType {
    AND("AND"),
    OR("OR");

    public final String value;

    PredictionType(String value) {
        this.value = value;
    }
}
