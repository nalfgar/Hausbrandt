package pl.strojecki;

import static java.lang.Math.*;
import static java.lang.Math.sin;

public class Tools {

    static final double PI2 = 2 * PI;
    static final double HALF_PI = Math.PI / 2;
    static final double QUARTER_PI = Math.PI / 4;
    static final double TWO_PI = Math.PI * 2;

    static final double RAD2GRAD = 200 / PI;

    static double normalizeRad(double angle) {
        while (angle < 0.0) {
            angle += PI2;
        }
        while (angle >= PI2) {
            angle -= PI2;
        }
        return angle;
    }

    static double normalizeGrad(double angle) {
        while (angle < 0.0) {
            angle += 400.0;
        }
        while (angle >= 400.0) {
            angle -= 400.0;
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
        return normalizeRad(atan2(dY, dX));
    }

    static double azimuthGrad(Point beginPoint, Point endPoint){
        return azimuthRad(beginPoint, endPoint) * RAD2GRAD;
    }

    static double angleRad(Point centralPoint, Point leftPoint, Point rightPoint){
        return azimuthRad(centralPoint, rightPoint) - azimuthRad(centralPoint, leftPoint);
    }

    static double angleGrad(Point centralPoint, Point leftPoint, Point rightPoint){
        return normalizeGrad(angleRad(centralPoint, leftPoint, rightPoint) * RAD2GRAD);
    }

    static Point polar(Point beginPoint, Point endPoint, double angleRad, double distance) {
        double baseAzimuth = azimuthRad(beginPoint, endPoint);
        double azimuth = baseAzimuth + angleRad;
        double dX = distance * cos(azimuth);
        double dY = distance * sin(azimuth);
        return new Point(beginPoint.getX() + dX, beginPoint.getY() + dY);
    }




}
