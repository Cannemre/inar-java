package week_09.assignments;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    Location() {
    }


    public static Location locateLargest(double[][] a) {
        Location location = new Location();
        double maxValue = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    location.row = i;
                    location.column = j;
                }
            }
        }
        location.maxValue = maxValue;
        return location;
    }
}
