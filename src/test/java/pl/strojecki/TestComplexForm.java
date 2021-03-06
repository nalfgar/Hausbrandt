package pl.strojecki;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestComplexForm {
    private final double delta = 0.001;

    private SimpleForm simpleForm1 = new SimpleForm(0.0, 0.0, 0.0, 0.0);
    private SimpleForm simpleForm2 = new SimpleForm(0.0, 0.0, 1.0, 1.0);
    private SimpleForm simpleForm3 = new SimpleForm(1.0, 1.0, 4.0, 6.0);
    private SimpleForm simpleForm4 = new SimpleForm(4.0, 6.0, 5.0, 9.0);
    private SimpleForm simpleForm5 = new SimpleForm(5.0, 9.0, 0.154, -2.58);

    @Test
    public void testFormF1(){
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

    @Test
    public void testFormF2(){
        ComplexForm complexForm = new ComplexForm(simpleForm1);
        assertEquals(0.0, complexForm.f2(), delta);
        complexForm.addSimpleForm(simpleForm2);
        assertEquals(0.0, complexForm.f2(), delta);
        complexForm.addSimpleForm(simpleForm3);
        assertEquals(10.0, complexForm.f2(), delta);
        complexForm.addSimpleForm(simpleForm4);
        assertEquals(84.0, complexForm.f2(), delta);
        complexForm.addSimpleForm(simpleForm5);
        assertEquals(61.55, complexForm.f2(), delta);
    }

    @Test
    public void testFormF0(){
        ComplexForm complexForm = new ComplexForm(simpleForm1);
        assertEquals(0.0, complexForm.f0(), delta);
        complexForm.addSimpleForm(simpleForm2);
        assertEquals(0.0, complexForm.f0(), delta);
        complexForm.addSimpleForm(simpleForm3);
        assertEquals(0.2, complexForm.f0(), delta);
        complexForm.addSimpleForm(simpleForm4);
        assertEquals(0.095, complexForm.f0(), delta);
        complexForm.addSimpleForm(simpleForm5);
        assertEquals(-0.102, complexForm.f0(), delta);
    }

    @Test
    public void testFormF1LowerRound(){
        ComplexForm complexForm = new ComplexForm(simpleForm1);
        assertEquals(0.0, complexForm.f1LowerRound(), delta);
        complexForm.addSimpleForm(simpleForm2);
        assertEquals(0.0, complexForm.f1LowerRound(), delta);
        complexForm.addSimpleForm(simpleForm3);
        assertEquals(2.0/12, complexForm.f1LowerRound(), delta);
        complexForm.addSimpleForm(simpleForm4);
        assertEquals(8.0/26, complexForm.f1LowerRound(), delta);
        complexForm.addSimpleForm(simpleForm5);
        assertEquals((8.0-14.286)/(26.0+0.154-2.58), complexForm.f1LowerRound(), delta);
    }

    @Test
    public void testFormF2LowerRound(){
        ComplexForm complexForm = new ComplexForm(simpleForm1);
        assertEquals(0.0, complexForm.f2LowerRound(), delta);
        complexForm.addSimpleForm(simpleForm2);
        assertEquals(0.0, complexForm.f2LowerRound(), delta);
        complexForm.addSimpleForm(simpleForm3);
        assertEquals(10.0/12, complexForm.f2LowerRound(), delta);
        complexForm.addSimpleForm(simpleForm4);
        assertEquals(84.0/26, complexForm.f2LowerRound(), delta);
        complexForm.addSimpleForm(simpleForm5);
        assertEquals((84.0-22.45)/(26.0+0.154-2.58), complexForm.f2LowerRound(), delta);
    }

    @Test
    public void testFormF1UpperRound(){
        ComplexForm complexForm = new ComplexForm(simpleForm1);
        assertEquals(0.0, complexForm.f1UpperRound(), delta);
        complexForm.addSimpleForm(simpleForm2);
        assertEquals(0.0, complexForm.f1UpperRound(), delta);
        complexForm.addSimpleForm(simpleForm3);
        assertEquals(2.0/2, complexForm.f1UpperRound(), delta);
        complexForm.addSimpleForm(simpleForm4);
        assertEquals(8.0/12, complexForm.f1UpperRound(), delta);
        complexForm.addSimpleForm(simpleForm5);
        assertEquals((8.0-14.286)/26, complexForm.f1UpperRound(), delta);
    }

    @Test
    public void testFormF2UpperRound(){
        ComplexForm complexForm = new ComplexForm(simpleForm1);
        assertEquals(0.0, complexForm.f2UpperRound(), delta);
        complexForm.addSimpleForm(simpleForm2);
        assertEquals(0.0, complexForm.f2UpperRound(), delta);
        complexForm.addSimpleForm(simpleForm3);
        assertEquals(10.0/2, complexForm.f2UpperRound(), delta);
        complexForm.addSimpleForm(simpleForm4);
        assertEquals(84.0/12, complexForm.f2UpperRound(), delta);
        complexForm.addSimpleForm(simpleForm5);
        assertEquals((84.0-22.45)/26, complexForm.f2UpperRound(), delta);
    }

    @Test
    public void testFormF1LowerSquare(){
        ComplexForm complexForm = new ComplexForm(simpleForm1);
        assertEquals(0.0, complexForm.f1LowerSquare(), delta);
        complexForm.addSimpleForm(simpleForm2);
        assertEquals(0.0, complexForm.f1LowerSquare(), delta);
        complexForm.addSimpleForm(simpleForm3);
        assertEquals(2.0/54, complexForm.f1LowerSquare(), delta);
        complexForm.addSimpleForm(simpleForm4);
        assertEquals(8.0/160, complexForm.f1LowerSquare(), delta);
        complexForm.addSimpleForm(simpleForm5);
        assertEquals((8.0-14.286)/(166.860), complexForm.f1LowerSquare(), delta);
    }

    @Test
    public void testFormF2LowerSquare(){
        ComplexForm complexForm = new ComplexForm(simpleForm1);
        assertEquals(0.0, complexForm.f2LowerSquare(), delta);
        complexForm.addSimpleForm(simpleForm2);
        assertEquals(0.0, complexForm.f2LowerSquare(), delta);
        complexForm.addSimpleForm(simpleForm3);
        assertEquals(10.0/54, complexForm.f2LowerSquare(), delta);
        complexForm.addSimpleForm(simpleForm4);
        assertEquals(84.0/160, complexForm.f2LowerSquare(), delta);
        complexForm.addSimpleForm(simpleForm5);
        assertEquals((84.0-22.45)/(166.860), complexForm.f2LowerSquare(), delta);
    }

    @Test
    public void testFormF1UpperSquare(){
        ComplexForm complexForm = new ComplexForm(simpleForm1);
        assertEquals(0.0, complexForm.f1UpperSquare(), delta);
        complexForm.addSimpleForm(simpleForm2);
        assertEquals(0.0, complexForm.f1UpperSquare(), delta);
        complexForm.addSimpleForm(simpleForm3);
        assertEquals(2.0/2, complexForm.f1UpperSquare(), delta);
        complexForm.addSimpleForm(simpleForm4);
    }

    @Test
    public void testFormF2UpperSquqre(){
        ComplexForm complexForm = new ComplexForm(simpleForm1);
        assertEquals(0.0, complexForm.f2UpperSquare(), delta);
        complexForm.addSimpleForm(simpleForm2);
        assertEquals(0.0, complexForm.f2UpperSquare(), delta);
        complexForm.addSimpleForm(simpleForm3);
        assertEquals(10.0/2, complexForm.f2UpperSquare(), delta);
    }

    @Test
    public void testDataFromInternet(){
        // https://sites.google.com/site/obliczeniageodezyjne/pomocnicze-symbole-obliczeniowe
        SimpleForm simpleFormA = new SimpleForm(4.243, 5.071, 1.472, 8.284);
        SimpleForm simpleFormB = new SimpleForm(3.456, 1.246, 7.392, 5.853);
        ComplexForm complexForm = new ComplexForm(simpleFormA, simpleFormB);

        assertEquals(38.702, complexForm.f1(), delta);
        assertEquals(81.093, complexForm.f2(), delta);
        assertEquals(0.477, complexForm.f0(), delta);

        assertEquals(1.683, complexForm.f1LowerRound(), delta);
        assertEquals(3.526, complexForm.f2LowerRound(), delta);
        assertEquals(2.761, complexForm.f1UpperRound(), delta);
        assertEquals(5.786, complexForm.f2UpperRound(), delta);

        assertEquals(0.242, complexForm.f1LowerSquare(), delta);
        assertEquals(0.508, complexForm.f2LowerSquare(), delta);
        assertEquals(0.676, complexForm.f1UpperSquare(), delta);
        assertEquals(1.417, complexForm.f2UpperSquare(), delta);
    }

}
