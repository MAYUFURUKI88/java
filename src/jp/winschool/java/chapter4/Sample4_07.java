package jp.winschool.java.chapter4;

public class Sample4_07 {
	//小さなサイズの型に代入

	public static void main(String[] args) {
		int inumber;
		double dnumber = 30.48;
		
		System.out.println("1フィートは約" + dnumber + "センチメートルです");
		
		inumber = (int)dnumber;
		
		
		System.out.println("1フィートは約" + inumber + "センチメートルです");

	}

}
