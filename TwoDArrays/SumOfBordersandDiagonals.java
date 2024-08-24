package TwoDArrays;

public class SumOfBordersandDiagonals {
    public static void main(String[] args){
        int mat[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

        int rows = mat.length;
		int columns;
		int sum = 0;
		if(rows != 0){
			columns = mat[0].length;
			if(columns == 0){
				System.out.println(sum);
				return;
			}
		}
		else{
			System.out.println(sum);
			return;
		}

		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				if(i == rows - 1 || j == columns -1 || i == j || i == 0 || j == 0){
					// System.out.print(mat[i][j]+" ");
					sum+=mat[i][j];
				}
			}
		}
		for (int i = 0; i < rows; i++) {
			if(i!=0 && i!=rows-1 && i != rows - 1 - i){
            	sum += mat[i][rows - 1 - i];
				// System.out.print(mat[i][rows - 1 - i]+" ");
			}
        }
		System.out.println(sum);
    }
}
