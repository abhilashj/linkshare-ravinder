package linkshare

import spring.User

class Resource {

    String description
    User createdBy
    Topic topic
    Date dateCreated
    Date lastUpdated
    static constraints = {
        description nullable: false,blank: false
    }
}
