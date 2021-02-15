package jp.winschool.java.chapter4;

public class Sample4_03 {
	
	/*複合的な代入演算子*/

	public static void main(String[] args) {
		
		int a = 15;
		int b = 7;
		int sum = 0;
		
		sum += a;
		System.out.println("aまで足した結果は" + sum);
		
		sum += b;
		System.out.println("bまで足した結果は" + sum);

	}

}
