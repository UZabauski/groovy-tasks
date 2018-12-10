Map adults( inb_map ) {
    output = [:]
    for ( item in inb_map ){
        if(item.value > 17){
            output.put(item.key, item.value)
        }
    }
    return output
}

return this