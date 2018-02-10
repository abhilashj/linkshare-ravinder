package linkshare

import spring.User

class Subscription {

    Seriousness seriousness
    Date dateCreated
    Date lastUpdated
    static belongsTo = [user: User, topic: Topic]
    static constraints = {
        seriousness nullable: false, blank: false
    }
}