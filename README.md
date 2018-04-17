# view-twitter-stream

Scalaによる実装  
Twitter Streaming APIを用いて実装

## Requirements

- Java8
- sbt
- TwitterのAPIキー https://apps.twitter.com/

```
sbt:view-twitter-stream> sbtVersion
[info] 1.1.2
```

## 準備

下記のように設定を./src/main/resources/twitter4j.propertiesに記述する  

```twitter4j.properties
debug=false
oauth.consumerKey=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
oauth.consumerSecret=bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
oauth.accessToken=cccccccccccccccccccccc
oauth.accessTokenSecret=dddddddddddddddddddddd
http.proxyHost=your.proxy.com
http.proxyPort=8080
```

## 実行

```
$ sbt run
```

または、

```
$ sbt assembly
$ java -jar ./target/scala-2.12/view-twitter-stream-assembly-0.1.jar
```
