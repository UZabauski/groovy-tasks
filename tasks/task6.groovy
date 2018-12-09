def adults(Map age) {
	age.findAll { key, value -> value >= 18 }
}

return this
