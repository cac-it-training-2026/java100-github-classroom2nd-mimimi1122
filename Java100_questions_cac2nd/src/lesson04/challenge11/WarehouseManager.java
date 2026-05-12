/**
 * 第4章 倉庫番のお仕事
 *
 * 問題11 荷物の入れ替え（三つの配列をまとめる）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 併せてMQ運送から依頼があり、
 * コンテナ群のうち空き箱がいくつかあるので、
 * 空いてるところは詰めてほしいと言われました。
 * つまり、
 *
 * 有、空、有、空、有
 *
 * と並んでいた場合は、
 *
 * 有、有、有、空、空
 *
 * としてほしいという依頼です。
 *
 * 各コンテナのどの箱が空き箱なのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  MQ運送の件、お願いします。
 *
 *  Yさん：
 *  はい、まずは現状から確認いたします。
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  でした。直してきます...
 *
 *  Yさん：
 *  直してきました。
 *
 *  C...3,4,4,7,5
 *
 *  D...9,2,1,3,10
 *
 *  E...6,0,0,0,0
 *
 *  になりました。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 */

package lesson04.challenge11;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに必要な配列の宣言を記述する。
		int[] element1 = new int[5];
		int[] element2 = new int[5];
		int[] element3 = new int[5];

		//ここに配列に値を代入する処理を記述する。(要素はランダム)

		for (int i = 0; i < element1.length; i++) {
			if ((int) (Math.random() * 4) == 0) { // 1/4の確率 0～3になる
				element1[i] = 0;
			} else { // 3/4の確率
				element1[i] = (int) (Math.random() * 10) + 1; // 1～10
			}
		}
		for (int i = 0; i < element2.length; i++) {
			if ((int) (Math.random() * 4) == 0) { // 1/4の確率
				element2[i] = 0;
			} else { // 3/4の確率
				element2[i] = (int) (Math.random() * 10) + 1; // 1～10
			}
		}
		for (int i = 0; i < element3.length; i++) {
			if ((int) (Math.random() * 4) == 0) { // 1/4の確率
				element3[i] = 0;
			} else { // 3/4の確率
				element3[i] = (int) (Math.random() * 10) + 1; // 1～10
			}
		}

		System.out.println("E主任：");
		System.out.println("MQ運送の件、お願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、まずは現状から確認いたします。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < element1.length; i++) {
			System.out.print(element1[i]);
			if (i != element1.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。

		for (int i = 0; i < element2.length; i++) {
			System.out.print(element2[i]);
			if (i != element2.length - 1) {
				System.out.print(",");

			}
		}
		System.out.print("\n\nE...");

		//ここに詰め替え処理を記述する

		// 全15箇所（0〜14）を順番にチェックする
		for (int i = 0; i < 14; i++) {
			// ① まず、今の場所(i)の値を確認する
			int currentVal = 0;
			if (i < 5) {
				currentVal = element1[i]; // 0〜4は配列C
			} else if (i < 10) {
				currentVal = element2[i - 5]; // 5〜9は配列D
			} else {
				currentVal = element3[i - 10]; // 10〜14は配列E
			}

			// ② もし今の場所が「0（空き箱）」だったら、右側から中身の入った箱を探して交換する
			if (currentVal == 0) {
				for (int j = i + 1; j < 15; j++) {
					// 右側の場所(j)の値を確認する
					int nextVal = 0;
					if (j < 5) {
						nextVal = element1[j];
					} else if (j < 10) {
						nextVal = element2[j - 5];
					} else {
						nextVal = element3[j - 10];
					}

					// ③ もし中身が入っていたら(0以外なら)、場所iと場所jの中身を入れ替える
					if (nextVal != 0) {
						// 場所iに、見つけた数字(nextVal)を入れる
						if (i < 5) {
							element1[i] = nextVal;
						} else if (i < 10) {
							element2[i - 5] = nextVal;
						} else {
							element3[i - 10] = nextVal;
						}

						// 見つけた場所jを「0（空き箱）」にする（これで入れ替え完了）
						if (j < 5) {
							element1[j] = 0;
						} else if (j < 10) {
							element2[j - 5] = 0;
						} else {
							element3[j - 10] = 0;
						}

						break; // 1つ交換できたら、右側を探すループ(j)は終了して次のiへ進む
					}
				}
			}
		}

		System.out.println("Yさん：");
		System.out.println("直してきました。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < element1.length; i++) {
			System.out.print(element1[i]);
			if (i != element1.length - 1) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。
		for (int i = 0; i < element2.length; i++) {
			System.out.print(element2[i]);
			if (i != element2.length - 1) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nE...");

		//ここに配列Eの要素をすべて出力する処理を記述する。
		for (int i = 0; i < element3.length; i++) {
			System.out.print(element3[i]);
			if (i != element3.length - 1) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nになりました。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}