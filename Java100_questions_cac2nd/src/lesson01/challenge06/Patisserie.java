/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		int totalc = sit3 + choko3 + pis3;
		int totalp = 250 * sit3 + 280 * choko3 + 320 * pis3;

		System.out.println("\n合計個数     " + totalc + "個");
		System.out.println("\n合計金額     " + totalp + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		sit = sit - sit3;
		choko = choko - choko3;
		pis = pis - pis3;

		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン   		\\250 ・・・ 残り" + sit + "個");
		System.out.println("ショコラ   		\\280 ・・・ 残り" + choko + "個");
		System.out.println("ピスターシュ   	\\320 ・・・ 残り" + pis + "個");
	}

}
