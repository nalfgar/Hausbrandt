package pl.strojecki;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class SimpleForm {
    private double a;
    private double b;
    private double c;
    private double d;

    /*
    * The first form
    * */
    public double f1() {
        return (a*d) - (b*c);
    }

    /*
     * The second form
     * */
    public double f2() {
        return (a*c) + (b*d);
    }

    /*
     * The zero form
     * */
    public double f0() {
        return f2() == 0.0 ? 0.0 : f1()/f2();
    }

    /*
     * First lower round form
     * */
    public double f1LowerRound() {
        double sum = c+d;
        return sum == 0.0 ? 0.0 : f1()/sum;
    }

    /*
     * Second lower round form
     * */
    public double f2LowerRound() {
        double sum = c+d;
        return sum == 0.0 ? 0.0 : f2()/sum;
    }

    /*
     * First upper round form
     * */
    public double f1UpperRound() {
        double sum = a+b;
        if (sum == 0.0){
            return 0.0;
        }
        return f1()/sum;
    }

    /*
     * Second upper round form
     * */
    public double f2UpperRound() {
        double sum = a+b;
        return sum == 0.0 ? 0.0 : f2()/sum;
    }

    /*
     * First lower square form
     * */
    public double f1LowerSquare() {
        double sum = (c*c)+(d*d);
        return sum == 0.0 ? 0.0 : f1()/sum;
    }

    /*
     * Second lower square form
     * */
    public double f2LowerSquare() {
        double sum = (c*c)+(d*d);
        return sum == 0.0 ? 0.0 : f2()/sum;
    }

    /*
     * First upper square form
     * */
    public double f1UpperSquare() {
        double sum = (a*a)+(b*b);
        return sum == 0.0 ? 0.0 : f1()/sum;
    }

    /*
     * Second upper square form
     * */
    public double f2UpperSquare() {
        double sum = (a*a)+(b*b);
        return sum == 0.0 ? 0.0 : f2()/sum;
    }

    double getSumOfAB(){
        return a+b;
    }

    double getSumOfCD(){
        return c+d;
    }

    double getSumOfA2B2(){
        return (a*a)+(b*b);
    }

    double getSumOfC2D2(){
        return (c*c)+(d*d);
    }
}
