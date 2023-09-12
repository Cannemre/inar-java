package week_05.assignments;

import java.util.Scanner;

public class Question_05_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter first day of the year: ");
        int firstDay = input.nextInt();
        for (int i = 1; i <= 12; i++) {
            if (i == 1) {
                System.out.println("January " + year);
            } else if (i == 2) {
                System.out.println("\nFebruary " + year);
                firstDay = (firstDay + 31) % 7;
            } else if (i == 3) {
                System.out.println("\nMarch " + year);
                if (year % 4 == 0) {
                    firstDay = (firstDay + 29) % 7;
                } else {
                    firstDay = (firstDay + 28) % 7;
                }
            } else if (i == 4) {
                System.out.println("\nApril " + year);
                firstDay = (firstDay + 31) % 7;
            } else if (i == 5) {
                System.out.println("\nMay " + year);
                firstDay = (firstDay + 30) % 7;
            } else if (i == 6) {
                System.out.println("\nJune " + year);
                firstDay = (firstDay + 31) % 7;
            } else if (i == 7) {
                System.out.println("\nJuly " + year);
                firstDay = (firstDay + 30) % 7;
            } else if (i == 8) {
                System.out.println("\nAugust " + year);
                firstDay = (firstDay + 31) % 7;
            } else if (i == 9) {
                System.out.println("\nSeptember " + year);
                firstDay = (firstDay + 31) % 7;
            } else if (i == 10) {
                System.out.println("\nOctober " + year);
                firstDay = (firstDay + 30) % 7;
            } else if (i == 11) {
                System.out.println("\nNovember " + year);
                firstDay = (firstDay + 31) % 7;
            } else {
                System.out.println("\nDecember " + year);
                firstDay = (firstDay + 30) % 7;
            }
            System.out.println("--------------------------------------------------------");
            System.out.println(" Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            int jCount = 0;
            if (firstDay == 1) {
                System.out.print("         ");
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                for (int j = 1; j <= 31; j++) {
                    jCount++;
                    System.out.print(j + "      ");
                    if (jCount == 6) {
                        System.out.print("\n ");
                    }
                    if (jCount == 13) {
                        System.out.print("\n ");
                    }
                    if (jCount == 20) {
                        System.out.print("\n ");
                    }
                    if (jCount == 27) {
                        System.out.print("\n ");
                    }
                }
                } else if (i == 2) {
                    if ((year & 4) == 0) {
                        for (int j = 1; j <= 29; j++) {
                            jCount++;
                            System.out.print(j + "      ");
                            if (jCount == 6) {
                                System.out.print("\n ");
                            }
                            if (jCount == 13) {
                                System.out.print("\n ");
                            }
                            if (jCount == 20) {
                                System.out.print("\n ");
                            }
                            if (jCount == 27) {
                                System.out.print("\n ");
                            }
                        }
                    } else {
                        for (int j = 1; j <= 28; j++) {
                            jCount++;
                            System.out.print(j + "      ");
                            if (jCount == 6) {
                                System.out.print("\n ");
                            }
                            if (jCount == 13) {
                                System.out.print("\n ");
                            }
                            if (jCount == 20) {
                                System.out.print("\n ");
                            }
                            if (jCount == 27) {
                                System.out.print("\n ");
                            }
                        }
                    }
                } else {
                    for (int j = 1; j <= 30; j++) {
                        jCount++;
                        System.out.print(j + "      ");
                        if (jCount == 6) {
                            System.out.print("\n ");
                        }
                        if (jCount == 13) {
                            System.out.print("\n ");
                        }
                        if (jCount == 20) {
                            System.out.print("\n ");
                        }
                        if (jCount == 27) {
                            System.out.print("\n ");
                        }
                    }
                }
            } else if (firstDay == 2) {
                System.out.print("                ");
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    for (int j = 1; j <= 31; j++) {
                        jCount++;
                        System.out.print(j + "      ");
                        if (jCount == 5) {
                            System.out.print("\n ");
                        }
                        if (jCount == 12) {
                            System.out.print("\n ");
                        }
                        if (jCount == 19) {
                            System.out.print("\n ");
                        }
                        if (jCount == 26) {
                            System.out.print("\n ");
                        }
                    }
                } else if (i == 2) {
                    if ((year & 4) == 0) {
                        for (int j = 1; j <= 29; j++) {
                            jCount++;
                            System.out.print(j + "      ");
                            if (jCount == 5) {
                                System.out.print("\n ");
                            }
                            if (jCount == 12) {
                                System.out.print("\n ");
                            }
                            if (jCount == 19) {
                                System.out.print("\n ");
                            }
                            if (jCount == 26) {
                                System.out.print("\n ");
                            }
                        }
                    } else {
                        for (int j = 1; j <= 28; j++) {
                            jCount++;
                            System.out.print(j + "      ");
                            if (jCount == 5) {
                                System.out.print("\n ");
                            }
                            if (jCount == 12) {
                                System.out.print("\n ");
                            }
                            if (jCount == 19) {
                                System.out.print("\n ");
                            }
                            if (jCount == 26) {
                                System.out.print("\n ");
                            }
                        }
                    }
                } else {
                    for (int j = 1; j <= 30; j++) {
                        jCount++;
                        System.out.print(j + "      ");
                        if (jCount == 5) {
                            System.out.print("\n ");
                        }
                        if (jCount == 12) {
                            System.out.print("\n ");
                        }
                        if (jCount == 19) {
                            System.out.print("\n ");
                        }
                        if (jCount == 26) {
                            System.out.print("\n ");
                        }
                    }
                }

            } else if (firstDay == 3) {
                System.out.print("                       ");
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    for (int j = 1; j <= 31; j++) {
                        jCount++;
                        System.out.print(j + "      ");
                        if (jCount == 4) {
                            System.out.print("\n ");
                        }
                        if (jCount == 11) {
                            System.out.print("\n ");
                        }
                        if (jCount == 18) {
                            System.out.print("\n ");
                        }
                        if (jCount == 25) {
                            System.out.print("\n ");
                        }
                    }
                } else if (i == 2) {
                    if ((year & 4) == 0) {
                        for (int j = 1; j <= 29; j++) {
                            jCount++;
                            System.out.print(j + "      ");
                            if (jCount == 4) {
                                System.out.print("\n ");
                            }
                            if (jCount == 11) {
                                System.out.print("\n ");
                            }
                            if (jCount == 18) {
                                System.out.print("\n ");
                            }
                            if (jCount == 25) {
                                System.out.print("\n ");
                            }
                        }
                    } else {
                        for (int j = 1; j <= 28; j++) {
                            jCount++;
                            System.out.print(j + "      ");
                            if (jCount == 4) {
                                System.out.print("\n ");
                            }
                            if (jCount == 11) {
                                System.out.print("\n ");
                            }
                            if (jCount == 18) {
                                System.out.print("\n ");
                            }
                            if (jCount == 25) {
                                System.out.print("\n ");
                            }
                        }
                    }
                } else {
                    for (int j = 1; j <= 30; j++) {
                        jCount++;
                        System.out.print(j + "      ");
                        if (jCount == 4) {
                            System.out.print("\n ");
                        }
                        if (jCount == 11) {
                            System.out.print("\n ");
                        }
                        if (jCount == 18) {
                            System.out.print("\n ");
                        }
                        if (jCount == 25) {
                            System.out.print("\n ");
                        }
                    }
                }
            } else if (firstDay == 4) {
                System.out.print("                              ");
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    for (int j = 1; j <= 31; j++) {
                        jCount++;
                        System.out.print(j + "      ");
                        if (jCount == 3) {
                            System.out.print("\n ");
                        }
                        if (jCount == 10) {
                            System.out.print("\n ");
                        }
                        if (jCount == 17) {
                            System.out.print("\n ");
                        }
                        if (jCount == 24) {
                            System.out.print("\n ");
                        }
                    }
                } else if (i == 2) {
                    if ((year & 4) == 0) {
                        for (int j = 1; j <= 29; j++) {
                            jCount++;
                            System.out.print(j + "      ");
                            if (jCount == 3) {
                                System.out.print("\n ");
                            }
                            if (jCount == 10) {
                                System.out.print("\n ");
                            }
                            if (jCount == 17) {
                                System.out.print("\n ");
                            }
                            if (jCount == 24) {
                                System.out.print("\n ");
                            }
                        }
                    } else {
                        for (int j = 1; j <= 28; j++) {
                            jCount++;
                            System.out.print(j + "      ");
                            if (jCount == 3) {
                                System.out.print("\n ");
                            }
                            if (jCount == 10) {
                                System.out.print("\n ");
                            }
                            if (jCount == 17) {
                                System.out.print("\n ");
                            }
                            if (jCount == 24) {
                                System.out.print("\n ");
                            }
                        }
                    }
                } else {
                    for (int j = 1; j <= 30; j++) {
                        jCount++;
                        System.out.print(j + "      ");
                        if (jCount == 3) {
                            System.out.print("\n ");
                        }
                        if (jCount == 10) {
                            System.out.print("\n ");
                        }
                        if (jCount == 17) {
                            System.out.print("\n ");
                        }
                        if (jCount == 24) {
                            System.out.print("\n ");
                        }
                    }
                }

            } else if (firstDay == 5) {
                System.out.print("                                     ");
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    for (int j = 1; j <= 31; j++) {
                        jCount++;
                        System.out.print(j + "      ");
                        if (jCount == 2) {
                            System.out.print("\n ");
                        }
                        if (jCount == 9) {
                            System.out.print("\n ");
                        }
                        if (jCount == 16) {
                            System.out.print("\n ");
                        }
                        if (jCount == 23) {
                            System.out.print("\n ");
                        }
                        if (jCount == 30) {
                            System.out.print("\n ");
                        }
                    }
                } else if (i == 2) {
                    if ((year & 4) == 0) {
                        for (int j = 1; j <= 29; j++) {
                            jCount++;
                            System.out.print(j + "      ");
                            if (jCount == 2) {
                                System.out.print("\n ");
                            }
                            if (jCount == 9) {
                                System.out.print("\n ");
                            }
                            if (jCount == 16) {
                                System.out.print("\n ");
                            }
                            if (jCount == 23) {
                                System.out.print("\n ");
                            }
                        }
                    } else {
                        for (int j = 1; j <= 28; j++) {
                            jCount++;
                            System.out.print(j + "      ");
                            if (jCount == 2) {
                                System.out.print("\n ");
                            }
                            if (jCount == 9) {
                                System.out.print("\n ");
                            }
                            if (jCount == 16) {
                                System.out.print("\n ");
                            }
                            if (jCount == 23) {
                                System.out.print("\n ");
                            }
                        }
                    }
                } else {
                    for (int j = 1; j <= 30; j++) {
                        jCount++;
                        System.out.print(j + "      ");
                        if (jCount == 2) {
                            System.out.print("\n ");
                        }
                        if (jCount == 9) {
                            System.out.print("\n ");
                        }
                        if (jCount == 16) {
                            System.out.print("\n ");
                        }
                        if (jCount == 23) {
                            System.out.print("\n ");
                        }
                    }
                }

            } else if (firstDay == 6) {
                System.out.print("                                            ");
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    for (int j = 1; j <= 31; j++) {
                        jCount++;
                        System.out.print(j + "      ");
                        if (jCount == 1) {
                            System.out.print("\n ");
                        }
                        if (jCount == 8) {
                            System.out.print("\n ");
                        }
                        if (jCount == 15) {
                            System.out.print("\n ");
                        }
                        if (jCount == 22) {
                            System.out.print("\n ");
                        }
                        if (jCount == 29) {
                            System.out.print("\n ");
                        }
                    }
                } else if (i == 2) {
                    if ((year & 4) == 0) {
                        for (int j = 1; j <= 29; j++) {
                            jCount++;
                            System.out.print(j + "      ");
                            if (jCount == 1) {
                                System.out.print("\n ");
                            }
                            if (jCount == 8) {
                                System.out.print("\n ");
                            }
                            if (jCount == 15) {
                                System.out.print("\n ");
                            }
                            if (jCount == 22) {
                                System.out.print("\n ");
                            }
                        }
                    } else {
                        for (int j = 1; j <= 28; j++) {
                            jCount++;
                            System.out.print(j + "      ");
                            if (jCount == 1) {
                                System.out.print("\n ");
                            }
                            if (jCount == 8) {
                                System.out.print("\n ");
                            }
                            if (jCount == 15) {
                                System.out.print("\n ");
                            }
                            if (jCount == 22) {
                                System.out.print("\n ");
                            }
                        }
                    }
                } else {
                    for (int j = 1; j <= 30; j++) {
                        jCount++;
                        System.out.print(j + "      ");
                        if (jCount == 1) {
                            System.out.print("\n ");
                        }
                        if (jCount == 8) {
                            System.out.print("\n ");
                        }
                        if (jCount == 15) {
                            System.out.print("\n ");
                        }
                        if (jCount == 22) {
                            System.out.print("\n ");
                        }
                        if (jCount == 29) {
                            System.out.print("\n ");
                        }
                    }
                }

            } else {
                System.out.print("  ");
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    for (int j = 1; j <= 31; j++) {
                        jCount++;
                        System.out.print(j + "      ");
                        if (jCount == 7) {
                            System.out.print("\n ");
                        }
                        if (jCount == 14) {
                            System.out.print("\n ");
                        }
                        if (jCount == 21) {
                            System.out.print("\n ");
                        }
                        if (jCount == 28) {
                            System.out.print("\n ");
                        }
                    }
                } else if (i == 2) {
                    if ((year & 4) == 0) {
                        for (int j = 1; j <= 29; j++) {
                            jCount++;
                            System.out.print(j + "      ");
                            if (jCount == 7) {
                                System.out.print("\n ");
                            }
                            if (jCount == 14) {
                                System.out.print("\n ");
                            }
                            if (jCount == 21) {
                                System.out.print("\n ");
                            }
                            if (jCount == 28) {
                                System.out.print("\n ");
                            }
                        }
                    } else {
                        for (int j = 1; j <= 28; j++) {
                            jCount++;
                            System.out.print(j + "      ");
                            if (jCount == 7) {
                                System.out.print("\n ");
                            }
                            if (jCount == 14) {
                                System.out.print("\n ");
                            }
                            if (jCount == 21) {
                                System.out.print("\n ");
                            }
                            if (jCount == 28) {
                                System.out.print("\n ");
                            }
                        }
                    }
                } else {
                    for (int j = 1; j <= 30; j++) {
                        jCount++;
                        System.out.print(j + "      ");
                        if (jCount == 7) {
                            System.out.print("\n ");
                        }
                        if (jCount == 14) {
                            System.out.print("\n ");
                        }
                        if (jCount == 21) {
                            System.out.print("\n ");
                        }
                        if (jCount == 28) {
                            System.out.print("\n ");
                        }
                    }
                }
            }
        }
    }
}
