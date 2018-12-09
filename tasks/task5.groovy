def boolean isIp(s) {
    assert s instanceof java.lang.String
    return s.maches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")
}

return this
