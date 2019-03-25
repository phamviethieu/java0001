package learnjava;

public class songuyento {
	public static void main(String[] args) {
		int[] a = new int[100];
		for (int j = 0; j < 100; j++) {
			a[j] = j;
			if (ktraSnt(a[j])) {
				System.out.print(a[j] + " ");

			} else {
			}
		}
	}

	public static boolean ktraSnt(int n) {
		int i;

		for (i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
			else
				return true;
		}
		return true;
	}
}
