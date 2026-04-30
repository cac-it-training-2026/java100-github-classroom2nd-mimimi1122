package lesson07.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 山手線の全駅名
		String[] stations = {
				"東京", "神田", "秋葉原", "御徒町", "上野", "鴬谷", "日暮里", "西日暮里",
				"田端", "駒込", "巣鴨", "大塚", "池袋", "目白", "高田馬場", "新大久保",
				"新宿", "代々木", "原宿", "渋谷", "恵比寿", "目黒", "五反田", "大崎",
				"品川", "高輪ゲートウェイ", "田町", "浜松町", "新橋", "有楽町"
		};

		// 各駅が出たかを記憶する配列（初期値はすべて自動的にfalse）

		boolean[] used = new boolean[stations.length];

		// 出尽くした駅の数をカウントする変数
		int usedCount = 0;

		// タイトルの表示
		System.out.println("※※※ 山手線ゲーム ※※※\n");
		System.out.println("      ゲームスタート！    \n");

		// ゲームのメインループ
		//無限ループの間はゲーム進行中
		while (true) {

			// ==========================================
			// 1. ユーザー（あなた）のターン
			// ==========================================
			String input = br.readLine(); // 駅名を入力

			int targetIndex = -1; // 入力された駅名が配列の何番目にあるかを記憶する変数

			// 入力された文字列が山手線の駅名に存在するかをチェック
			for (int i = 0; i < stations.length; i++) {
				if (stations[i].equals(input)) {
					targetIndex = i; // 一致する駅が見つかったらインデックスを記録
					break;
				}
			}

			// 「駅が存在しない(targetIndexが-1のまま)」または「すでに使用済み(usedがtrue)」の場合
			if (targetIndex == -1 || used[targetIndex]) {
				System.out.println("あなたの負けです！");
				break; // 負けなのでループを抜けてプログラム終了
			}

			// 正しい駅名だったので、その駅を「使用済み」にしてカウントを増やす
			used[targetIndex] = true;
			usedCount++;

			// 全ての駅（30駅）が出尽くしたかの判定
			if (usedCount == stations.length) {
				System.out.println("あなたの勝ちです！");
				break;
			}

			// ==========================================
			// 2. コンピュータのターン
			// ==========================================
			int compIndex = 0;

			// まだ使われていない駅をランダムに探すまで繰り返す
			do {
				compIndex = (int) (Math.random() * stations.length);
			} while (used[compIndex]); // 選んだ駅が使用済み(true)なら選び直し

			// コンピュータの選んだ駅を出力
			System.out.println(stations[compIndex]);

			// 選んだ駅を「使用済み」にしてカウントを増やす
			used[compIndex] = true;
			usedCount++;

			// 全ての駅（30駅）が出尽くしたかの判定
			if (usedCount == stations.length) {
				System.out.println("あなたの勝ちです！");
				break;
			}
		}
	}
}