package pl.strojecki;

import lombok.AllArgsConstructor;
import lombok.Data;

import static java.lang.Math.*;


@Data
@AllArgsConstructor
public class Point {
    private double x;
    private double y;
    private double z;

    public double dX(Point endPoint) {
        return endPoint.getX() - this.getX();
    }

    public double dY(Point endPoint) {
        return endPoint.getY() - this.getY();
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

    public double angleRadians(Point leftPoint, Point rightPoint) {
        double dXLeft = dX(leftPoint);
        double dYLeft = dY(leftPoint);
        double dXRight = dX(rightPoint);
        double dYRight = dY(rightPoint);
        SimpleForm angleForm = new SimpleForm(dXLeft, dYLeft, dXRight, dYRight);
        double angle =  atan(angleForm.f0());
        return normalizeAngle(angle);
    }

    private double normalizeAngle(double angle) {
        return angle  < 0.0 ? (2 * PI) + angle : angle;
    }

    public double azimuthGradians(Point endPoint) {
        return (200/PI) * azimuthRadians(endPoint);
    }
    public double angleGradians(Point leftPoint, Point rightPoint) {
        return (200/PI) * angleRadians(leftPoint, rightPoint);
    }
}
