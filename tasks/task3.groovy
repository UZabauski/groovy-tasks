def isSublist(list, sublist) {
  if (list.containsAll(sublist)) {
  	return true
  } else {
  	return False
  }
}

isSublist([1,2,3], [1,2])
