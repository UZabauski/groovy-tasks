def myArray = [1,2,3]

def mulEvenOdd(List x) {
  x.eachWithIndex {it, index ->
    if (it%2==0) {
    	return x[index]=it*2	
    } else {
    	return x[index]=it*3
    }
  }
  return x
}

mulEvenOdd(myArray)
