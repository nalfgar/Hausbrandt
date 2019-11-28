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

        for (int i = 0; i < list.size(); i++) {
            result+=list.get(i).f1();
        }
        return result;
    }
}
