
import groovy.json.JsonSlurper

def parseAndFilterJson(a) {
        def jslurp = new JsonSlurper()
        def obj = jslurp.parsText(a)
        def b  
        obj.eachWithIndex {it, index ->
                if (index%9 == 0) {
                        return b{it:index}
                }
        }
}
return this
