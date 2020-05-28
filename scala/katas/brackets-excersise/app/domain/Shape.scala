package domain

/**
  * Created by digital032748 on 03/09/18.
  */

case class Shape (open: Char, closed: Char)

trait ShapeConstants {

  val Square_Open = '['
  val Square_Closed = ']'
  val Round_Open = '('
  val Round_Closed = ')'
  val Curly_Open = '{'
  val Curly_Closed = '}'

  val Square_Brackets = Shape(Square_Open, Square_Closed)
  val Round_Brackets = Shape(Round_Open, Round_Closed)
  val Curly_Brackets = Shape(Curly_Open, Curly_Closed)

}

