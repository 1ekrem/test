
public class ArrayDemo {

	public static void main(String[] args) {
		
	/*	int a;
		a=4;
		
		System.out.println(a); */
		
		//What if I want to define 5 integer values ? Then I have to use the arrays

		int a[] = new int[5];
		
		a[0]=2;
		a[1]=4;
		a[2]=6;
		a[3]=8;
		a[4]=12;
		
		int b[]= {1,3,5,7,9};
			
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(" ******** New Line ****** ");
		for (int k=0;k<b.length;k++) {
			System.out.println(b[k]);
		}

	}

}
