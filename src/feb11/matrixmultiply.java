package feb11;

public class matrixmultiply {

	public static void main(String[] args) {

		int [][] mat1 = { {10, 0, 1},
				{0, 2, 20}
		} ;
		int [][] mat2 = { {0, 1, 2, 1},
				{2, 2, 0, 2},
				{0, 3, 3, 0},
				
				
		};
		matrixmultiply(mat1, mat2);
		
	}
	public static void matrixmultiply(int [][] mat1, int [][] mat2) {
		
		int rows1 = mat1.length ;
		int cols1 = mat1[0].length ;
		int rows2 = mat2.length ;
		int cols2 = mat2[0].length ;
		int [][] prd = new int [2][4] ;
		if(cols1 != rows2) {
			System.out.println("Multiplication not possible!");
		}
		else {
			for(int i = 0; i < prd.length; i++) {
				for(int j = 0; j < prd[0].length; j++) {
					for(int k = 0 ; k < rows2; k++) {
						prd[i][j] += (mat1[i][k] * mat2[k][j]) ; 
					}
				}
				
			}
			for(int i = 0; i < prd.length; i++) {
				for(int j = 0; j < prd[0].length; j++) {
				System.out.print(prd[i][j] + " ");
				}
				System.out.println();
				}
		}
		
		
	}

}
