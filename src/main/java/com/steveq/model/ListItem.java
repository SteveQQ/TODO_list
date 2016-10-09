package com.steveq.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        return mTitle + " | " + mPriority.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListItem listItem = (ListItem) o;

        return mTitle != null ? mTitle.equals(listItem.mTitle) : listItem.mTitle == null;

    }

    @Override
    public int hashCode() {
        int result = mTitle != null ? mTitle.hashCode() : 0;
        result = 31 * result + (mContent != null ? mContent.hashCode() : 0);
        result = 31 * result + (mPriority != null ? mPriority.hashCode() : 0);
        result = 31 * result + (int) (mTimeStamp ^ (mTimeStamp >>> 32));
        return result;
    }
}
