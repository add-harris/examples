val x = "abcdefg"

val q = x.map(a => a match {
    case 'a' => a
    case _ => ""
  }
).mkString


val a = "abcd"

val b = a.find(_ == "b")