package linkshare

import spring.User

class ReadingItem {

    Boolean isRead = Boolean.FALSE
    static belongsTo = [user: User,resource: Resource]
    static constraints = {
    }
}
