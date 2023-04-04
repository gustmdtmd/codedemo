package codetest;

public class Code1 {

	public static void main(String[] args) {
		int a = 456;
		int b = 123;
		int ooo = b/100;
        int oo = (b%100)/10;
        int o = (b%100)%10;
        System.out.println(a*o);
        System.out.println(a*oo);
        System.out.println(a*ooo);
        System.out.println(a*b);
	}

}
