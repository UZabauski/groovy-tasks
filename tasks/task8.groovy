import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def parseAndFilterJson(String myjson) {
  jsonSlurper = new JsonSlurper()
  result =[:]
  def object = jsonSlurper.parseText(myjson)
  assert object instanceof Map
  return object.findAll { it.value %9== 0 }
}

return this
