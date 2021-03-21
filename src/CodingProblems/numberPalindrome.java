package CodingProblems;

public class numberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(10002));
    }
    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int lastNumber;
        int newNumber=number;

        do {
            lastNumber = newNumber % 10;
            reverse = 10 * reverse;
            reverse = reverse + lastNumber;
            newNumber = newNumber / 10;
        }
        while (newNumber != 0);

        if (number == reverse) {

            return true;

        } else {

            return false;

        }
    }
}

