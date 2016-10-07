package com.steveq.model;

import javax.swing.*;
import java.io.Serializable;
import java.util.*;

/**
 * Created by SteveQ on 2016-10-04.
 */
public class ItemsCollection implements Serializable {

    private ArrayList<ListItem> mToDoList;
    private ArrayList<ListItem> mDoneList;
    static final long serialVersionUID = 1L;

    public ItemsCollection(){
        mToDoList = new ArrayList<>();
        mDoneList = new ArrayList<>();
    }

    public ArrayList<ListItem> getToDoList() {
        return mToDoList;
    }

    public void setToDoList(ArrayList<ListItem> toDoList) {
        mToDoList = toDoList;
    }

    public ArrayList<ListItem> getDoneList() {
        return mDoneList;
    }

    public void setDoneList(ArrayList<ListItem> doneList) {
        mDoneList = doneList;
    }


}
