import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def parseAndFilterJson(s) {
    assert s instanceof java.lang.String
 
    def jsonSlurper = new JsonSlurper()
    def sparse = jsonSlurper.parseText(s)
    
    assert sparse instanceof Map
    def result = sparse.findAll { it.value %9== 0 }
    def json = JsonOutput.toJson(result)
    return json
}

return this
