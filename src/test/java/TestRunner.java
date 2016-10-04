import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by SteveQ on 2016-10-04.
 */
public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ListItemTest.class);

        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

}
