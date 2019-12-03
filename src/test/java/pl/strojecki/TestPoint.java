package pl.strojecki;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestPoint {
    private final double delta = 0.01;
    private final double deltaAngle = 0.0001;

    private final double PI = Math.PI;
    private final double HALF_PI = Math.PI / 2;
    private final double QUARTER_PI = Math.PI / 4;
    private final double TWO_PI = Math.PI * 2;


    Point o = new Point(0.0, 0.0);
    Point a = new Point(1.0, 0.0);
    Point b = new Point(1.0, 1.0);
    Point c = new Point(0.0, 1.0);
    Point d = new Point(-1.0, 1.0);
    Point e = new Point(-1.0, 0.0);
    Point f = new Point(-1.0, -1.0);
    Point g = new Point(0.0, -1.0);
    Point h = new Point(1.0, -1.0);


    @Test
    public void testDeltas() {
        assertEquals(0.0, o.distance(o), delta);

        assertEquals(1.0, o.distance(a), delta);
        assertEquals(1.0, o.distance(c), delta);
        assertEquals(1.0, o.distance(e), delta);
        assertEquals(1.0, o.distance(g), delta);

        assertEquals(1.41, o.distance(b), delta);
        assertEquals(1.41, o.distance(d), delta);
        assertEquals(1.41, o.distance(f), delta);
        assertEquals(1.41, o.distance(h), delta);

        assertEquals(1.0, a.distance(b), delta);
        assertEquals(2.0, a.distance(e), delta);
        assertEquals(1.0, a.distance(h), delta);

        assertEquals(1.0, b.distance(c), delta);
        assertEquals(2.0, b.distance(d), delta);
        assertEquals(2.82, b.distance(f), delta);
    }

    @Test
    public void testAzimuthRadians(){
//        expected angles in radians
        assertEquals(0.0, o.azimuthRadians(a), deltaAngle);
        assertEquals(QUARTER_PI, o.azimuthRadians(b), deltaAngle);
        assertEquals(HALF_PI, o.azimuthRadians(c), deltaAngle);
        assertEquals(HALF_PI + QUARTER_PI, o.azimuthRadians(d), deltaAngle);
        assertEquals(PI, o.azimuthRadians(e), deltaAngle);
        assertEquals(PI + QUARTER_PI, o.azimuthRadians(f), deltaAngle);
        assertEquals(PI + HALF_PI, o.azimuthRadians(g), deltaAngle);
        assertEquals(TWO_PI - QUARTER_PI, o.azimuthRadians(h), deltaAngle);
    }

    @Test
    public void testAzimuthGrads(){
        assertEquals(0.0, o.azimuthGrad(a), deltaAngle);
        assertEquals(50.0, o.azimuthGrad(b), deltaAngle);
        assertEquals(100.0, o.azimuthGrad(c), deltaAngle);
        assertEquals(150.0, o.azimuthGrad(d), deltaAngle);
        assertEquals(200.0, o.azimuthGrad(e), deltaAngle);
        assertEquals(250.0, o.azimuthGrad(f), deltaAngle);
        assertEquals(300.0, o.azimuthGrad(g), deltaAngle);
        assertEquals(350, o.azimuthGrad(h), deltaAngle);
    }

    @Test
    public void testAngleRadians(){
        assertEquals(QUARTER_PI, o.angleRadians(a, b), deltaAngle);
        assertEquals(HALF_PI, o.angleRadians(a, c), deltaAngle);
        assertEquals(HALF_PI + QUARTER_PI, o.angleRadians(a, d), deltaAngle);
        assertEquals(PI, o.angleRadians(a, e), deltaAngle);
        assertEquals(PI + QUARTER_PI, o.angleRadians(a, f), deltaAngle);
        assertEquals(PI + HALF_PI, o.angleRadians(a, g), deltaAngle);
        assertEquals(TWO_PI - QUARTER_PI, o.angleRadians(a, h), deltaAngle);
    }

//    @Test
//    public void testAngleGradianss(){
//        assertEquals(86.07910, a.angleGradians(b, c), deltaAngle);
//        assertEquals(90.03041, a.angleGradians(c, d), deltaAngle);
//        assertEquals(148.5197, a.angleGradians(d, e), deltaAngle);
//        assertEquals(251.4802, a.angleGradians(e, d), deltaAngle);
////        assertEquals(75.3707, a.angleGradians(e, b), deltaAngle);
//    }

}
