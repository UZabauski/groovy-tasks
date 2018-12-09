def gstring(s, n) {
    assert s instanceof String
    assert n instanceof Integer
    
    if (n>=1 && n<=3) { 
        def String s1 = "1() 2() 3()"
        return s1.replace("$n()","$n($s)")
        }
    else {
        return println('Incorrect n')
        }
}

return this
