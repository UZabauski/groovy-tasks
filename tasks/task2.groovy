def mulEvenOdd(List<Integer> list) {
    list.eachWithIndex {it, index->
        (it%2==0) ? list.set(index, it*=2): list.set(index, it*=3)
    }
    return list
}
return this
