package CodingProblems;

public class sharedDigit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(54, 12));
    }

    public static boolean hasSharedDigit(int a, int b) {

        int a1=a%10;
        int A=a/10;
        int a2=A%10;

        int b1=b%10;
        int B=b/10;
        int b2=B%10;

        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {

            return (a1 == b1) || (a1 == b2) || (a2 == b1) || (a2 == b2);

        } else {
            return false;
        }
    }
}