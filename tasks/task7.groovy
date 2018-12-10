def encryptThis(String x) {
  def y = x.tokenize()
  res = []
  y.eachWithIndex{it, index ->
  int firstLetter = (int) it[0]
  res[index] = firstLetter + it[-1] + it[2..-2] + it[1]
  }
  String a
  res.each {a += it + ' '}
  return a
 }
encryptThis('Hello world')
return this
