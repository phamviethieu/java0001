package learnjava;

public class chuyencoso {
	public static void main(String[] args){
				chuyencoso(8);
			}

	public static void chuyencoso(int n) {
		float A[] = new float[100];
		for (int i = 0; i < 100; i++) {
			A[i] = n % 2;
			A[i+1] = A[i] % 2;
		}
		for (int i = 0; i < 100; i++) {
			System.out.println(A[i]);
		}
	}

}
