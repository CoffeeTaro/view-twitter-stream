import twitter4j.{Status, StatusListener, StallWarning}

class StreamListener extends StatusListener {
  override def onStatus(Status status): Unit ={
    println(status.getText())
  }

  override def onTrackLimitationNotice(numberOfLimitStatuses: Int) = {

  }

  override def onExection(e: Exception) = {

  }

  override def onStallWarning(warning StallWarning)

}

