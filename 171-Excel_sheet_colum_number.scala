object Solution extends App{
    def recursive(l:List[Char], base:Int): Int = {
        l match {
            case Nil => 0
            case char :: Nil => (char.toInt - 64) * base
            case _ =>  // General case for lists with 2+ elements
                val init = l.init
                val last = l.last
                (last.toInt - 64) * base + recursive(init, base * 26)
        }
    }
    def titleToNumber(columnTitle: String): Int = {
        recursive(columnTitle.toList, 1)
    }
    //println(titleToNumber("ZX"))
}