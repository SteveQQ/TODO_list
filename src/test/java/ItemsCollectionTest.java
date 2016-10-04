import com.steveq.model.ItemsCollection;
import com.steveq.model.ListItem;
import com.steveq.model.Priority;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by SteveQ on 2016-10-04.
 */
public class ItemsCollectionTest {

    private ItemsCollection itemsCol = new ItemsCollection();
    private TreeSet<ListItem> testSet;

    public Set<ListItem> prepareSet(){
        testSet = new TreeSet<ListItem>();

        testSet.add(new ListItem("abs", Priority.LOW, 1475591365));
        testSet.add(new ListItem("abz", Priority.HIGH, 1475591362));
        testSet.add(new ListItem("abx", Priority.MEDIUM, 1475591367));

        return testSet;
    }


    @Test
    public void itemsCollectionTest(){
        prepareSet();
        Assert.assertNotNull(itemsCol);
        Assert.assertTrue(itemsCol instanceof Serializable);
        Assert.assertTrue(itemsCol.getToDoList() instanceof TreeSet);
        Assert.assertTrue(itemsCol.getDoneList() instanceof TreeSet);
        itemsCol.setToDoList(testSet);
        Assert.assertEquals(itemsCol.getToDoList(), testSet);
        itemsCol.setDoneList(testSet);
        Assert.assertEquals(itemsCol.getDoneList(), testSet);

    }



}
