def fib(n){
  nach=0
  tek=1
  rez=0
  c=1
  if (n==1) {return n}
    else if (n<=0) {return 'Index have to start from 1'}
    else {
      while (c!=n){
        rez=tek+nach;
        nach=tek;
        tek=rez;
        c+=1;
      }
    return rez
    }
  }
return this

