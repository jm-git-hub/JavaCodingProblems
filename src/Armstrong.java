public class Armstrong {
    public static void main(String[] args) {

        int num = 153;

        int a = num;
        int x = a%10;
        x= x*x*x;

        a/=10;
        int y = a%10;
        y=y*y*y;

        a/=10;
        int z = a%10;
        z=z*z*z;

        int result = x+y+z;

        if (num==result){
            System.out.println(num + " is an Armstrong number");
        }else{
            System.out.println(num + " is NOT an Armstrong number");
        }
    }
}
