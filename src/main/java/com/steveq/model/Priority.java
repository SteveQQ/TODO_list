package com.steveq.model;

import java.io.Serializable;

/**
 * Created by SteveQ on 2016-10-04.
 */
public enum Priority implements Serializable{
    LOW("LOW"),
    MEDIUM("MEDIUM"),
    HIGH("HIGH");

    private String mValue;

    Priority(String value){
        mValue = value;
    }

    public String getValue() {
        return mValue;
    }

}
