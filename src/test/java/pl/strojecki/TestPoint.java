package pl.strojecki;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import static java.lang.Math.PI;
import static org.junit.Assert.assertEquals;
import static pl.strojecki.Tools.*;


public class TestPoint {
    private final double delta = 0.01;
    private final double deltaAngle = 0.0001;

    Point o, a, b, c, d, e, f, g, h;

    @Before
    public void setup() {
        o = new Point(0.0, 0.0);
        a = new Point(1.0, 0.0);
        b = new Point(1.0, 1.0);
        c = new Point(0.0, 1.0);
        d = new Point(-1.0, 1.0);
        e = new Point(-1.0, 0.0);
        f = new Point(-1.0, -1.0);
        g = new Point(0.0, -1.0);
        h = new Point(1.0, -1.0);
    }

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
//        expected angles in gradians (gons)
        assertEquals(0.0, o.azimuthGrad(a), deltaAngle);
        assertEquals(50.0, o.azimuthGrad(b), deltaAngle);
        assertEquals(100.0, o.azimuthGrad(c), deltaAngle);
        assertEquals(150.0, o.azimuthGrad(d), deltaAngle);
        assertEquals(200.0, o.azimuthGrad(e), deltaAngle);
        assertEquals(250.0, o.azimuthGrad(f), deltaAngle);
        assertEquals(300.0, o.azimuthGrad(g), deltaAngle);
        assertEquals(350.0, o.azimuthGrad(h), deltaAngle);
    }

    @Test
    public void testAngleRad(){
//        expected angles in radians
        assertEquals(QUARTER_PI, o.angleRad(a, b), deltaAngle);
        assertEquals(HALF_PI, o.angleRad(a, c), deltaAngle);
        assertEquals(HALF_PI + QUARTER_PI, o.angleRad(a, d), deltaAngle);
        assertEquals(PI, o.angleRad(a, e), deltaAngle);
        assertEquals(PI + QUARTER_PI, o.angleRad(a, f), deltaAngle);
        assertEquals(PI + HALF_PI, o.angleRad(a, g), deltaAngle);
        assertEquals(TWO_PI - QUARTER_PI, o.angleRad(a, h), deltaAngle);
    }

    @Test
    public void testAngleGrad(){
//        expected angles in gradians (gons)
        assertEquals(50.0, o.angleGrad(a, b), deltaAngle);
        assertEquals(100.0, o.angleGrad(a, c), deltaAngle);
        assertEquals(150.0, o.angleGrad(a, d), deltaAngle);
        assertEquals(200.0, o.angleGrad(a, e), deltaAngle);
        assertEquals(250.0, o.angleGrad(a, f), deltaAngle);
        assertEquals(300.0, o.angleGrad(a, g), deltaAngle);
        assertEquals(350.0, o.angleGrad(a, h), deltaAngle);

        assertEquals(350.0, o.angleGrad(b, a), deltaAngle);
        assertEquals(300.0, o.angleGrad(c, a), deltaAngle);
        assertEquals(250.0, o.angleGrad(d, a), deltaAngle);
        assertEquals(200.0, o.angleGrad(e, a), deltaAngle);
        assertEquals(150.0, o.angleGrad(f, a), deltaAngle);
        assertEquals(100.0, o.angleGrad(g, a), deltaAngle);
        assertEquals(50.0, o.angleGrad(h, a), deltaAngle);

        assertEquals(50.0, o.angleGrad(b, c), deltaAngle);
        assertEquals(100.0, o.angleGrad(b, d), deltaAngle);
        assertEquals(150.0, o.angleGrad(b, e), deltaAngle);
        assertEquals(200.0, o.angleGrad(b, f), deltaAngle);
        assertEquals(250.0, o.angleGrad(b, g), deltaAngle);
        assertEquals(300.0, o.angleGrad(b, h), deltaAngle);

        assertEquals(350.0, o.angleGrad(c, b), deltaAngle);
        assertEquals(300.0, o.angleGrad(d, b), deltaAngle);
        assertEquals(250.0, o.angleGrad(e, b), deltaAngle);
        assertEquals(200.0, o.angleGrad(f, b), deltaAngle);
        assertEquals(150.0, o.angleGrad(g, b), deltaAngle);
        assertEquals(100.0, o.angleGrad(h, b), deltaAngle);

        assertEquals(50.0, o.angleGrad(c, d), deltaAngle);
        assertEquals(100.0, o.angleGrad(c, e), deltaAngle);
        assertEquals(150.0, o.angleGrad(c, f), deltaAngle);
        assertEquals(200.0, o.angleGrad(c, g), deltaAngle);
        assertEquals(250.0, o.angleGrad(c, h), deltaAngle);

        assertEquals(350.0, o.angleGrad(d, c), deltaAngle);
        assertEquals(300.0, o.angleGrad(e, c), deltaAngle);
        assertEquals(250.0, o.angleGrad(f, c), deltaAngle);
        assertEquals(200.0, o.angleGrad(g, c), deltaAngle);
        assertEquals(150.0, o.angleGrad(h, c), deltaAngle);
    }
}
