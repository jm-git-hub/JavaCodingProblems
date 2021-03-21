package CodingProblems;

public class perfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(33550336));
    }
    public static boolean isPerfectNumber(int number){

        int isNumDivis;
        int sum = 0;
        boolean result = false;

        if(number<1){
            return result;
        }else{
            for(int i=1;i<=number;i++){
                isNumDivis = number%i;

                if(isNumDivis==0){
                    sum+=i;
                    result = (sum - number) == number;
                }
            }
        }
        return result;
    }
}
