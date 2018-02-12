package spring

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import linkshare.*

@EqualsAndHashCode(includes = 'username')
@ToString(includes = 'username', includeNames = true, includePackage = false)
class User implements Serializable {

    private static final long serialVersionUID = 1

    transient springSecurityService

    String username
    String password
    String email
    String firstName
    String lastName
    byte[] photo
    Boolean admin = Boolean.FALSE
    Boolean active = Boolean.FALSE
    Boolean enabled = Boolean.TRUE
    Date dateCreated
    Date lastUpdated
    /*boolean accountExpired
    boolean accountLocked
    boolean passwordExpired*/
    static hasMany = [
            topics         : Topic,
            subscriptions  : Subscription,
            resources      : Resource,
            readingItems   : ReadingItem,
            resourceRatings: ResourceRating
    ]

    static mapping = {
        topics cascade: 'all-delete-orphan'
        subscriptions cascade: 'all-delete-orphan'
        resources cascade: 'save-update'
        readingItems cascade: 'save-update'
        resourceRatings cascade: 'save-update'
        password column: '`password`'
    }

    static constraints = {
        password blank: false, password: true
        username blank: false, unique: true
        email blank: false, unique: true
        firstName blank: false
        lastName blank: false, nullable: true
        photo nullable: true
    }

    /*User(String username, String password) {
        this()
        this.username = username
        this.password = password
    }*/

    Set<Role> getAuthorities() {
        UserRole.findAllByUser(this)*.role
    }

    def beforeInsert() {
        encodePassword()
    }

    def beforeUpdate() {
        if (isDirty('password')) {
            encodePassword()
        }
    }

    protected void encodePassword() {
        password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
    }

    static transients = ['springSecurityService']

}
