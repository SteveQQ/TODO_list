import com.steveq.controller.ListController;
import com.steveq.model.Priority;
import org.junit.Assert;
import org.junit.Test;

import java.awt.event.ActionListener;

/**
 * Created by SteveQ on 2016-10-04.
 */
public class ListControllerTest {

    private ListController lcontr = ListController.getInstance();

    @Test
    public void fieldsTest(){
        Assert.assertTrue(lcontr != null);
        Assert.assertNotNull(lcontr.getCollection());
    }

    @Test
    public void newItemTest(){
        lcontr.createNewItem("Hello world", Priority.LOW, 1475591365);
        Assert.assertTrue(lcontr.getCollection().getToDoList().size() > 0);
    }

    @Test
    public void moveToDoneTest(){
        lcontr.makeItemDone(lcontr.getCollection().getToDoList().iterator().next());
        Assert.assertTrue(lcontr.getCollection().getDoneList().size() > 0 && lcontr.getCollection().getToDoList().size() == 0);
    }

    @Test
    public void moveToTodoTest(){
        lcontr.makeItemTodo(lcontr.getCollection().getDoneList().iterator().next());
        Assert.assertTrue(lcontr.getCollection().getToDoList().size() > 0 && lcontr.getCollection().getDoneList().size() == 0);
    }

    @Test
    public void removeTest(){
        lcontr.removeItem(lcontr.getCollection().getToDoList(), lcontr.getCollection().getToDoList().iterator().next());
        Assert.assertTrue(lcontr.getCollection().getToDoList().size() == 0);
    }

}
