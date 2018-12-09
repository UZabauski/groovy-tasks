def gstring(String change_str, int num) {
  String def_str = "1() 2() 3()"
  def_str.replace("$num()","$num($change_str)")
}

return this
