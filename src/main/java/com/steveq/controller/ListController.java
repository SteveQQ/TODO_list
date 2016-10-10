package com.steveq.controller;

import com.steveq.model.ItemsCollection;
import com.steveq.model.ListItem;
import com.steveq.model.Priority;

import java.io.*;
import java.util.*;

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

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
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
        mCollection.sortTodo();
        mCollection.updateTodoModel();
    }

    public void makeItemDone(List<ListItem> li){
        for(ListItem el : li){
            mCollection.getToDoList().remove(el);
            mCollection.getDoneList().add(el);
            mCollection.updateDoneModel();
            mCollection.updateTodoModel();
        }
    }

    public void makeItemTodo(List<ListItem> li){
        for(ListItem el : li){
            mCollection.getDoneList().remove(el);
            mCollection.getToDoList().add(el);
            mCollection.updateDoneModel();
            mCollection.updateTodoModel();
        }
    }

    public void removeItem(HashSet<ListItem> collection, List<ListItem> li){
        for(ListItem el : li) {
            collection.remove(el);
            mCollection.updateDoneModel();
            mCollection.updateTodoModel();
        }
    }

    public void saveList() throws IOException{

        System.out.println(System.getProperty("user.dir"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(mCollection);
        oos.close();
    }

    public void loadList() throws IOException, ClassNotFoundException{

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        ItemsCollection loaded = (ItemsCollection)ois.readObject();
        mCollection.setToDoList(loaded.getToDoList());
        mCollection.setDoneList(loaded.getDoneList());
        mCollection.updateDoneModel();
        mCollection.updateTodoModel();
        System.out.println("loaded");
        ois.close();
    }
}
