
import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def parseAndFilterJson(a) {
        def jslurp = new JsonSlurper()
        def obj = jslurp.parseText(a)
        def b = obj.findAll{ it.value %9== 0 }
        def c = JsonOutput.toJson(b)
	return c
}
return this
