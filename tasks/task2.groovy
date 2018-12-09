def mulEvenOdd(List<Integer> list){
    def mulEvenOdd_list = []
    list.each {(it%2==0) ? mulEvenOdd_list.add(it*2) : mulEvenOdd_list.add(it*3)}
    return mulEvenOdd_list
}

return this