package pl.strojecki;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPoint {
    private final double delta = 0.001;
    private final double deltaAngle = 0.00001;

    Point a = new Point(0.0, 0.0, 200.0);
    Point b = new Point(50.0, 30.0, 200.0);
    Point c = new Point(-20.0, 60.0, 200.0);
    Point d = new Point(-60.0, -10.0, 200.0);
    Point e = new Point(40.0, -30.0, 200.0);


    @Test
    public void testDeltas(){
        assertEquals(58.31, a.distance(b), delta);
        assertEquals(0.54042, a.azimuth(b), deltaAngle);
    }

}
