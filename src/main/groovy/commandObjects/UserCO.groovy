package commandObjects

import grails.validation.Validateable

class UserCO implements Validateable {
    String username
    String email
    String password
    String confirmPassword
    String firstName
    String lastName
    byte[] photo
    static constraints = {
        username blank: false, unique: true, size: 3..15
        email blank: false, unique: true
        password blank: false, password: true,size: 6..20
        confirmPassword blank: false, validator: { confirmPassword, obj ->
            obj.confirmPassword == obj.password ? true : 'passwordNotMatch'
        }
        firstName blank: false, size: 3..15, matches: "[a-zA-Z]{3,15}"
        lastName blank: false, nullable: true, size: 3..15,matches: "[a-zA-Z]{3,15}"
        photo nullable: true
    }
}