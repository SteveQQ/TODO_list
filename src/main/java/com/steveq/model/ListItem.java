package com.steveq.model;

import java.io.Serializable;

/**
 * Created by SteveQ on 2016-10-04.
 */
public class ListItem implements Comparable,Serializable {

    private String mTitle;
    private String mContent;
    private Priority mPriority;
    private long mTimeStamp;

    public ListItem(String title, String content, Priority priority, long time){
        mTitle = title;
        mContent = content;
        mPriority = priority;
        mTimeStamp = time;
    }

    public String getTitle() {
        return mTitle;
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

    @Override
    public String toString() {
        return mTitle;
    }
}
