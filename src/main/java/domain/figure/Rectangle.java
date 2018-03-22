package domain.figure;

import domain.point.Point;
import domain.point.Points;

import java.util.List;
import java.util.function.Function;

public class Rectangle extends Figure {
    public static final int VALID_COORDINATE_NUM = 4;

    Rectangle(Points pointRepo) {
        super(pointRepo);
    }

    public static boolean isValidRectPoints(Points pointRepo) {
        List<Point> points = pointRepo.getPoints();
        return verifyRectPoints(points, Point::getXPosition) && verifyRectPoints(points, Point::getYPosition);
    }

    private static boolean verifyRectPoints(List<Point> points, Function<Point, Integer> getPosition) {
        return points.stream().map(getPosition).distinct().count() == (VALID_COORDINATE_NUM / 2);
    }


    // TODO : 여기 바꾸기....
    @Override
    public double calcArea() {

        return 0;
    }

    private double getDiffPosition(List<Point> points, Function<Point, Integer> getPosition) {
        return points.stream().map(getPosition).distinct().reduce((a, b) -> Math.abs(a - b)).get();
    }

    @Override
    public String getFigureName() {
        return "사각형";
    }
}
