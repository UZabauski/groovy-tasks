def urlText(a){
	URL html = new URL(a)
	URLConnection urlConnection = html.openConnection()
	println "Response Code/Message: ${urlConnection.responseCode} / ${urlConnection.responseMessage}"
}
return this
