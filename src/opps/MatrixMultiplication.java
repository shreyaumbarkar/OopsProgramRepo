package opps;

public class MatrixMultiplication {
	public static void main (String args[]) {
	int a[][]={{7,5,1},{2,6,2},{3,3,7}};
	int b[][]={{1,6,9},{2,3,8},{6,3,5}};
	int c[][]=new int[3][3];
for(int i=0; i<3; i++){
for(int j=0; j<3; j++){
for(int k=0;k<3;k++){
	c[i][j]=a[i][k]*b[k][j];
}
System.out.print(c[i][j]+ "   ");
}
System.out.println();
}
}
}
	