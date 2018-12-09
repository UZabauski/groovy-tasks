def adults(a){
	a.findAll {key, value -> value >= 18}
}
return this
