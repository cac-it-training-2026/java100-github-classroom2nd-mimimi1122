/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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
		System.out.println("\n合計金額     " + (int) totalp + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		sit = (int) (sit - sit3);
		choko = (int) (choko - choko3);
		pis = (int) (pis - pis3);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン   		\\250 ・・・ 残り" + (int) sit + "個");
		System.out.println("ショコラ   		\\280 ・・・ 残り" + (int) choko + "個");
		System.out.println("ピスターシュ   	\\320 ・・・ 残り" + (int) pis + "個");

		System.out.println("\n閉店時間となりました。\nまたのお越しをお待ちしております。");

		int sitOnry = (int) sit3 * 250;
		int chokoOnry = (int) choko3 * 280;
		int pisOnry = (int) pis3 * 320;
		System.out.println("\n内訳");

		System.out.println("シトロン		\\" + sitOnry + "・・・ " + (int) (sitOnry / totalp * 100) + "%");
		System.out.println("ショコラ		\\" + chokoOnry + "・・・ " + (int) (chokoOnry / totalp * 100) + "%");
		System.out.println("ピスターシュ	\\" + pisOnry + "・・・ " + (int) (pisOnry / totalp * 100) + "%");

	}

}
