package services

import domain.{Bracket, ShapeConstants}
import org.scalatestplus.play.{OneAppPerTest, PlaySpec}

/**
  * Created by digital032748 on 14/08/18.
  */
class BracketsServiceSpec extends PlaySpec with OneAppPerTest with ShapeConstants {

  val bracketsService = new BracketsService

  "BracketsService getBrackets()" should {

    "recognise no brackets in a given string" in {

      val noBrackets = "abcdefg"

      bracketsService.getBrackets(noBrackets) mustBe ""

    }

    "retrurn only all the brackets in a given string" in {

      val bracks = "(a){b}[c]"

      bracketsService.getBrackets(bracks) mustBe "(){}[]"
    }

  }

  "BracketsService findBrackets()" should {

    "find a single bracket" in {

      val str = "abc[def"
      val shape = '['
      val seq = Seq.empty[Bracket]

      val result = bracketsService.findBrackets(str, shape, seq)

      result mustBe Seq(Bracket('[', 3))
    }

    "find multiple brackets" in {

      val str = "[abc[def["
      val shape = '['
      val seq = Seq.empty[Bracket]

      val result = bracketsService.findBrackets(str, shape, seq)

      result mustBe Seq(Bracket('[', 0), Bracket('[', 4), Bracket('[', 8))
    }
  }

  "BracketsService findAllBrackets()" should {

    "find multiple of different bracket types" in {

      val str = "{a[b(c)d]e}"

      val result = bracketsService.findAllBrackets(str)

      result mustBe Seq(Bracket('{', 0), Bracket('[', 2), Bracket('(', 4), Bracket(')', 6), Bracket(']', 8), Bracket('}', 10))
    }
  }

  "BracketsService evaluateBrackets()" should {
    
    "check that a bracket type is balanced" in {
      
      val str = "ab(cd)ef"
      
      val result = bracketsService.evaluateBracketByType(str, Round_Brackets)
      
      result mustBe true
    }

    "check that a bracket type is unbalanced" in {

      val str = "ab[cd]e]f"

      val result = bracketsService.evaluateBracketByType(str, Square_Brackets)

      result mustBe false
    }

    "check that a brackets are in correct order" in {

      val str = "ab}cd{ef"

      val result = bracketsService.evaluateBracketByType(str, Curly_Brackets)

      result mustBe false
    }
    
  }
  
}
