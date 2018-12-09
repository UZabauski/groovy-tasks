def adults(Map) {
  return  Map.findAll { 
        name, age -> 
        age >= 18 }
}
return this
