package linkshare

import spring.User

class ResourceRating {

    Resource resource
    User user
    Integer score
    static constraints = {
        score nullable: false, blank:false
    }
}
