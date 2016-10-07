package com.steveq.controller;

import com.steveq.model.ItemsCollection;
import com.steveq.model.ListItem;
import com.steveq.model.Priority;

import java.io.*;
import java.util.Set;

/**
 * Created by SteveQ on 2016-10-04.
 */
public class ListController{

    private static ListController mInstance;
    private ItemsCollection mCollection;
    private File file;

    private ListController(){
        mCollection = new ItemsCollection();
        file = new File(System.getProperty("user.dir") + "/test");
    }

    public static ListController getInstance(){
        if(mInstance == null){
            mInstance = new ListController();
        }
        return mInstance;
    }

    public ItemsCollection getCollection() {
        return mCollection;
    }

    public void createNewItem(String title, String content, Priority priority, long time){
        mCollection.getToDoList().add(new ListItem(title, content, priority, time));
    }


    public void makeItemDone(ListItem li){
        mCollection.getToDoList().remove(li);
        mCollection.getDoneList().add(li);
    }

    public void makeItemTodo(ListItem li){
        mCollection.getDoneList().remove(li);
        mCollection.getToDoList().add(li);
    }

    public void removeItem(Set<ListItem> collection, ListItem li){
        collection.remove(li);
    }

    public void saveList() throws IOException{

        System.out.println(System.getProperty("user.dir"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(mCollection);
        oos.close();
    }

    public void loadList() throws IOException, ClassNotFoundException{

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        mCollection = (ItemsCollection)ois.readObject();
        ois.close();
    }
}
