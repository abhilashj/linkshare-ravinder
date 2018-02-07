package linkshare

import spring.User

class Subscription {

    Topic topic
    User user
    Seriousness seriousness
    Date dateCreated
    static constraints = {
        seriousness nullable: false, blank:false
    }
}