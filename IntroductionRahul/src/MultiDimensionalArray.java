
public class MultiDimensionalArray {

	public static void main(String[] args) {
		//int b [][] = {{1,2,3},{6,5,4}};
		//How can you print the 2nd row and 1st column?	
		
		int a[][]=new int[2][3];
		
		a[0][0] =2;
		a[0][1] =4;
		a[0][2] =5;
		a[1][0] =3;
		a[1][1] =4;
		a[1][2] =7;
		
	
		for(int i=0;i<2;i++){
			
			for (int k=0;k<3;k++){
				System.out.println(a[i][k]);
			}
		}
		
	}

}
