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

    private HashSet<ListItem> mToDoList;
    private HashSet<ListItem> mDoneList;
    private DefaultListModel<ListItem> mTodoModel;
    private DefaultListModel<ListItem> mDoneModel;
    static final long serialVersionUID = 1L;

    public ItemsCollection(){
        mToDoList = new HashSet<>();
        mDoneList = new HashSet<>();
        mTodoModel = new DefaultListModel<>();
        mDoneModel = new DefaultListModel<>();
    }

    public HashSet<ListItem> getToDoList() {
        return mToDoList;
    }

    public void setToDoList(HashSet<ListItem> toDoList) {
        mToDoList = toDoList;
    }

    public HashSet<ListItem> getDoneList() {
        return mDoneList;
    }

    public void setDoneList(HashSet<ListItem> doneList) {
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
        List<ListItem> tempList = new ArrayList<>(mToDoList);
        Collections.sort(tempList, new Comparator<ListItem>() {
            @Override
            public int compare(ListItem o1, ListItem o2) {
                return new Integer(o1.getPriority().ordinal()).compareTo(o2.getPriority().ordinal());
            }
        });
        mToDoList.clear();;
        mToDoList.addAll(tempList);
    }

    public DefaultListModel<ListItem> getTodoModel() {
        return mTodoModel;
    }

    public DefaultListModel<ListItem> getDoneModel() {
        return mDoneModel;
    }

    public ListItem getElement(TreeSet set, ListItem li){
        Iterator it = set.iterator();
        ListItem next = null;
        while(it.hasNext()){
            next = (ListItem)it.next();
            if(next.equals(li)){
                break;
            }
        }
        return next;
    }
}
