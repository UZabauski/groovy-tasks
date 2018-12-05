import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def parseAndFilterJson(String myjson) {
  println(myjson)
  jsonSlurper = new JsonSlurper()
  result =[:]
  def object = jsonSlurper.parseText(myjson)
  assert object instanceof Map
  object.each { entry ->
    if ("$entry.value".toInteger() %9 == 0) result.put("$entry.key", "$entry.value")
  }
def output = JsonOutput.toJson (result)  
return output
}

return this
