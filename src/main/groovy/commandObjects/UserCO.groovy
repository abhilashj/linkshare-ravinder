package commandObjects

import grails.validation.Validateable

class UserCO implements Validateable {
    String username
    String password
    String confirmPassword
    String email
    String firstName
    String lastName
    byte[] photo
    Boolean admin = Boolean.FALSE
    Boolean active = Boolean.FALSE
    Boolean enabled = Boolean.TRUE
    Date dateCreated
    Date lastUpdated

    static constraints = {
        username blank: false, unique: true, size: 5..15
        password blank: false, password: true, size: 5..20
        confirmPassword blank: false, validator: { confirmPassword, obj ->
            if (confirmPassword != obj.password) {
                return 'UserCO.password.dontmatch'
            }
        }
        email blank: false, unique: true
        firstName blank: false, size: 5..15, matches: "/^[A-z]+\$/"
        lastName blank: false, nullable: true, size: 5..15, matches: "/^[A-z]+\$/"
        photo nullable: true
    }
}