package org.example;

public class Dog {
    /**
     * name,age,favoriteFood変数を定義
     */
    private String name;
    private int age;
    private String favoriteFood;
    //genderはいなむEnumがいい
//system.out.printf

    /**
     * コンストラクタを作成
     */
    public Dog(String name) {
        this.name = name;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }


    /**
     * get name
     */
    //アクセス修飾子　戻り値の型　メソッド名（引数の型　引数名）{
    //　　処理;
    //}
    public String getName() {
        return name;//戻り値　get＋フィールド名
    }

    public int getAge() {
        return age;
    }

    public String getfavoritefood() {
        return favoriteFood;
    }

    /**
     * set name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    /**
     * ドライブメソッド
     */
    public void drive() {
        if (age >= 14) {
            System.out.println("早く帰りたい");
        } else {
            System.out.println("もっと出かけたい！");
        }
    }

}