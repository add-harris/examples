package services

import helpers.NumeralHelper
import org.scalatestplus.play.{OneAppPerTest, PlaySpec}

/**
  * Created by digital032748 on 28/09/18.
  */
class RomanNumeralServiceSpec extends PlaySpec with OneAppPerTest with NumeralHelper {

  "RomanNumeralService - numeralToInt" should {

    val romanNumeralsService = new RomanNumeralsService

    "handle an empty string" in {
      romanNumeralsService.numeralToInt("") mustBe 0
    }

    "convert a basic single character numeral to an int" when {

      "I return 1" in {
        val numeral = "I"
        val result = romanNumeralsService.numeralToInt(numeral)
        result mustBe 1
      }

      "V return 5" in {
        val numeral = "V"
        val result = romanNumeralsService.numeralToInt(numeral)
        result mustBe 5
      }

      "X return 10" in {
        val numeral = "X"
        val result = romanNumeralsService.numeralToInt(numeral)
        result mustBe 10
      }

    }

    "convert a simple multi character numeral to an int" when {

      "III return 3" in {
        val numeral = "III"
        val result = romanNumeralsService.numeralToInt(numeral)
        result mustBe 3
      }

      "VII return 7" in {
        val numeral = "VII"
        val result = romanNumeralsService.numeralToInt(numeral)
        result mustBe 7
      }

    }

    "convert a subtraction notation numeral to an int" when {

      "IV return 4" in {
        val numeral = "IV"
        val result = romanNumeralsService.numeralToInt(numeral)
        result mustBe 4
      }

      "XIV return 14" in {
        val numeral = "XIV"
        val result = romanNumeralsService.numeralToInt(numeral)
        result mustBe 14
      }

    }

  }

}
