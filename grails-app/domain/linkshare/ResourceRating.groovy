package linkshare

import spring.User

class ResourceRating {

    Integer score = 0 as Integer
    static belongsTo = [user: User,resource: Resource]
    static constraints = {
        score nullable: false, blank:false
    }
}
