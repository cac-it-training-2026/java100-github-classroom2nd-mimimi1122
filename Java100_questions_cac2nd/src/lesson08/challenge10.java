package lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SuperRobot {
	String name = "スーパーロボット";

	/**
	 * 豪華なハンバーグを作成するメソッド
	 * @param meatNum        ひき肉の量(g)
	 * @param onionNum       玉ねぎの個数
	 * @param eggNum         卵の個数
	 * @param breadcrumbsNum パン粉の量(g)
	 * @return 作成されたメニュー名（条件を満たさない場合はnull）
	 */
	String makeHamburgSteak(int meatNum, int onionNum, int eggNum, int breadcrumbsNum) {

		String menu = null;

		// 豪華な特製ハンバーグの条件：ひき肉200g以上、玉ねぎ1個以上、卵1個以上、パン粉10g以上
		if (meatNum >= 200 && onionNum >= 1 && eggNum >= 1 && breadcrumbsNum >= 10) {
			menu = "極上！特製ハンバーグ";
		}
		// 普通のハンバーグの条件：ひき肉100g以上、玉ねぎ1個以上
		else if (meatNum >= 100 && onionNum >= 1) {
			menu = "家庭の味・手作りハンバーグ";
		}
		// 条件を満たさない場合
		else {
			menu = null;
		}

		return menu;
	}
}

public class challenge10 {

	public static void main(String[] args) throws IOException {

		System.out.println("Rさん：");
		System.out.println("G博士のロボットは簡単な料理しかできないので、私が独自に高性能な調理ロボットを作りました！\n");
		System.out.println("G博士：");
		System.out.println("なんと！どれほどの料理が作れるのかの？\n");
		System.out.println("Rさん：");
		System.out.println("極上のハンバーグを作ることができます。早速試してみましょう。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ひき肉の量を入力してください（グラム）＞");
		String meatNumStr = br.readLine();
		int meatNum = Integer.parseInt(meatNumStr);

		System.out.print("\n玉ねぎの個数を入力してください＞");
		String onionNumStr = br.readLine();
		int onionNum = Integer.parseInt(onionNumStr);

		System.out.print("\n卵の個数を入力してください＞");
		String eggNumStr = br.readLine();
		int eggNum = Integer.parseInt(eggNumStr);

		System.out.print("\nパン粉の量を入力してください（グラム）＞");
		String breadcrumbsNumStr = br.readLine();
		int breadcrumbsNum = Integer.parseInt(breadcrumbsNumStr);

		// SuperRobotクラスのインスタンスを作成
		SuperRobot superRobot = new SuperRobot();

		// makeHamburgSteakメソッドを実行
		String menu = superRobot.makeHamburgSteak(meatNum, onionNum, eggNum, breadcrumbsNum);

		System.out.println();

		// 戻り値に応じた結果の表示
		if (menu != null) {
			System.out.println("Rさん渾身の【" + menu + "】が完成しました！");
		} else {
			System.out.println("材料が足りず、何も作れませんでした…。");
		}
	}
}