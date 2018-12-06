def mulEvenOdd(list)
{
  assert list instanceof java.util.List
  
  list.eachWithIndex {it, i->  // `it` is the current element, while `i` is the index
  
    // eachWithIndex method execute code on each item of a list
    
    if((it%2)==0){
      (list[i]=it*=2) 
    }
    
    else {(list[i]=it*=3)}
  }
}
 
return this
