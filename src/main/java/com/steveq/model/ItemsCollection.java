package com.steveq.model;

import javax.swing.*;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by SteveQ on 2016-10-04.
 */
public class ItemsCollection implements Serializable {

    private TreeSet<ListItem> mToDoList;
    private TreeSet<ListItem> mDoneList;
    static final long serialVersionUID = 1L;

    public ItemsCollection(){
        mToDoList = new TreeSet<>();
        mDoneList = new TreeSet<>();
    }

    public TreeSet<ListItem> getToDoList() {
        return mToDoList;
    }

    public void setToDoList(TreeSet<ListItem> toDoList) {
        mToDoList = toDoList;
    }

    public Set<ListItem> getDoneList() {
        return mDoneList;
    }

    public void setDoneList(TreeSet<ListItem> doneList) {
        mDoneList = doneList;
    }


}
