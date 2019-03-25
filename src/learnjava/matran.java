package learnjava;
import java.util.Scanner;
public class matran {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so hang: ");
		int rows = sc.nextInt();
		System.out.println("Nhap so cot: ");
		int cols = sc.nextInt();
		
		
		int[][] a = new int[rows][cols];
		nhapmatran(a, rows, cols);
		timMaxMaTran(a, rows, cols);
		
	}
	public static void nhapmatran(int a[][], int rows, int cols) {
		Scanner sc = new Scanner(System.in);
		int i , j;
		
		for (i =0 ; i< rows; i++)
		{
			for (j = 0; j < cols; j++) {
				do {
					System.out.println("Nhap phan tu a["+ i + "]" + "["+ j+ "]" );
					a[i][j] = sc.nextInt();
				}while(a[i][j]<0 && a[i][j]>100);
			}
		}
	}
	public static void timMaxMaTran(int a[][], int rows, int cols) {
		int i, j;
		int max = a[0][0];
	
		for (i=0; i<rows; i++) {
			for(j=0; j<cols; j++) {
				if(a[i][j]>max) {
					max = a[i][j];
					System.out.println(max + " vi tri : " + i + " " + j);
				}
			}
		}
		
	}
	
}
