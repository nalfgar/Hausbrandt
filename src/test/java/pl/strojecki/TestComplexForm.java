package pl.strojecki;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestComplexForm {
    private final Double delta = 0.001;

    private SimpleForm simpleForm1 = new SimpleForm(0.0, 0.0, 0.0, 0.0);
    private SimpleForm simpleForm2 = new SimpleForm(0.0, 0.0, 1.0, 1.0);
    private SimpleForm simpleForm3 = new SimpleForm(1.0, 1.0, 4.0, 6.0);
    private SimpleForm simpleForm4 = new SimpleForm(4.0, 6.0, 5.0, 9.0);
    private SimpleForm simpleForm5 = new SimpleForm(5.0, 9.0, 0.154, -2.58);

    @Test
    public void testConstructor(){
        ComplexForm complexForm = new ComplexForm(simpleForm1);
        assertEquals(0.0, complexForm.f1(), delta);
        complexForm.addSimpleForm(simpleForm2);
        assertEquals(0.0, complexForm.f1(), delta);
        complexForm.addSimpleForm(simpleForm3);
        assertEquals(2.0, complexForm.f1(), delta);
        complexForm.addSimpleForm(simpleForm4);
        assertEquals(8.0, complexForm.f1(), delta);
        complexForm.addSimpleForm(simpleForm5);
        assertEquals(-6.286, complexForm.f1(), delta);
    }
}
