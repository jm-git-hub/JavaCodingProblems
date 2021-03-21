package CodingProblems;

public class allFactors {
    public static void main(String[] args) {
        printFactors(32);
    }
    public static void printFactors(int number){

        int isDivisable;

        if(number<1){
            System.out.println("Invalid Value");
        }else{
            for(int i=1;i<=number;i++){

                isDivisable = number%i;

                if(isDivisable==0){
                    System.out.println(i);

                }
            }
        }
    }
}
