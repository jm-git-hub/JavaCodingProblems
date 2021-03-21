package CodingProblems;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double Imaginary){
        this.real=real;
        this.imaginary =Imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real,double Imaginary){
        this.real+=real;
        this.imaginary +=Imaginary;
    }

    public void add(ComplexNumber complex){
        this.real+=complex.real;
        this.imaginary +=complex.imaginary;
    }

    public void subtract(double real, double Imaginary){
        this.real-=real;
        this.imaginary -=Imaginary;
    }

    public void subtract(ComplexNumber complex){
        this.real-=complex.real;
        this.imaginary -=complex.imaginary;
    }


    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }


}
