def urlText(a){
	URL html = new URL('http://tut.by')
	URLConnection urlConnection = html.openConnection()
	println "Response Code/Message: ${urlConnection.responseCode} / ${urlConnection.responseMessage}"
}
return this
