package com.steveq.model;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by SteveQ on 2016-10-04.
 */
public class ItemsCollection implements Serializable {

    private Set<ListItem> mToDoList;
    private Set<ListItem> mDoneList;
    static final long serialVersionUID = 1;

    public ItemsCollection(){
        mToDoList = new TreeSet<ListItem>();
        mDoneList = new TreeSet<ListItem>();
    }

    public Set<ListItem> getToDoList() {
        return mToDoList;
    }

    public void setToDoList(Set<ListItem> toDoList) {
        mToDoList = toDoList;
    }

    public Set<ListItem> getDoneList() {
        return mDoneList;
    }

    public void setDoneList(Set<ListItem> doneList) {
        mDoneList = doneList;
    }
}
