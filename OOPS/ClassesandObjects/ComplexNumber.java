package OOPS.ClassesandObjects;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real,int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public void setReal(int num){
        this.real = num;
    }

    public void setImaginary(int num){
        if(num == 0){
            imaginary = 1;
        }
        this.imaginary = num;
    }

    public int getReal(){
        return(real);
    }

    public int getImaginary(){
        return(imaginary);
    }

    public void print(){
        System.out.println(real+"+i"+imaginary);
    }

    public void add(ComplexNumber c2){
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }

    public static ComplexNumber add(ComplexNumber c1,ComplexNumber c2){
        int newReal = c1.real + c2.real;
        int newImaginary = c1.imaginary + c2.imaginary;
        ComplexNumber c4 = new ComplexNumber(newReal, newImaginary);
        return c4;
    }

    public static ComplexNumber multiply(ComplexNumber c1,ComplexNumber c2){
        int newReal = (c1.real * c2.real) - (c1.imaginary *c2.imaginary);
        int newImaginary = (c1.real * c2.imaginary) + (c1.imaginary * c2.real);
        ComplexNumber c3 = new ComplexNumber(newReal, newImaginary);
        return c3;
    }
    // -bd
}
