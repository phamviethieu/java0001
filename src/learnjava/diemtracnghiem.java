package learnjava;

import java.util.Scanner;

public class diemtracnghiem {
	public static void main(String[] args) {

		char[][] a = new char[7][9];
		char[] b = new char[7];
		nhap(a, 7, 9);
		nhapDapAn(b, 7);
		chamDiem(a, 7, 9, b);

	}

	public static void nhap(char a[][], int m, int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				System.out.println("Nhap cau tra loi cho hoc sinh" + (i + 1) + "mon" + (j + 1));
				a[i][j] = sc.next().charAt(0);
			}
	}

	public static void in(char a[][], int m, int n) {
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j]);
			}

	}

	public static void chamDiem(char a[][], int m, int n, char dapan[]) {
		int diem = 0;
		int i, j;
		for (j = 0; j < n; j++) {
			for (i = 0; i < m; i++) {
				{
					if (a[i][j] == dapan[j]) {
						diem = diem + 1;
					}
				}
				System.out.println("Diem cua hoc sinh " + (i + 1) + "la" + diem);

			}
		}
	}

	public static void nhapDapAn(char a[], int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap dap an cho mon " + (i + 1));
			a[i] = sc.next().charAt(0);
		}
	}
}
