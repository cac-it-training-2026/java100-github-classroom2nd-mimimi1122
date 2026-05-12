/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です!!");

		int sit = 30;
		int choko = 30;
		int pis = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + sit + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + choko + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pis + "個");

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン      >");
		String sit2 = reader.readLine();
		int sit3 = Integer.parseInt(sit2);

		System.out.print("ショコラ      >");
		String choko2 = reader.readLine();
		int choko3 = Integer.parseInt(choko2);

		System.out.print("ピスターシュ  >");
		String pis2 = reader.readLine();
		int pis3 = Integer.parseInt(pis2);

		System.out.println("\nシトロン     " + sit3 + "個");
		System.out.println("ショコラ     " + choko3 + "個");
		System.out.println("ピスターシュ " + pis3 + "個");

		System.out.println("\n合計個数     " + (sit3 + choko3 + pis3) + "個");
		System.out.println("\n合計金額     " + (sit3 * 250 + choko3 * 280 + pis3 * 320) + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");
	}

}
