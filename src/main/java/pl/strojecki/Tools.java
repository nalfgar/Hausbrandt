package pl.strojecki;

import static java.lang.Math.PI;

public class Tools {

    static final double PI2 = 2 * PI;
    static final double HALF_PI = Math.PI / 2;
    static final double QUARTER_PI = Math.PI / 4;
    static final double TWO_PI = Math.PI * 2;

    static final double RAD2GRAD = 200 / PI;

    static double normalizeAngle(double angle) {
        while (angle < 0.0) {
            angle += PI2;
        }
        while (angle >= PI2) {
            angle -= PI2;
        }
        return angle;
    }

    static double dX(Point beginPoint, Point endPoint){
        return endPoint.getX() - beginPoint.getX();
    }
    static double dY(Point beginPoint, Point endPoint){
        return endPoint.getY() - beginPoint.getY();
    }
}
