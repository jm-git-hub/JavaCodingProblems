package CodingProblems;

public class getEvenDigitsSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
    }

    public static int getEvenDigitSum(int number){

        int evenSum=0;

        if(number<0){
            return -1;
        }else{

            int lastNumber;
            int newNumber=number;

            do {
                lastNumber = newNumber % 10;

                if(lastNumber%2==0){
                    evenSum+=lastNumber;
                }

                newNumber = newNumber / 10;
            }
            while (newNumber != 0);
        }

        return evenSum;
    }
}
