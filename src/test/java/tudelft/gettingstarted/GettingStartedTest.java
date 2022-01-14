package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {
//For practice purposes, I changed the original "int" method to float so we can add more types of test cases, such as with decimals
    @Test
    public void addFiveTo20() {
        float result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        float result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinus20() {
        float result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15,result);
    }
    
 // My additional test case: 
    
    @Test
    public void addFiveTo20Point5() {
        float result = new GettingStarted().addFive((float) 20.5);
        Assertions.assertEquals(25.5,result);
    }
}
