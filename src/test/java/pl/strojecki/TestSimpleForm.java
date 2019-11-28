package pl.strojecki;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestSimpleForm {
    Double delta = 0.001;

    SimpleForm simpleForm1 = new SimpleForm(0.0, 0.0, 0.0, 0.0);
    SimpleForm simpleForm2 = new SimpleForm(0.0, 0.0, 1.0, 1.0);
    SimpleForm simpleForm3 = new SimpleForm(1.0, 1.0, 4.0, 6.0);
    SimpleForm simpleForm4 = new SimpleForm(4.0, 6.0, 5.0, 9.0);

    @Test
    public void testFormF1(){

        assertEquals(0.0, simpleForm1.f1(), delta);
        assertEquals(0.0, simpleForm2.f1(), delta);
        assertEquals(2.0, simpleForm3.f1(), delta);
        assertEquals(6.0, simpleForm4.f1(), delta);
    }

    @Test
    public void testFormF2(){
        assertEquals(0.0, simpleForm1.f2(), delta);
        assertEquals(0.0, simpleForm2.f2(), delta);
        assertEquals(10.0, simpleForm3.f2(), delta);
        assertEquals(74.0, simpleForm4.f2(), delta);
    }

    @Test
    public void testFormF0(){
        assertEquals(0.0, simpleForm1.f0(), delta);
        assertEquals(0.0, simpleForm2.f0(), delta);
        assertEquals(0.2, simpleForm3.f0(), delta);
        assertEquals(0.081, simpleForm4.f0(), delta);
    }

    @Test
    public void testFormF1BottomRound(){
        assertEquals(0.0, simpleForm1.f1LowerRound(), delta);
        assertEquals(0.0, simpleForm2.f1LowerRound(), delta);
        assertEquals(0.2, simpleForm3.f1LowerRound(), delta);
        assertEquals(0.428, simpleForm4.f1LowerRound(), delta);
    }

    @Test
    public void testFormF2BottomRound(){
        assertEquals(0.0, simpleForm1.f2LowerRound(), delta);
        assertEquals(0.0, simpleForm2.f2LowerRound(), delta);
        assertEquals(1.0, simpleForm3.f2LowerRound(), delta);
        assertEquals(5.286, simpleForm4.f2LowerRound(), delta);
    }

    @Test
    public void testFormF1UpperRound(){
        assertEquals(0.0, simpleForm1.f1UpperRound(), delta);
        assertEquals(0.0, simpleForm2.f1UpperRound(), delta);
        assertEquals(1.0, simpleForm3.f1UpperRound(), delta);
        assertEquals(0.6, simpleForm4.f1UpperRound(), delta);
    }

    @Test
    public void testFormF2UpperRound(){
        assertEquals(0.0, simpleForm1.f2UpperRound(), delta);
        assertEquals(0.0, simpleForm2.f2UpperRound(), delta);
        assertEquals(5.0, simpleForm3.f2UpperRound(), delta);
        assertEquals(7.4, simpleForm4.f2UpperRound(), delta);
    }
}
