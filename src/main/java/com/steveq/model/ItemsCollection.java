package com.steveq.model;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by SteveQ on 2016-10-04.
 */
public class ItemsCollection implements Serializable {

    private Set<ListItem> mToDoList;
    private Set<ListItem> mDoneList;
    static final long serialVersionUID = 1L;

    public ItemsCollection(){
        mToDoList = new TreeSet<ListItem>(new Comparator<ListItem>() {
            public int compare(ListItem li1, ListItem li2) {
                return li1.getPriority().compareTo(li2.getPriority());
            }
        });
        mDoneList = new TreeSet<ListItem>((li1, li2) -> li1.getPriority().compareTo(li2.getPriority()));
    }

    class ItemsCompare implements Comparator<ListItem> {
        public int compare(ListItem li1, ListItem li2){
            return li1.getPriority().compareTo(li2.getPriority());
        }
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
