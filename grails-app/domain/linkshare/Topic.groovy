package linkshare

import spring.User

class Topic {

    String name
    User createdBy
    Date dateCreated
    Date lastUpdated
    Visibility visibility
    static constraints = {
        name nullable: false, blank: false, unique: true, size: 4..40
        createdBy nullable: false, blank: false
        visibility nullable: false, blank: false
    }
}
