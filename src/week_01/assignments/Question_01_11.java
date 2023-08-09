package week_01.assignments;

public class Question_01_11 {
    public static void main(String[] args) {
        System.out.println(" Population projection ");
        System.out.println(" Current population: 312032486 ");
        System.out.println(" One birth every 7 seconds. ");
        System.out.println(" One death every 13 seconds. ");
        System.out.println(" One new immigrant every 45 seconds. ");
        System.out.println(" Current population + ((births per year) ");
        System.out.println("                    - (deaths per year) ");
        System.out.println("                    + (new immigrants per year)) ");
        System.out.print(" Year 1 projection: ");
        System.out.println(312032486 + (31536000 / 7.0) - (31536000 / 13.0) + (31536000 / 45.0));
        System.out.print(" Year 2 projection: ");
        System.out.println(3.148125827032967E8 + (31536000 / 7.0) - (31536000 / 13.0) + (31536000 / 45.0));
        System.out.print(" Year 3 projection: ");
        System.out.println(3.1759267940659344E8 + (31536000 / 7.0) - (31536000 / 13.0) + (31536000 / 45.0));
        System.out.print(" Year 4 projection: ");
        System.out.println(3.2037277610989016E8 + (31536000 / 7.0) - (31536000 / 13.0) + (31536000 / 45.0));
        System.out.print(" Year 5 projection: ");
        System.out.println(3.231528728131869E8 + (31536000 / 7.0) - (31536000 / 13.0) + (31536000 / 45.0));

    }
}
