package linkshare

class LinkResource {

    String filePath
    static constraints = {
        filePath nullable: false, blank: false
    }
}
