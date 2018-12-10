def mulEvenOdd() {
  def map = mulEvenOdd.collect{ it % 2 ? it * 3 : it * 2}
  return map
}
return this
