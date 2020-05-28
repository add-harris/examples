package services

import org.joda.time.format.DateTimeFormatter
import org.joda.time.{LocalDate, LocalTime}
import org.scalatestplus.play._
import play.api.test._
import play.api.test.Helpers._

/**
  * Created by digital032748 on 30/10/18.
  */
class InterestingTimesServiceSpec extends PlaySpec with OneAppPerTest {

  val interestingTimesService = new InterestingTimesService

  "InterestingTimesService - interstingTimes" should {

    "recognise a single interesting time - 15:15:11" in {
      val startTime = new LocalTime(15, 15, 11)
      val endTime = new LocalTime(15, 15, 12)
      val result = interestingTimesService.interstingTimes(startTime, endTime)
      result mustBe Some(List(startTime))
    }

    "recognise an interesting time in a range of times" in {
      val startTime = new LocalTime(15, 15, 10)
      val endTime = new LocalTime(15, 15, 14)
      val interestingTime = new LocalTime(15, 15, 11)
      val result = interestingTimesService.interstingTimes(startTime, endTime)
      result mustBe Some(List(interestingTime))
    }

    "recognise multiple interesting times in a range of times" in {
      val startTime = new LocalTime(15, 15, 10)
      val endTime = new LocalTime(15, 15, 16)
      val interestingTime1 = new LocalTime(15, 15, 11)
      val interestingTime2 = new LocalTime(15, 15, 15)
      val result = interestingTimesService.interstingTimes(startTime, endTime)
      result mustBe Some(List(interestingTime1, interestingTime2))
    }

  }

}
