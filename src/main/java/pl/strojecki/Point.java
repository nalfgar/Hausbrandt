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


    public double deltaX(Point endPoint) {
        return endPoint.getX() - this.getX();
    }

    public double deltaY(Point endPoint) {
        return endPoint.getY() - this.getY();
    }

    public double distance(Point endPoint) {
        double deltaX = deltaX(endPoint);
        double deltaY = deltaY(endPoint);
        return sqrt((deltaX*deltaX) + (deltaY*deltaY));
    }


}
