package pl.strojecki;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ComplexForm {
    private List<SimpleForm> list = new LinkedList<>();

    public ComplexForm(SimpleForm simpleForm) {
        list.add(simpleForm);
    }

    public ComplexForm(SimpleForm simpleForm1, SimpleForm simpleForm2) {
        list.add(simpleForm1);
        list.add(simpleForm2);
    }

    public void addSimpleForm(SimpleForm simpleForm){
        list.add(simpleForm);
    }

    /*
    * The first form
    * */
    Double f1(){
        Double result = 0.0;

        for (SimpleForm simpleForm : list) {
            result += simpleForm.f1();
        }
        return result;
    }

    /*
    * The second form
    * */
    Double f2(){
        Double result = 0.0;

        for (SimpleForm simpleForm : list) {
            result += simpleForm.f2();
        }
        return result;
    }

    /*
    * The zero form
    * */
    Double f0(){
        return f2() == 0.0 ? 0.0 : f1() / f2();
    }

    /*
     * First lower round form
     * */
    public double f1LowerRound() {
        Double sumOfCD = 0.0;
        for (SimpleForm simpleForm : list) {
            sumOfCD += simpleForm.getSumOfCD();
        }
        return sumOfCD == 0.0 ? 0.0 : f1() / sumOfCD;
    }

    /*
     * First lower round form
     * */
    public double f2LowerRound() {
        Double sumOfCD = 0.0;
        for (SimpleForm simpleForm : list) {
            sumOfCD += simpleForm.getSumOfCD();
        }
        return sumOfCD == 0.0 ? 0.0 : f2() / sumOfCD;
    }



    @Override
    public String toString() {
        return "ComplexForm{" +
                "list=" + list +
                '}';
    }
}
