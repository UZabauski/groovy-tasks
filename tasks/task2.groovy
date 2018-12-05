def mulEvenOdd(List<Integer> list) {
    list.eachWithIndex {it, index->
        (it%2==0) ? list[index]=it*=2: list[index]=it*=3
    }
    return list
}
return this
