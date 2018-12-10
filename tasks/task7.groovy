def encryptThis(s) {
    
    assert s instanceof String
    String res = ""
    String[] str
    
    str = s.split()
    for( String values : str ) {
        char letter = values[0] 
        int ascii = (int) letter 
        result = ascii + values[-1] + values[2..-2] + values[1]
        res += " " + result + " "
        
    }
    return res
}

return this
