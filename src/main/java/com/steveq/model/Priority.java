package com.steveq.model;

import java.io.Serializable;

/**
 * Created by SteveQ on 2016-10-04.
 */
public enum Priority implements Serializable{

    HIGH("HIGH"),
    MEDIUM("MEDIUM"),
    LOW("LOW");

    private String mValue;

    Priority(String value){
        mValue = value;
    }

    public String getValue() {
        return mValue;
    }

}
