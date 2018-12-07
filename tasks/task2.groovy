def mulEvenOdd(List<Integer> evenodd) {
  new_evenodd = evenodd.collect { (it%2==0) ? (it*2) : (it*3) } ; 
    println(new_evenodd);
}

return this
