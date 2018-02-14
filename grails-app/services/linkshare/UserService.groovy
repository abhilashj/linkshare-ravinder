package linkshare

import grails.transaction.Transactional
import spring.Role
import spring.User
import spring.UserRole

@Transactional
class UserService {
    def registerNewUser(User user) {
        Role role = Role.findByAuthority("ROLE_USER")
        if (user.save(flush: true)) {
            UserRole.create(user, role)
        }
    }
}
