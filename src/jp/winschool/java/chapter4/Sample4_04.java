package jp.winschool.java.chapter4;

public class Sample4_04 {
	
	//ビット演算子

	public static void main(String[] args) {
		
		int a = 50;
		int b = 60;
		int c;
		
		System.out.println("aは\t"+a);
		System.out.println("bは\t"+b);
		
		c = a|b;
		System.out.println("a|bは\t"+c);
		
		c = a & b;
		System.out.println("a&bは\t"+c);
		
		c = ~a;
		System.out.println("~aは\t" +c);
		
		c = a<<2;
		System.out.println("a<<2は\t" +c);
		
		c = a>>3;
		System.out.println("a>>3は\t" +c);

	}

}
