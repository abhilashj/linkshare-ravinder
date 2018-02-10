package linkshare

import spring.User

class Topic {

    String name
    Date dateCreated
    Date lastUpdated
    Visibility visibility
    static belongsTo = [user: User]
    static hasMany = [subscriptions: Subscription,resources: Resource]
    static mapping = {
        subscriptions cascade: 'all-delete-orphan'
        resources cascade: 'save-update'
    }
    static constraints = {
        name nullable: false, blank: false, unique: true
        visibility nullable: false, blank: false
    }
}
