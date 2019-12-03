package pl.strojecki;

import lombok.AllArgsConstructor;
import lombok.Data;

import static java.lang.Math.*;


@Data
@AllArgsConstructor
public class Point {
    final double PI2 = 2 * PI;
    final double RAD2GRAD = 200 / PI;


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

    public double azimuthGrad(Point endPoint) {
        return azimuthRadians(endPoint) * RAD2GRAD;
    }

    public double angleRad(Point leftPoint, Point rightPoint) {
        double angle = this.azimuthRadians(rightPoint) - this.azimuthRadians(leftPoint);
        return normalizeAngle(angle);
    }

    public double angleGrad(Point leftPoint, Point rightPoint) {
        return (200/PI) * angleRad(leftPoint, rightPoint);
    }
}
