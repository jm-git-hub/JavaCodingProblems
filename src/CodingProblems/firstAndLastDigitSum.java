package CodingProblems;

public class firstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLasrDigit(252));
    }
    public static int sumFirstAndLasrDigit(int number){

        int reverse = 0;
        int lastNumber;
        int newNumber = number;

        do {
            lastNumber = newNumber % 10;        //2//5//2
            reverse = 10 * reverse;             //0//20//250
            reverse = reverse + lastNumber;     //2//25//252
            newNumber = newNumber / 10;         //25//2//0
        }
        while (newNumber != 0);

        return ((number%10) + (reverse%10));
    }
}
