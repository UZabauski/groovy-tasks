boolean isIp(text){
    if (text ==~ /^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$/){
        print("ok")
        return true
    }
    else{
        return false
    }
}

return this