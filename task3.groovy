def isSublist(list1, list2) {
  assert list1 instanceof java.util.list
  assert list2 instanceof java.util.list
  return  list1.containsAll(list2)
}

return this
