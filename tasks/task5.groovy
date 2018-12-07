def isIp(ip){
  c=0
  String[] octets = ip.split("\\.");
  octets.each{
  if (it.isNumber() && Integer.parseInt(it)<=255 && Integer.parseInt(it)>=0 ) 
    c+=1;
  }
  return c==4 
}
return this
