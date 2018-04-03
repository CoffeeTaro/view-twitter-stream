import twitter4j.TwitterStreamFactory

object main {
  def main(args: Array[String]): Unit = {
    // twitter streaming APIを起動
    val twitterStream = new TwitterStreamFactory().getInstance()
    val listener = new SampleListener()
    twitterStream.addListener(listener)

    // 全世界のツイートを表示
    twitterStream.sample()
  }
}
