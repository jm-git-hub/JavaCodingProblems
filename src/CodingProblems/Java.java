package CodingProblems;

import java.awt.*;

public class Java {

    public static void main(String[] args) {

        System.out.println(getDaysInMonth(1 ,10000));
    }


    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 && month > 12) {
            return -1;
        }
        if (year < 1 && year > 9999) {
            return -1;
        }

        if (isLeapYear(year) == true) {
            switch (month) {
                case 1:
                    return 31;
                case 2:
                    return 29;
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
                default:
                    return -1;


            }

        } else if (isLeapYear(year) == false && (year >= 1 && year <= 9999)) {
            switch (month) {
                case 1:
                    return 31;
                case 2:
                    return 28;
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
                default:
                    return -1;
            }

        }else{
            month = -1;
        }
        return month;
    }
    }



