object Solution {
    def recursive(s:String, acum:Int): Int = {
        s match {
            case "" => acum
            case s if s.length == 1 => s.head.toInt -25
            case _ => 5
        }
    }
    def titleToNumber(columnTitle: String): Int = {
        // string = CFZ
        /*
        A
        .
        Z
        AA - 27
        .
        AZ - 52
        BA - 53
        */

}