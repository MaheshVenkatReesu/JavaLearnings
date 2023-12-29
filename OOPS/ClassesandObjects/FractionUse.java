package OOPS.ClassesandObjects;

public class FractionUse {
    public static void main(String[] args){
        Fraction f1 = new Fraction(4, 6);
        Fraction f2 = new Fraction(1, 2);
        int num = 5;
        // f1.setNumerator( num);
        // f1.setDenominator(0);
        f1.print();
        f1.increment(2);
        f1.print();
        f1.add(f2);
        f1.print();

        Fraction f3 = Fraction.add(f1,f2);
    }
}
