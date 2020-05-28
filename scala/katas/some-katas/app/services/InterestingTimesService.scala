package services

import org.joda.time.LocalTime

/**
  * Created by digital032748 on 30/10/18.
  *
  * With times stored in the format "HH:MM:SS", find the number of "interesting" times that can be displayed between two given times S and T (inclusive).
  * An "interesting" time is one that can be displayed with at most 2 characters.
  * For example S "15:15:00" and T "15:15:12" would return the count of 1 as the only "interesting" time between S and T (inclusive) is "15:15:11".
  * Another example, S "22:22:21" and T "22:22:23" would return the count of 3 because of the following times: "22:22:21", "22:22:22", "22:22:23"
  *
  * Constraints
  *
  * S <= T
  * 00 <= HH <= 23
  * 00 <= MM <= 59
  * 00 <= SS <= 59
  */
class InterestingTimesService {

  def interstingTimes(startTime: LocalTime, endTime: LocalTime): Option[List[LocalTime]] = {

    def go(currentTime: LocalTime, acc: Option[List[LocalTime]]): Option[List[LocalTime]] = {

      val isBefore = currentTime isBefore endTime
      val equal = currentTime isEqual endTime
      if (isBefore || equal) {
        val newAcc = getNewAccumulator(acc, currentTime)
        val nextTimeToCheck = currentTime.plusSeconds(1)
        go(nextTimeToCheck, newAcc)
      } else {
        acc
      }
    }

    go(startTime, None)

  }

  def isTimeInteresting(timeToCheck: LocalTime): Option[LocalTime] = {
    // converts time to string in HH:MM:SS format
    val timeAsString = timeToCheck.toString.substring(0, 8)

    // reduces string to a list of distinct values
    val uniqueNumberValues: Seq[String] = timeAsString.split("")
                                                      .toList
                                                      .filterNot(_ == ":")
                                                      .distinct

    if (uniqueNumberValues.length < 3) {
      println("isTimeInteresting, yes")
      Some(timeToCheck)
    } else {
      println("isTimeInteresting, no")
      None
    }
  }

  def getNewAccumulator(acc: Option[List[LocalTime]], timeToCheck: LocalTime): Option[List[LocalTime]] = {

    val checkedTime = isTimeInteresting(timeToCheck)

    // refactor match within match
    checkedTime match {
      case None => acc
      case Some(_) =>
        acc match {
          case Some(_) => val x = acc.map(_ ++ checkedTime)
            println("getNewAcc, acc is some")
            println(x)
            x
          case None =>
            println("getNewAcc, acc is none")
            checkedTime.map(List(_))
        }

    }



  }

}
