package learnjava;

import java.util.Scanner;

public class btmang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];

		nhapmang(a, 5);
		inmang(a, 5);
		timMax(a, 5);
		tongPhanTu(a, 5);
		TimPhanTuVaTinhTong(a, 5);

	}

	public static void nhapmang(int a[], int n) {
		for (int i = 0; i < n; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap phan tu thu" + (i + 1));
			a[i] = sc.nextInt();
		}
	}

	public static void inmang(int a[], int n) {

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println("\n");
	}

	public static void timMax(int a[], int n) {
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (max <= a[i]) {
				max = a[i];

			}
		}
		System.out.println("max la : " + max);
	}

	public static void tongPhanTu(int a[], int n) {
		int Tong = 0;
		for (int i = 0; i < n; i++) {
			Tong = Tong + a[i];
		}
		System.out.println("Tong cac phan tu trong mang la: " + Tong);
	}

	public static void TimPhanTuVaTinhTong(int a[], int n) {
		Scanner sc = new Scanner(System.in);
		int tong2 = 0;
		int soCanTim;
		System.out.println("Nhap phan tu can tim: ");
		soCanTim = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (soCanTim == a[i]) {
				System.out.println("vi tri: " + (i + 1));
				for (int j = 0; j <= i; j++) {
					tong2 += a[j];
				}
			}
		}
		System.out.println("tong tu dau den vi tri cua " + soCanTim + " = " + tong2);
	}
}
