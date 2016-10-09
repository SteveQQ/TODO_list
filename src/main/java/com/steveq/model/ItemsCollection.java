package com.steveq.model;

import javax.swing.*;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import java.io.Serializable;
import java.util.*;

/**
 * Created by SteveQ on 2016-10-04.
 */
public class ItemsCollection implements Serializable {

    private ArrayList<ListItem> mToDoList;
    private ArrayList<ListItem> mDoneList;
    private DefaultListModel<ListItem> mTodoModel;
    private DefaultListModel<ListItem> mDoneModel;
    static final long serialVersionUID = 1L;

    public ItemsCollection(){
        mToDoList = new ArrayList<>();
        mDoneList = new ArrayList<>();
        mTodoModel = new DefaultListModel<>();
        mDoneModel = new DefaultListModel<>();
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

    public void updateTodoModel(){
        mTodoModel.clear();
        for(ListItem li : mToDoList){
            mTodoModel.addElement(li);
        }
    }

    public void updateDoneModel(){
        mDoneModel.clear();
        for(ListItem li : mDoneList){
            mDoneModel.addElement(li);
        }
    }

    public void sortTodo(){
        Collections.sort(mToDoList, new Comparator<ListItem>() {
            @Override
            public int compare(ListItem o1, ListItem o2) {
                return new Integer(o1.getPriority().ordinal()).compareTo(o2.getPriority().ordinal());
            }
        });
    }

    public DefaultListModel<ListItem> getTodoModel() {
        return mTodoModel;
    }

    public DefaultListModel<ListItem> getDoneModel() {
        return mDoneModel;
    }
}
