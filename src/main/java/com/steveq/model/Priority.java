package com.steveq.model;

/**
 * Created by SteveQ on 2016-10-04.
 */
public enum Priority {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int mValue;

    Priority(int value){
        mValue = value;
    }

    public int getValue() {
        return mValue;
    }
}
