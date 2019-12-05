package pl.strojecki;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTools {
    private final double delta = 0.01;
    private final double deltaAngle = 0.0001;

    Point beginPoint, endPoint;

    @Before
    public void setup() {
        beginPoint = new Point(0.0, 0.0);
        endPoint = new Point(100.0, 100.0);

    }

    @Test
    public void testDeltas() {
        Point expectedPoint = new Point(1.0, 1.0);
//        TODO Point == Point does not work correctly
        assertEquals(expectedPoint, Tools.polar(beginPoint, endPoint, 0.0, 1.41));

    }
}
