package pl.strojecki;

import org.junit.Before;
import org.junit.Test;

import static java.lang.Math.PI;
import static org.junit.Assert.assertEquals;
import static pl.strojecki.Tools.*;

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
    public void testPolarInFirstQuarter() {
        Point expectedPoint = new Point(1.0, 1.0);
        Point actualPoint = polar(beginPoint, endPoint, 0.0, 1.41);

        assertEquals(expectedPoint.getX(), actualPoint.getX(), delta);
        assertEquals(expectedPoint.getY(), actualPoint.getY(), delta);
    }

    @Test
    public void testPolarInSecondQuarter() {
        Point expectedPoint = new Point(-1.0, 1.0);
        Point actualPoint = polar(beginPoint, endPoint, HALF_PI, 1.41);

        assertEquals(expectedPoint.getX(), actualPoint.getX(), delta);
        assertEquals(expectedPoint.getY(), actualPoint.getY(), delta);
    }

    @Test
    public void testPolarInThirdQuarter() {
        Point expectedPoint = new Point(-1.0, -1.0);
        Point actualPoint = polar(beginPoint, endPoint, PI, 1.41);

        assertEquals(expectedPoint.getX(), actualPoint.getX(), delta);
        assertEquals(expectedPoint.getY(), actualPoint.getY(), delta);
    }

    @Test
    public void testPolarInFourthQuarter() {
        Point expectedPoint = new Point(1.0, -1.0);
        Point actualPoint = polar(beginPoint, endPoint, PI + HALF_PI, 1.41);

        assertEquals(expectedPoint.getX(), actualPoint.getX(), delta);
        assertEquals(expectedPoint.getY(), actualPoint.getY(), delta);
    }

    @Test
    public void testPolarGradsInFirstQuarter(){
        Point expectedPoint = new Point(1.00, 1.00);
        Point actualPoint = Tools.polarGrad(beginPoint, endPoint, 0.0, 1.41);

        assertEquals(expectedPoint.getX(), actualPoint.getX(), delta);
        assertEquals(expectedPoint.getY(), actualPoint.getY(), delta);
    }

    @Test
    public void testPolarGradsInSecondQuarter(){
        Point expectedPoint = new Point(-1.00, 1.00);
        Point actualPoint = Tools.polarGrad(beginPoint, endPoint, 100.0, 1.41);

        assertEquals(expectedPoint.getX(), actualPoint.getX(), delta);
        assertEquals(expectedPoint.getY(), actualPoint.getY(), delta);
    }

    @Test
    public void testPolarGradsInThirdQuarter(){
        Point expectedPoint = new Point(-1.00, -1.00);
        Point actualPoint = Tools.polarGrad(beginPoint, endPoint, 200.0, 1.41);

        assertEquals(expectedPoint.getX(), actualPoint.getX(), delta);
        assertEquals(expectedPoint.getY(), actualPoint.getY(), delta);
    }

    @Test
    public void testPolarGradsInFourthQuarter(){
        Point expectedPoint = new Point(1.00, -1.00);
        Point actualPoint = Tools.polarGrad(beginPoint, endPoint, 300.0, 1.41);

        assertEquals(expectedPoint.getX(), actualPoint.getX(), delta);
        assertEquals(expectedPoint.getY(), actualPoint.getY(), delta);
    }


}
