import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def parseAndFilterJson(String myjson) {
  def jsonSlurper = new JsonSlurper()
  def object = jsonSlurper.parseText(myjson)
  assert object instanceof Map
  return JsonOutput.toJson(object.findAll { it.value %9== 0 })
}

return this
