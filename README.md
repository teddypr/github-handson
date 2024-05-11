# GitHub-Handson
RaiseTech(Javaコース)の課題をここに出します。

## 第5回目課題
  <u>HTTPにまつわる用語</u>を調べ、自分なりの言葉でまとめる。
  <br>

#### URL
    ホームページの置いてある場所やファイル名を示す情報。
    「Uniform Resource Locator（ユニフォーム・リソース・ロケータ）」の略であり、日本では統一資源位置指定子という呼び方が一般的。
      
  ⚫︎下記の場合、次のような構成となる。</br>
    　`例）http://yohei:pass＠blog.example.jp:8000/search?q=test&debug=true#n10`
     
    　・URLスキーム（http://」「https://」「ftp://」等） 
    　・ユーザー情報（「yohei:pass」等/省略可能な場合もある）
    　・ホスト名（「blog.example.jp」等）
    　・ポート番号（「8000」等/省略可能な場合もある）
    　・パス（「/search」等）
    　・クエリパラメータ（「q=test&debug=true」等/省略可能な場合もある）
    　・URIフラグメント（「#n10」等/省略可能な場合もある）
    
***

#### クエリ文字列(クエリパラメータ)
    サーバに情報を送るために、URLの末尾に付け足す文字列。
    省略可能であり、検索・フィルタなどプラスアルファの条件を付け足したい時に用いる。
    データの受け渡し（本を検索した履歴、氏名と年齢の情報入力など）、データの解析（どこからサイトに来たのか）を行う。

  `特徴`</br>
  「？」記号で始まり、「名前＝値」という形式でパラメーターが続く。</br>
   複数のパラメーターを送信する場合は、「＆」記号で区切る。


>例）「 https://www.amazon.co.jp/s?k=java&__mk_ja_JP=%E3%82%AB%E3%82%BF%E3%82%AB%E3%83%8A&crid=32BJ08ZS5EUT&sprefix=java%2Caps%2C172&ref=nb_sb_noss_1 」 >「?k=java」以降の部分がクエリ文字列に該当する。
    
    
#### パス変数（パスパラメータ）
    URLの一部を変数として利用するパラメータ。
    パス変数を使うことで、ウェブサイトの特定のページに直接アクセスができる（一意なリソースを表すために必要）。

>例）「https://news.yahoo.co.jp/categories/it」>categoriesの後の「it」がパス変数に該当する。
パスの前の名詞は複数形にする（パスは必ず複数ある）

    
#### クエリ文字列とパス変数の違い
    特定のものに条件を追加する際に必要なものなのがものなのが「クエリパラメータ」（主に検索で使用）。
    一意のリソースから特定のものを表示したい際に、直接そのリソースに飛ばしてくれるのが「パスパラメータ」（主に共有で使用）。
  

<br>

***

#### リクエストヘッダー
    HTTPリクエストを構成する３つの部品のうちのひとつ。
    メッセージの本文には影響せず、WebブラウザからWebサーバに対して行いたい制御情報（ボディに対する付加情報）を記述する場所。
    
  　以下の内容がある。
- クライアントの情報：ブラウザの種類やバージョンなど
- リクエストの内容：どのようなデータを受け取りたいか、どの言語を優先するかなど
- セッション情報：クッキーや認証情報など

<br>

***

#### HTTPメソッド
    クライアントが行いたい処理を、サーバーに預けるための手段。
|メソッド名 | メソッドの内容  |
|:-------:|:-----------------------------------------------|
|GET      | リソースの取得                                      |
|POST     | 子リソースの作成、リソースへのデータの追加、そのほかの処理 |
|PUT      | リソースの更新、リソースの作成                         |
|DELETE   | リソースの削除     
</br>                                 
    

#### HTTPステータスコード
    テキストフレーズにある3桁の数字であり、先頭の数字によって次の５つに分類される。

|数字   | 意味　　　　|
|:-------:|:-----------|
| 1xx()| 処理中|
| 2xx()| 成功|
| 3xx()| リダイレクト（新しい情報への接続）|
| 4xx()| クライアントエラー（クライアントのリクエストに原因あり|
| 5xx()| サーバーエラー|
</br>


`具体例`
- 200 ：リクエスト成功
- 201 ：リソースの作成成功
- 400 ：リクエストの間違い（リクエストの構文やパラメータを間違えていた）
- 404 ：リソースの不在
- 500 ：サーバー内部エラー
<br>

***

#### レスポンスヘッダー
    HTTPレスポンスを構成する３つの部品のうちのひとつ。
    「HTTPステータスラインに書ききれないレスポンスの情報」が書かれている場所(レスポンスのステータスコードやサーバーのバージョン、セキュリティ関連の情報など）。
    
    書式は以下の構成をとる。
    【フィールド名（Content-Typeなど）】：【内容（それらの項目に対する実際の値）】

#### レスポンスボディ
    HTTPレスポンスを構成する３つの部品のうちのひとつ。
    「クライアントが要求したデータ本体」が書かれている場所（WebページのHTML、画像、その他のメディアなど、クライアントが要求したリソースの実際の内容を含む。）。

(![HTTPレスポンス](https://github.com/teddypr/github-handson/assets/167724830/91ce790a-e783-4116-bde8-d5c95161ab92)
<br>

***

#### JSONとは何か
    JavaScript Object Notationの略。
    PFC4627が規定するデータ記述言語。JavaScriptの記法でデータを記述できる。

    操作の結果は前述した`HTTPレスポンス`と`JSON`で返される。
    XMLに比べるとデータがシンプルであり、Ajax通信におけるデータフォーマットとして活用されている。

`JSONを使用したデータ表現`</br>

例) 

```"UserInfo" :
  [
      { "id" : 1,  "name" : “ちいかわ, “favorite item” : “くまのポシェット” },
      { "id" : 2,  "name" : “ハチワレ, “favorite item” : "カメラ”}
   ] 
```
</br> 上記のコードからユーザーのお気に入りアイテムを表示

