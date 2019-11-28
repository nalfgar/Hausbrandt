import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestSimpleForm {
    Double delta = 0.001;

    @Test
    public void TestForm1(){
        SimpleForm simpleForm1 = new SimpleForm(0.0,0.0,0.0,0.0);
        SimpleForm simpleForm2 = new SimpleForm(0.0,0.0,1.0,1.0);
        SimpleForm simpleForm3 = new SimpleForm(1.0,1.0,4.0,6.0);
        SimpleForm simpleForm4 = new SimpleForm(4.0,6.0,5.0,9.0);

        assertEquals(0.0, simpleForm1.f1(), delta);
        assertEquals(0.0, simpleForm2.f1(), delta);
        assertEquals(2.0, simpleForm3.f1(), delta);
        assertEquals(6.0, simpleForm4.f1(), delta);
    }
}
