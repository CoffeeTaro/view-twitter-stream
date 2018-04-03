import twitter4j._

class SampleListener extends StatusListener {
  override def onStatus(status: Status): Unit ={
    println(status.getText())
  }

  override def onDeletionNotice(notice: StatusDeletionNotice): Unit = {
    // println(notice)
  }
  override def onScrubGeo(x1: Long, x2: Long): Unit = {}
  override def onException(e: Exception): Unit = {
    e.printStackTrace()
  }
  override def onStallWarning(stw: StallWarning): Unit = {
    // println(stw)
  }
  override def onTrackLimitationNotice(x: Int): Unit = {
    // println(x)
  }

}
