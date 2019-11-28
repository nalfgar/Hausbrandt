package pl.strojecki;

import java.util.Objects;

public class SimpleForm {
    private Double a;
    private Double b;
    private Double c;
    private Double d;

    public SimpleForm(Double a, Double b, Double c, Double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    /*
    * The first form
    * */
    public Double f1() {
        return (a*d) - (b*c);
    }

    /*
     * The second form
     * */
    public Double f2() {
        return (a*c) + (b*d);
    }

    /*
     * The zero form
     * */
    public Double f0() {
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

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "SimpleForm{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleForm that = (SimpleForm) o;
        return Objects.equals(a, that.a) &&
                Objects.equals(b, that.b) &&
                Objects.equals(c, that.c) &&
                Objects.equals(d, that.d);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, d);
    }
}
