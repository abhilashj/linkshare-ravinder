package linkshare

import spring.User

class ReadingItem {

    Resource resource
    User user
    Boolean isRead = Boolean.FALSE
    static constraints = {
        isRead nullable: false, blank: false
    }
}
