String soso = "hello world dorada";

def split_me( inb_string ){
    parts = inb_string.split()
    String new_string = ""
    for ( elem in parts) {
        elem = elem.toString()
        int last_char = elem.length() - 1
        last = elem[last_char].toString()
        second = elem [1].toString()
        first_crypt = Integer.toString((int) elem[0])
        elem = first_crypt + last + elem.substring(2,last_char) + second + " "
        new_string += elem
    }
    new_string = new_string.substring(0, new_string.length()-1)
    return new_string
}

return this