def mulEvenOdd(List<Integer> evenodd) {
  evenodd.collect { (it%2==0) ? (it*2) : (it*3) }    
}

return this
