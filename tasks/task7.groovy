def to_char (String as_str){
  char character = as_str.charAt(0);
  int ascii = (int) character;
  return as_str.replace("$character", "$ascii")
}

def ch_sym (String ch_str) {
return ch_str[0] + ch_str[-1] + ch_str[2..-2] + ch_str[1]
} 

def encryptThis(String estr){
  String[] str
  str = estr.split(' ')
  for (int i=0;i < str.size();i++) {
 	if (i==0) newstr = to_char(ch_sym(str[i]))
    else {
      newstr += " " + to_char(ch_sym(str[i]))
    }
  }

  return newstr
}

return this
