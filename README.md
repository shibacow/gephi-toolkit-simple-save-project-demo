# シンプルなgephi toolkit セーブテスト

javaとkotlinで書いている。

# 作った目的

gephi toolkit v0.10.1,v0.10.0 のsaveProjectでファイルが保存されないバグが有ったため、検証のため作った。
ちょうどよく最もシンプルなgephi toolkitのサンプルコードになったのでおいておく

# 準備

## gephi toolkit jarのダウンロード

[Gephi toolkit 0.10.1](https://github.com/gephi/gephi-toolkit/releases/tag/v0.10.1)から  `gephi-toolkit-0.10.1-all.jar`  をダウンロードして、`lib` 以下に置く


# 実行

## kotlin版

`simple_save.sh` を実行する。

```
$./simple_save.sh
```

## java版

`run.sh` を実行する

```
$./run.sh
```

# その他参考リソース

[gephi toolkit demo](https://github.com/gephi/gephi-toolkit-demos) はjavaで書かれており、kotlinで書き直した。

https://github.com/shibacow/gephi-toolkit-demos-kotlin
