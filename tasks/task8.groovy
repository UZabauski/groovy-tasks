import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def parseAndFilterJson(json_in) {
    def jsonSlurper = new JsonSlurper()
    def parsed = jsonSlurper.parseText(json_in)
    def result = parsed.findAll { it.value %9== 0 }
    def json_out = JsonOutput.toJson(result)
    return json_out
}

return this
