def gstring(String str, int index){
  String def_str = "1() 2() 3()"
  return println(def_str.replace("$index()","$index($str)"))
}

return this
