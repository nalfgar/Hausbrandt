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


    public double azimuth(Point endPoint) {
        double dX = dX(endPoint);
        double dY = dY(endPoint);
        return atan2(dY, dX);
    }

    public double angle(Point leftPoint, Point rightPoint) {
        double dXleft = dX(leftPoint);
        double dYleft = dY(leftPoint);
        double dXright = dX(rightPoint);
        double dYright = dY(rightPoint);
        SimpleForm angle = new SimpleForm(dXleft, dYleft, dXright, dYright);


        return atan(angle.f0());
    }
}
