package helpers

/**
  * Created by digital032748 on 28/09/18.
  */
trait NumeralHelper {

  val random = scala.util.Random

  def randomNumeral : String = {
    random.nextInt(3) + 1 match {
      case 1 => "I"
      case 2 => "V"
      case 3 => "X"
    }
  }

}
