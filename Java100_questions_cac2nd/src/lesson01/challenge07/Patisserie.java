/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です!!");

		double sit = 30;
		double choko = 30;
		double pis = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + sit + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + choko + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pis + "個");

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン      >");
		String sit2 = reader.readLine();
		double sit3 = Double.parseDouble(sit2);

		System.out.print("ショコラ      >");
		String choko2 = reader.readLine();
		double choko3 = Double.parseDouble(choko2);

		System.out.print("ピスターシュ  >");
		String pis2 = reader.readLine();
		double pis3 = Double.parseDouble(pis2);

		System.out.println("\nシトロン     " + sit3 + "個");
		System.out.println("ショコラ     " + choko3 + "個");
		System.out.println("ピスターシュ " + pis3 + "個");

		double totalc = sit3 + choko3 + pis3;
		double totalp = 250 * sit3 + 280 * choko3 + 320 * pis3;

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
