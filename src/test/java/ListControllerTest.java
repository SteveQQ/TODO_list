import com.steveq.controller.ListController;
import com.steveq.model.Priority;
import org.junit.Assert;
import org.junit.Test;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by SteveQ on 2016-10-04.
 */
public class ListControllerTest {

    private ListController lcontr = ListController.getInstance();
    File file = new File(System.getProperty("user.dir")+"/test");

    @Test
    public void fieldsTest(){
        Assert.assertTrue(lcontr != null);
        Assert.assertNotNull(lcontr.getCollection());
    }

    @Test
    public void newItemTest(){
        lcontr.createNewItem("Hello world", Priority.LOW, 1475591365);
        Assert.assertTrue(lcontr.getCollection().getToDoList().size() > 0);
        clearLists();
    }

    @Test
    public void moveToDoneTest(){
        lcontr.createNewItem("Hello world", Priority.LOW, 1475591365);
        lcontr.makeItemDone(lcontr.getCollection().getToDoList().iterator().next());
        Assert.assertTrue(lcontr.getCollection().getDoneList().size() > 0 && lcontr.getCollection().getToDoList().size() == 0);
        clearLists();
    }

    @Test
    public void moveToTodoTest(){
        lcontr.createNewItem("Hello world", Priority.LOW, 1475591365);
        lcontr.makeItemDone(lcontr.getCollection().getToDoList().iterator().next());
        lcontr.makeItemTodo(lcontr.getCollection().getDoneList().iterator().next());
        Assert.assertTrue(lcontr.getCollection().getToDoList().size() > 0 && lcontr.getCollection().getDoneList().size() == 0);
        clearLists();
    }

    @Test
    public void removeTest(){
        lcontr.createNewItem("Hello world", Priority.LOW, 1475591365);
        lcontr.removeItem(lcontr.getCollection().getToDoList(), lcontr.getCollection().getToDoList().iterator().next());
        Assert.assertTrue(lcontr.getCollection().getToDoList().size() == 0);
    }

    @Test
    public void savingFileTest() {
        lcontr.createNewItem("Hello world", Priority.LOW, 1475591365);
        try {
            lcontr.saveList();
            Assert.assertTrue(file.exists());
        } catch(IOException ioe){
            ioe.printStackTrace();
        }
        clearLists();
    }

    @Test
    public void loadingFileTest(){
        clearLists();
        try {
            lcontr.loadList();
            Assert.assertTrue(lcontr.getCollection().getToDoList().size() != 0);
        } catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

    private void clearLists(){
        lcontr.getCollection().getToDoList().clear();
        lcontr.getCollection().getDoneList().clear();
    }
}
