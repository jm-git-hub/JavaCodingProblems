package CodingProblems;

public class LargestPrime {
    public static void main(String[] args) {

        System.out.println(getLargestPrime(12));
    }

    public static int getLargestPrime(int number) {

        if (number<2){
            return -1;
        }

        for (int i = number; i > 1; i--) {
            if (number % i == 0) {
                for (int j = i; j > 1; j--) {
                    if (i % j == 0 && j>2) {
                        number = j;
                    } else {
                        number = i;
                    }
                }
            }
        }return number;
    }
}
