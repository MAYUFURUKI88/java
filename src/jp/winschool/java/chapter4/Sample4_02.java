package jp.winschool.java.chapter4;

public class Sample4_02 {
	
	/*インクリメントの前置・後置*/

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int c;
		
		c = ++a;
		System.out.println("前置インクリメントの結果cは" + c +"に、aは"+ a +"になりました。");
		
		c = b++;
		System.out.println("後置インクリメントの結果cは"+c+"に、bは"+b+"になりました。");
		

	}

}
