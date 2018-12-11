import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def parseAndFilterJson(n) {
  def jss = new JsonSlurper()
  def text = jss.parseText(n)
  def find = text.findAll{ it.value %9 == 0 }
  def jsout = JsonOutput.toJson(find)
  return jsout
}
return this
