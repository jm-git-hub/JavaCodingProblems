package CodingProblems;

public class LastTwoDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(11, 22, 31));
        System.out.println(isValid(41));
    }
    public static boolean hasSameLastDigit(int a, int b, int c) {

        if ((a >= 10 && a <= 1000) && (b >= 10 && b <= 1000) && (c >= 10 && c <= 1000)) {

            while(true) {

                if (a % 10 == b % 10) {
                    a /= 10;
                    b /= 10;
                    if (a % 10 == b % 10) {
                        return true;
                    }
                } else if (a % 10 == c % 10) {
                    a /= 10;
                    c /= 10;
                    if (a % 10 == c % 10) {
                        return true;
                    }
                } else if (b % 10 == c % 10) {
                    b /= 10;
                    c /= 10;
                    if (b % 10 == c % 10) {
                        return true;
                    }
                } else {
                    return false;
                }

            }

        }else{
            return false;
        }
    }

    public static boolean isValid(int x){
        if (x >= 10 && x <= 1000) {
            return true;
        }else {
            return false;
        }

    }
}