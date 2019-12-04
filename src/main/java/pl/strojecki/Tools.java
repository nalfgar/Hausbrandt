package pl.strojecki;

import static java.lang.Math.PI;
import static java.lang.Math.atan2;

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

    static double azimuthRad(Point beginPoint, Point endPoint){
        double dX = dX(beginPoint, endPoint);
        double dY = dY(beginPoint, endPoint);
        return normalizeAngle(atan2(dY, dX));
    }

    static double azimuthGrad(Point beginPoint, Point endPoint){
        return azimuthRad(beginPoint, endPoint) * RAD2GRAD;
    }
}
