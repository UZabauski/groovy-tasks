def urlText(a){
	URL html = new URL(a)
	URLConnection urlConnection = html.openConnection()
	return urlConnection.responseMessage
}
return this
