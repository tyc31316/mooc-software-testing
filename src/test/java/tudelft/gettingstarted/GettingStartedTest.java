package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }



    @Test
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(-5);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-25);
        Assertions.assertEquals(-20,result);
    }
}
