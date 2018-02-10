package linkshare

class DocumentResource extends Resource{

    String url
    static constraints = {
        url nullable: true, blank: false
    }
}
