@Grapes(
@Grab(group='commons-validator', module='commons-validator', version='1.6'))
//import org.apache.commons.validator.routines.InetAddressValidator

def boolean isIp(String someIp) {
	if(InetAddressValidator.getInstance().isValidInet4Address(someIp)){
    	return true
	} else {
	    return false
	}	
}
return this
