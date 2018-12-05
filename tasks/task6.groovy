def adults(people=[:]){
	result =[:]
	people.each { entry ->  
	if ("$entry.value">=18) 
		result.put("$entry.key", "$entry.value")
	}
	return result
}
return this
