def gstring(String n, int m) {
  String str = "1() 2() 3()"
  str.replace("$m()","$m($n)")
}
return this
