package OOPS.ClassesandObjects;

public class Polynomial {
    DynamicArray coefficients;
    private DynamicArray degrees;

    public Polynomial(){
        coefficients = new DynamicArray();
        degrees = new DynamicArray();
    }

    public void setCoefficient(int degree, int coeff){
        if(coefficients.nextElementIndex < degree){
            while(coefficients.nextElementIndex < degree){
                coefficients.add(0);
            }
        }
        coefficients.set(degree, coeff);
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
        boolean isFirstTerm = true;
        for (int i = 0; i < coefficients.size(); i++) {
            int coeff = coefficients.get(i);
            if (coeff != 0) {
                if (!isFirstTerm && coeff > 0) {
                    System.out.print(" + ");
                }
                if (coeff < 0) {
                    System.out.print(" - ");
                }
                isFirstTerm = false;
                System.out.print(Math.abs(coeff));
                if (i > 0) {
                    System.out.print("x^" + i);
                }
            }
        }
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
		Polynomial result = new Polynomial();
        int maxDegree = Math.max(this.coefficients.size(), p.coefficients.size());

        for (int i = 0; i < maxDegree; i++) {
            int coeff1 = this.coefficients.get(i);
            int coeff2 = p.coefficients.get(i);
            result.setCoefficient(i, coeff1 + coeff2);
        }

        return result;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
        Polynomial result = new Polynomial();
        int maxDegree = Math.max(this.coefficients.size(), p.coefficients.size());

        for (int i = 0; i < maxDegree; i++) {
            int coeff1 = this.coefficients.get(i);
            int coeff2 = p.coefficients.get(i);
            result.setCoefficient(i, coeff1 - coeff2);
        }

        return result;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		Polynomial result = new Polynomial();

        for (int i = 0; i < this.coefficients.size(); i++) {
            for (int j = 0; j < p.coefficients.size(); j++) {
                int degree = i + j;
                int coeff1 = this.coefficients.get(i);
                int coeff2 = p.coefficients.get(j);
                int newCoeff = result.coefficients.get(degree) + coeff1 * coeff2;
                result.setCoefficient(degree, newCoeff);
            }
        }
        return result;
	}
}
