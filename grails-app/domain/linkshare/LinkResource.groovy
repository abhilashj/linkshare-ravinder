package linkshare

class LinkResource extends Resource{

    String filePath
    static constraints = {
        filePath nullable: true, blank: false
    }
}
