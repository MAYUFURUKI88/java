package jp.winschool.java.chapter1;

public class Sample1_03 {

	public static void main(String[] args) {
		long a;
		a = (int)Math.floor(Math.random()*10);
		System.out.println("今日のラッキーナンバーは"+a+"です。");
		
		if (a <= 3) {
			System.out.println("今日は焦らずゆっくり過ごしましょう");
			}
		else if(a >= 4 && a <= 6) {
			System.out.println("今日は普通な一日です。");
		}
		else if(a >= 7) {
			System.out.println("今日は勢いにまかせてどんどん行きましょう。");
		}
	}

}
