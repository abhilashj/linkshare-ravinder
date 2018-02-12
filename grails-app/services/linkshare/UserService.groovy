package linkshare
import commandObjects.UserCO
import grails.transaction.Transactional
import grails.web.servlet.mvc.GrailsParameterMap
import spring.*

@Transactional
class UserService {
    def registerNewUser(UserCO userCO, User user) {
        user.username = userCO.username
        user.password = userCO.password
        user.email = userCO.email
        user.firstName = userCO.firstName
        user.lastName = userCO.lastName
        user.photo = userCO.photo
        if (user.hasErrors()) {
            flash.message = "Not Registered"
        } else {
            Role role = Role.findByAuthority("ROLE_USER")
            if (user.save(flush: true)) {
                if (UserRole.create(user, role)) {
                    flash.message = "Registered Successfully"
                }
            }
        }
    }

    def loginUsers(GrailsParameterMap params) {
        def user = User.findByEmailAndPassword(params.semail, params.spassword)
        if (user.hasErrors()) {
            flash.message = "User not found"
        } else {
            return user.admin.booleanValue()
        }
    }
}
