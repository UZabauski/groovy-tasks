def adults(m) {
    assert m instanceof java.util.Map
    return m.findAll { 
        it, value -> 
        value >= 18 }
  
}
return this
