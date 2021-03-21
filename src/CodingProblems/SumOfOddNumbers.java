package CodingProblems;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        System.out.println(sumOdd(-1,100));
    }

    public static boolean isOdd(int number){
        if(number<0){
            return false;
        }else{
            if(number%2==0){
                return false;
            }else{
                return true;
            }
        }
    }

    public static int sumOdd(int start, int end){

        int count = 0;

        if(start<=end && (start>0 && end>0)){

            for(int i=start; i<=end; i++) {
                if (isOdd(i) == true) {
                    count += i;
                } else {
                    continue;
                }
            }
        }else{
            return count=-1;
        }
        return count;
    }
}
