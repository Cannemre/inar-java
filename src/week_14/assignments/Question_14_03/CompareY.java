package week_14.assignments.Question_14_03;

import java.util.Comparator;

public class CompareY implements Comparator<Points> {
    @Override
    public int compare(Points o1, Points o2) {
        if (o1.getY() > o2.getY()) {
            return 1;
        } else if (o1.getY() < o2.getY()) {
            return -1;
        } else {
            return Double.compare(o1.getX(), o2.getX());
        }
    }
}
