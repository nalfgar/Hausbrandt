package pl.strojecki;

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


    public Double f1() {
        return (a*d) - (b*c);
    }

    public Double f2() {
        return (a*c) + (b*d);
    }

    public Double f0() {
        if (f2() == 0.0){
            return 0.0;
        }
        return f1()/f2();
    }
}
