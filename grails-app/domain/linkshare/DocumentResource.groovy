package linkshare

class DocumentResource {

    String url
    static constraints = {
        url nullable: false, blank: false
    }
}
