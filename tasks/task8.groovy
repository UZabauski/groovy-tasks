//import groovy.json.JsonSlurper
//import groovy.json.JsonOutput

def parseAndFilterJson(str){
  jsonSlurper = new JsonSlurper()
  json = jsonSlurper.parseText(str)
  new_json= json.findAll{age->
    age.value %9 == 0  
  }
  return JsonOutput.toJson(new_json)
}
return this

