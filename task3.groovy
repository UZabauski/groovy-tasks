def isSublist(list, sublist) {
  assert list instanceof java.util.list
  assert sublist instanceof java.util.list
  list.containsAll(sublist)
}

return this
