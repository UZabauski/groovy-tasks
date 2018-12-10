import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def parseAndFilterJson(str){
  def jsonSlurper = new JsonSlurper()
  def json = jsonSlurper.parseText(str)
  def new_json= json.findAll{age->
    age.value %9 == 0  
  }
  return JsonOutput.toJson(new_json)
}
return this

