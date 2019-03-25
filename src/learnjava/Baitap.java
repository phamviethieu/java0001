package learnjava;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Baitap {
	static 	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(UCLN(255, 5));
		list();
		mang();
		solonhon(3,2);
		ptb2(-1,2,3);
		kiemtratamgiac();
		
		
	}
	public static void list() {
	
		List a = new ArrayList();
		int phantu;
		
		for(int i=0; i<5; i++) {
			System.out.print("nhap phan tu thu " + (i+1));
			phantu = sc.nextInt();
			a.add(phantu);
		}
		
		for(int i = 0; i<5; i++) {
			System.out.println(a.get(i));
		}
	}
	public static void solonhon(int a, int b) {
		if (a>b)
			{System.out.println(a);}
		
		else if (a<b)
			{System.out.println(b);}
		
		else 
			{System.out.println(0);}
	}
	public static void tong3so(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("Tong 3 so la : " + d);
	}
	public static void mang() {
		int[] a = new int[5];
		int max = 0 ;
		int Tong = 0;
		int soCanTim;
		int tong2=0;
		for (int i = 0; i<5 ; i++) {
				System.out.println("Nhap phan tu thu" + (i+1));
				a[i] = sc.nextInt();
			}
		for (int i = 0; i<5 ; i++) {
				System.out.print(a[i] + "\t");
				if (max < a[i]) {
					max = a[i];
				}
				Tong = Tong + a[i];
			}
		System.out.println("\n");
		System.out.println("max la : " + max + "Tong cac phan tu = " + Tong);
		System.out.println("Nhap phan tu can tim: ");
		soCanTim = sc.nextInt();
		for(int i = 0; i<5; i++) {
				if (soCanTim == a[i]) {
					System.out.println("vi tri: " +  (i+1));
					for(int j=0; j<=i; j ++) {
					tong2 += a[j];
					}
				}
			}
		System.out.println("tong tu dau den vi tri cua "+ soCanTim + " = "+ tong2);
		
	}
	
	
	
	 public static void ptb2(float a , float b, float c){
	        float del;
	        double  x1, x2;
	        if (a == 0) {
	            if (b==0)
	            {
	                if(c==0)
	                System.out.println("Pt vo so nghiem");
	                else 
	                System.out.println("Pt vo nghiem");
	            }
	            if (b!=0)
	            {
	                System.out.println("Pt co nghiem la : " + (-c/b));
	            }
	        }
	        else {
	            del = b*b - 4 * a* c;
	            if (del < 0){
	                System.out.println("Pt vo nghiem");
	            }
	             if (del == 0){
	                System.out.println("Pt co nghiem kep" + (-b/2*a));
	            }
	             else{
	                 x1 = (-b + Math.sqrt(del))/(2*a);
	                 x2 = (-b - Math.sqrt(del))/(2*a);
	                 System.out.println("Pt co 2 nghiem : x1 = " + x1 + "x2 = " +x2 );
	             }
	        }
	    }
	   
	 public static void kiemtratamgiac(){
		 	int a;
	        int b;
	        int c;
	        System.out.println("Nhap 3 canh: ");
	        a = sc.nextInt();
	        System.out.println("Nhap canh thu 2: ");
	        b = sc.nextInt();
	        System.out.println("Nhap canh thu 3: ");
	        c = sc.nextInt();
	        if ((a+b) <= c || ((a+c)<=b) || (b+c)<= a){
	            
	            System.out.println("Day ko phai la ba canh cua 1 tam giac ");
	        }
	        else 
	            System.out.println("day la ba canh 1 tam giac");
	    }
	public static int UCLN(int a, int b) {
		int UCLN = 1;
		int i = 2;
		while (i <= a && i <= b) {
			if( a%i ==0 && b%i == 0) {
				UCLN = i ;
			}
			i++;
		}
		return UCLN;
	}
	
}
