package linkshare

import spring.User

class Resource {

    String description
    Date dateCreated
    Date lastUpdated
    static belongsTo = [User,Topic]
    static hasMany = [users: User,topics: Topic,readingItems: ReadingItem,resourceRatings: ResourceRating]
    static mapping = {
        users cascade: 'save-update'
        topics cascade: 'save-update'
        readingItems cascade: 'save-update'
        resourceRatings cascade: 'save-update'
    }
    static constraints = {
        description nullable: false,blank: false
    }
}
