package services

/**
  * Created by digital032748 on 28/09/18.
  */
class RomanNumeralsService {

  // original recursive solution but messy
  // lots of ifs, not very functional but works
  def doSomething(numbers: List[Int], acc: Int): Int = {

    if (numbers.length > 1) {
      val a = numbers.head
      val b = numbers(1)

      if (a >= b) {
        doSomething(numbers.tail, acc + a)
      } else {
        doSomething(numbers.tail, acc - a)
      }
    } else {
      numbers.headOption.getOrElse(0) + acc
    }
  }
  

  // need to check the chars in pairs
  // if the first is larger than the second it is positive
  // if the first is smaller than the second it is negative
  // then add the last char, it is always positive

  def numeralToInt(input: String) : Int = {

    val charList = List(input).flatten

    val intList = charList.map(matchNumeral)

    val total = intList.length match {
      case 0 => 0
      case 1 => intList.head
      case _ => doSliding(intList)
    }
    total
  }

  private def matchNumeral(char: Char): Int = {
    char match {
      case 'I' => 1
      case 'V' => 5
      case 'X' => 10
    }
  }

  private def checkPositivity(a: Int, b: Int): Int = {
    a >= b match {
      case true => a
      case false => a * -1
    }
  }

  private def compensator (numbers: List[Int]): Int = {
    numbers.lastOption.getOrElse(0)
  }

  private def doSliding(numbers: List[Int]): Int = {
    val pairs = numbers.sliding(2, 1).toList
    pairs.map(_.reduce(checkPositivity)).sum + compensator(numbers)
  }


}





