import org.junit.Assert;
import org.junit.Test;

/**
 * Created by SteveQ on 2016-10-04.
 */
public class ListItemTest {

    ListItem lItem = new ListItem("Hello World", 1475591365, Priority.LOW);

    @Test
    public void testListItem(){
        Assert.assertNotNull(lItem);
        Assert.assertTrue(lItem instanceof ListItem);
    }



}
