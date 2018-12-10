def encryptThis(str){
  String[] words = str.split(" ");
  def s=''
  words.each{letter ->
    def new_word=((int)letter[0] + letter[-1] + letter[2..-2] + letter[1]+ ' ')
    s+=new_word
  }
  return s.trim()
}
return this
