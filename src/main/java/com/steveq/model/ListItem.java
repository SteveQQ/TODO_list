package com.steveq.model;

/**
 * Created by SteveQ on 2016-10-04.
 */
public class ListItem {

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
}
