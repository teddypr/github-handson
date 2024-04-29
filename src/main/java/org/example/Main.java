package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main extends Throwable {

    private static java.lang.String String;

    public static void main(String[] args) {

        //Mapを作成
        var momocloMap = new HashMap<Integer, String>();

        //Mapに値を格納
        momocloMap.put(1, "玉井詩織: ももクロの若大将");
        momocloMap.put(2, "百田夏菜子: えくぼは恋の落とし穴");
        momocloMap.put(3, "佐々木彩夏: ちょっぴりセクシーでおちゃめなももクロのアイドル");
        momocloMap.put(4, "高木れに: ももクロの鋼少女");

        //Mapの値を取り出して表示
        for (var number : momocloMap.keySet()) {
            var value = momocloMap.get(number);
            System.out.println("出席番号：" + number + "   " + "自己紹介：" + value);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("出席番号を入力してください:");

        //inputmismatchexceptionが発生したら、入力が数値でない可能性があります。
        // 例外処理を追加して、入力が数値でない場合に再入力を促す
        if (!scanner.hasNextInt()) {
            throw new IllegalArgumentException("出席番号は数字で入力してください");
        }

        int menberId = scanner.nextInt();
        scanner.close();

        //メンバーIDに対するメンバー情報を取得
        String memberName = momocloMap.get(menberId);
        if (memberName != null) {
            System.out.println("メンバー名" + memberName);
        } else {
            System.out.println("該当するメンバーはいません");
        }

    }
}
