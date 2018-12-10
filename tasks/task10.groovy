def urlText(a){
	URL html = new URL(a)
	URLConnection urlConnection = html.openConnection()
	println "${urlConnection.responseCode} ${urlConnection.responseMessage}"
}
return this
