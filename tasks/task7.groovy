def encryptThis(s) {
    
    assert s instanceof String
   
    println("First element: ${s[0]}")
    println("Second element: ${s[1]}")
    println("Last element: ${s[-1]}")
   
    char letter = s.charAt([0]) // This gives the letter s[0]
    int ascii = (int) letter 
    println("First element ASCII: ${ascii}")
    
    return result = ascii + s[-1] + s[2..-2] + s[1]

}
return this 
