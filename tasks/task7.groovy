def encryptThis(words){
  def items = words.split()
  def space=''
  for(letter in items)
    {
      def encrypted=((int)letter[0] + letter[-1] + letter[2..-2] + letter[1] + ' ')
      space+=encrypted
    }
  return space.trim()
  }
return this
