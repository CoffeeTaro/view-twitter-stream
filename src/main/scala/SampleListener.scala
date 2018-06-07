import twitter4j._

class SampleListener extends StatusListener {
  override def onStatus(status: Status): Unit ={
    println(status.getText())
    // println(status.getId())
    // println(status.getUser().getScreenName())
  }

  override def onDeletionNotice(notice: StatusDeletionNotice): Unit = {

  }
  override def onScrubGeo(x1: Long, x2: Long): Unit = {}
  override def onException(e: Exception): Unit = {
    // e.printStackTrace()
  }
  override def onStallWarning(stw: StallWarning): Unit = {

  }
  override def onTrackLimitationNotice(x: Int): Unit = {

  }

}
