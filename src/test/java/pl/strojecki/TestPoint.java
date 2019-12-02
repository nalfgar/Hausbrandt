package pl.strojecki;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static java.lang.Math.*;


public class TestPoint {
    private final double delta = 0.01;
    private final double deltaAngle = 0.0001;

    private final double ANGLE_PI_DIV_4 = PI/4;
    private final double ANGLE_PI_DIV_2 = PI/2;
    private final double ANGLE_PI = PI;
    private final double ANGLE_PI_MULTI_3_2 = PI*(3/2.0);
    private final double ANGLE_PI_MULTI_2 = PI*2;


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
        assertEquals(ANGLE_PI_DIV_4, o.azimuthRadians(b), deltaAngle);
        assertEquals(ANGLE_PI_DIV_2, o.azimuthRadians(c), deltaAngle);
        assertEquals(ANGLE_PI_DIV_2 + ANGLE_PI_DIV_4, o.azimuthRadians(d), deltaAngle);
        assertEquals(ANGLE_PI, o.azimuthRadians(e), deltaAngle);
        assertEquals(ANGLE_PI + ANGLE_PI_DIV_4, o.azimuthRadians(f), deltaAngle);
        assertEquals(ANGLE_PI + ANGLE_PI_DIV_2, o.azimuthRadians(g), deltaAngle);
        assertEquals(ANGLE_PI + ANGLE_PI_DIV_2 + ANGLE_PI_DIV_4, o.azimuthRadians(h), deltaAngle);
        assertEquals(0.0, o.azimuthRadians(a), deltaAngle);
    }

//    @Test
//    public void testAzimuthGrads(){
//        assertEquals(34.4041, a.azimuthGradians(b), deltaAngle);
//        assertEquals(120.48328, a.azimuthGradians(c), deltaAngle);
//        assertEquals(210.51369, a.azimuthGradians(d), deltaAngle);
//        assertEquals(359.03345, a.azimuthGradians(e), deltaAngle);
//    }

//    @Test
//    public void testAngleRadians(){
//        assertEquals(1.3521, a.angleRadians(b, c), deltaAngle);
//        assertEquals(1.4141, a.angleRadians(c, d), deltaAngle);
//        assertEquals(2.3329, a.angleRadians(d, e), deltaAngle);
//        assertEquals(1.1839, a.angleRadians(e, b), deltaAngle);
//    }


//    @Test
//    public void testAngleGradianss(){
//        assertEquals(86.07910, a.angleGradians(b, c), deltaAngle);
//        assertEquals(90.03041, a.angleGradians(c, d), deltaAngle);
//        assertEquals(148.5197, a.angleGradians(d, e), deltaAngle);
//        assertEquals(251.4802, a.angleGradians(e, d), deltaAngle);
////        assertEquals(75.3707, a.angleGradians(e, b), deltaAngle);
//    }

}
