package week_08.assignments;

public class Question_08_07 {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};
        double minDistance = distance(points, 0, 1);
        int point1 = 0;
        int point2 = 1;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (distance(points, i, j) < minDistance) {
                    minDistance = distance(points, i, j);
                    point1 = i;
                    point2 = j;
                }
            }
        }
        System.out.printf("The closest two points are (%.1f, %.1f, %.1f) and (%.1f, %.1f, %.1f)", points[point1][0], points[point1][1], points[point1][2], points[point2][0], points[point2][1], points[point2][2]);
    }

    public static double distance(double[][] points, int point1, int point2) {
        return Math.sqrt(Math.pow(points[point2][0] - points[point1][0], 2) + Math.pow(points[point2][1] - points[point1][1], 2) + Math.pow(points[point2][2] - points[point1][2], 2));
    }
}
