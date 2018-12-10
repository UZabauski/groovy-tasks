def gstring(String new_string, int index){
    String default_string = "1() 2() 3()"
    return default_string.replace("$index()","$index($new_string)")
}

return this