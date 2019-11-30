package pl.strojecki;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPoint {
    private final double delta = 0.01;
    private final double deltaAngle = 0.0001;

    Point a = new Point(0.0, 0.0, 200.0);
    Point b = new Point(50.0, 30.0, 200.0);
    Point c = new Point(-20.0, 60.0, 200.0);
    Point d = new Point(-60.0, -10.0, 200.0);
    Point e = new Point(40.0, -30.0, 200.0);


    @Test
    public void testDeltas(){
        assertEquals(0.0, a.distance(a), delta);
        assertEquals(58.31, a.distance(b), delta);
        assertEquals(63.25, a.distance(c), delta);
        assertEquals(60.83, a.distance(d), delta);
        assertEquals(50.00, a.distance(e), delta);
    }

    @Test
    public void testAzimuthRadians(){
//        expected angles in radians
        assertEquals(0.5404, a.azimuthRadians(b), deltaAngle);
        assertEquals(1.8925, a.azimuthRadians(c), deltaAngle);
        assertEquals(3.3067, a.azimuthRadians(d), deltaAngle);
        assertEquals(5.6396, a.azimuthRadians(e), deltaAngle);
    }

    @Test
    public void testAzimuthGrads(){
        assertEquals(34.4041, a.azimuthGradians(b), deltaAngle);
        assertEquals(120.48328, a.azimuthGradians(c), deltaAngle);
        assertEquals(210.51369, a.azimuthGradians(d), deltaAngle);
        assertEquals(359.03345, a.azimuthGradians(e), deltaAngle);
    }

}
