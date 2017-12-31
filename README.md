# JMH(Java Microbenchmark Harness)の使い方サンプル

```shell

$ sbt

```

コンパイル後に実行
```sbtshell
> jmh:compile
> jmh:run -i 20 -wi 20 -f1 -t 1
```

コンパイル後に別のクラスをベンチマークしたい場合は、cleanする
```sbtshell
> jmh:clean
```

#### 詳細はQiitaに記事へ
- [JMHを使ってScalaのパフォーマンスを計測する](https://qiita.com/taketora/items/0cee66b5d5552285f5de)
