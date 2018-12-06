def mulEvenOdd(AbstractList<Integer> list){
    list.collect { (it%2 == 0) ? (it*=2) : (it*=3) }
  }
return this
