package pl.strojecki;

import lombok.AllArgsConstructor;
import lombok.Data;

import static java.lang.Math.*;


@Data
@AllArgsConstructor
public class Point {
    final double PI2 = 2 * PI;


    private double x;
    private double y;
    private double z;

    public Point(double x, double y) {
        this(x, y, 0.0);
    }

    public double dX(Point endPoint) {
        return endPoint.getX() - this.getX();
    }

    public double dY(Point endPoint) {
        return endPoint.getY() - this.getY();
    }

    private double normalizeAngle(double angle) {
        while (angle < 0.0) {
            angle += PI2;
        }
        while (angle >= PI2) {
            angle -= PI2;
        }
        return angle;
        }

    public double distance(Point endPoint) {
        double dX = dX(endPoint);
        double dY = dY(endPoint);
        return sqrt((dX*dX) + (dY*dY));
    }

    public double azimuthRadians(Point endPoint) {
        double dX = dX(endPoint);
        double dY = dY(endPoint);
        return normalizeAngle(atan2(dY, dX));
    }

    public double azimuthGradians(Point endPoint) {
        return (200/PI) * azimuthRadians(endPoint);
    }

//    TODO methods below does not work correct
//    public double angleRadians(Point leftPoint, Point rightPoint) {
//        double dXLeft = dX(leftPoint);
//        double dYLeft = dY(leftPoint);
//        double dXRight = dX(rightPoint);
//        double dYRight = dY(rightPoint);
//        SimpleForm angleForm = new SimpleForm(dXLeft, dYLeft, dXRight, dYRight);
//        double angle =  atan(angleForm.f0());
//        return normalizeAngle(angle);
//    }
//
//    public double angleGradians(Point leftPoint, Point rightPoint) {
//        return (200/PI) * angleRadians(leftPoint, rightPoint);
//    }
}
