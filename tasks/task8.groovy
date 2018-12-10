import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def parseAndFilterJson(String input_json) {
    def jsonSlurper  = new JsonSlurper()
    def object = jsonSlurper.parseText(input_json)
    output = JsonOutput.toJson(object.findAll { it.value %9== 0 })
    return output
}

return this