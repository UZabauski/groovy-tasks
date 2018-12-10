def encryptThis(s) {
    
    assert s instanceof String
    def res 
    String[] str
    
    str = s.split()
    for( String values : str ) {
        char letter = values.charAt([0]) 
        int ascii = (int) letter 
        result = ascii + values[-1] + values[2..-2] + values[1]
        res += " " + result + " "
        
    }
    return println(res)
}

return this
