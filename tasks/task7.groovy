def encryptThis(x) {
	def y = x.tokenize()
  x.each{
  firstLetter = (int) it[]
  res = firstLetter + it[-1] + it[2..-2] + it[2]  
  }
  return res
 }
return this
