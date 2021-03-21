package CodingProblems;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(10,35));
    }

    public static int getGreatestCommonDivisor(int first, int second){


        int x=1;
        int num1;
        int num2;

        if(first<=second){
            num1=second;
            num2=first;
        }else{
            num2=second;
            num1=first;
        }

        if(num1>=10 && num2>=10){

            for(int i=1;i<=num2;i++){
                int a = num2%i;
                int b = num1%i;

                System.out.println("first " + a + " second " + b);


                if((a==0 && b==0)) {
                    x = i;
                    //System.out.println(i);
                }
            }

        }else {
            x=-1;
        }
        return x;
    }
}
