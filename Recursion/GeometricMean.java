package Recursion;

public class GeometricMean {
    public static double findGeometricSum(int k){
		// Write your code here
		if(k == 0){
			return(1);
		}
		double smallOutput = findGeometricSum(k-1);
		return((1/Math.pow(2, k))+smallOutput);
	}
    public static void main(String[] args){
        int num = 10;
        System.out.println(findGeometricSum(num));
    }
}
