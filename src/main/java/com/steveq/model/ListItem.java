package com.steveq.model;

import java.io.Serializable;

/**
 * Created by SteveQ on 2016-10-04.
 */
public class ListItem implements Comparable,Serializable {

    private String mContent;
    private Priority mPriority;
    private long mTimeStamp;

    public ListItem(String content, Priority priority, long time){
        mContent = content;
        mPriority = priority;
        mTimeStamp = time;
    }

    public String getContent() {
        return mContent;
    }

    public Priority getPriority() {
        return mPriority;
    }

    public long getTimeStamp() {
        return mTimeStamp;
    }

    public int compareTo(Object o){
        ListItem li = (ListItem) o;
        return (this.mPriority.compareTo(li.mPriority));
    }
}
