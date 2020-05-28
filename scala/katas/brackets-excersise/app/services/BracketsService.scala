package services

import domain.{Bracket, Shape, ShapeConstants}

/**
  * Created by digital032748 on 14/08/18.
  */
class BracketsService extends ShapeConstants {

  
  def getBrackets(input: String): String = {

    val regex = """[^\{\}\[\]\(\)]"""

    input.replaceAll(regex, "")

  }


  def findBrackets(input: String, shape: Char, acc: Seq[Bracket]): Seq[Bracket] = {
    val index = input.indexOf(shape)
    if (index == -1) {
      acc
    } else {
      val bracket = Bracket(shape, index + acc.length)
      val bracketSeq = acc :+ bracket
      val removedChar = input.substring(0, index) + input.substring(index + 1)
      findBrackets(removedChar, shape, bracketSeq)
    }
  }

  
  def findAllBrackets(input: String): Seq[Bracket] = {

    val startingSeq = Seq.empty[Bracket]

    val squaresOpen = findBrackets(input, Square_Open, startingSeq)
    val squaresClosed = findBrackets(input, Square_Closed, startingSeq)
    val roundOpen = findBrackets(input, Round_Open, startingSeq)
    val roundClosed = findBrackets(input, Round_Closed, startingSeq)
    val curlyOpen = findBrackets(input, Curly_Open, startingSeq)
    val curlyClosed = findBrackets(input, Curly_Closed, startingSeq)

    (squaresOpen ++ squaresClosed ++ roundOpen ++ roundClosed ++ curlyOpen ++ curlyClosed).sortBy(_.index)

  }
  
  def evaluateBracketByType(input: String, shape: Shape): Boolean = {
    
    val allBrackets = findAllBrackets(input)
    val allShapeOpens = allBrackets.filter(bracket => bracket.shape == shape.open)
    val allShapeCloses = allBrackets.filter(bracket => bracket.shape == shape.closed)

    val equalNumberOfBrackets = allShapeOpens.length == allShapeCloses.length
    lazy val orderIsCorrect = checkOrderIsCorrect(allShapeOpens, allShapeCloses)

    if (!equalNumberOfBrackets || !orderIsCorrect) {
      false
    } else {
      true
    }

  }

  def removePairs (opens: Seq[Bracket], closes: Seq[Bracket]): (Seq[Bracket], Seq[Bracket]) = {
    if (opens.isEmpty || closes.isEmpty) {
      (opens, closes)
    } else {
      val newOpens = opens diff Seq(opens.minBy(_.index))
      val newCloses = closes diff Seq(closes.maxBy(_.index))
      removePairs(newOpens, newCloses)
    }
  }

  def checkOrderIsCorrect(opens: Seq[Bracket], closes: Seq[Bracket]) : Boolean = {
    val closingBrackets = closes.reverse
    val runtimes = opens.length

    def go(times: Int) : Boolean = {

      if (times == 0) {
        return true
      }

      val index = runtimes - times
      val openToCheck = opens.apply(index)
      val closeToCheck = closingBrackets.apply(index)

      if (openToCheck.index > closeToCheck.index) {
        false
      } else {
        go(times - 1)
      }
    }
    go(runtimes)
  }

}
