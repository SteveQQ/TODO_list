import com.steveq.model.ListItem;
import com.steveq.model.Priority;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by SteveQ on 2016-10-04.
 */
public class ListItemTest {

    private ListItem lItem = new ListItem("Hello World", Priority.LOW, 1475591365);

    @Test
    public void testListItem(){
        Assert.assertNotNull(lItem);
        Assert.assertEquals("Hello World", lItem.getContent());
        Assert.assertEquals("LOW", lItem.getPriority().getValue());
        Assert.assertEquals(Priority.LOW, lItem.getPriority());
        Assert.assertEquals(1475591365, lItem.getTimeStamp());
    }



}
