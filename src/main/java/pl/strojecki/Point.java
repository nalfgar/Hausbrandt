package pl.strojecki;

import lombok.AllArgsConstructor;
import lombok.Data;

import static java.lang.Math.*;
import static pl.strojecki.Tools.*;


@Data
@AllArgsConstructor
public class Point {
    private double x;
    private double y;
    private double z;

    public Point(double x, double y) {
        this(x, y, 0.0);
    }

    public double dX(Point endPoint) {
        return Tools.dX(this, endPoint);
    }

    public double dY(Point endPoint) {
        return Tools.dY(this, endPoint);
    }


    public double distance(Point endPoint) {
        double dX = Tools.dX(this, endPoint);
        double dY = Tools.dY(this, endPoint);
        return sqrt((dX*dX) + (dY*dY));
    }

    public double azimuthRadians(Point endPoint) {
        return Tools.azimuthRad(this, endPoint);
    }

    public double azimuthGrad(Point endPoint) {
        return azimuthRadians(endPoint) * RAD2GRAD;
    }

    public double angleRad(Point leftPoint, Point rightPoint) {
        double angle = this.azimuthRadians(rightPoint) - this.azimuthRadians(leftPoint);
        return normalizeAngle(angle);
    }

    public double angleGrad(Point leftPoint, Point rightPoint) {
        return angleRad(leftPoint, rightPoint) * RAD2GRAD;
    }
}
