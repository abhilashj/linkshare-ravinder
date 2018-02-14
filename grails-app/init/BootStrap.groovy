import spring.Role
import spring.User
import spring.UserRole

class BootStrap {

    def init = { servletContext ->
        Role roleAdmin = Role.findByAuthority("ROLE_ADMIN")
        if (!roleAdmin) {
            roleAdmin = new Role(authority: 'ROLE_ADMIN').save(flush: true)
        }
        Role roleUser = Role.findByAuthority("ROLE_USER")
        if (!roleUser) {
            roleUser = new Role(authority: 'ROLE_USER').save(flush: true)
        }

        User userAdmin = User.findByUsername("ravinder")
        if (!userAdmin) {
            userAdmin = new User()
            userAdmin.username = "ravinder"
            userAdmin.password = "ravinder"
            userAdmin.email = "ravinder7@fintechlabs.in"
            userAdmin.firstName = "Ravinder"
            userAdmin.lastName = "Rawat"
            if (userAdmin.errors.hasErrors()) {
                if (userAdmin.save(flush: true, failOnError: true)) {
                    UserRole.create(userAdmin, roleAdmin)
                }

            }
        }

        User userPerson = User.findByUsername("ravs")
        if (!userPerson) {
            userPerson = new User()
            userPerson.username = "ravswolf"
            userPerson.password = "ravswolf"
            userPerson.email = "rawat.ravinder24@gmail.com"
            userPerson.firstName = "Ravs"
            userPerson.lastName = "Wolf"
            if (!userPerson.hasErrors()) {
                if (userPerson.save(flush: true)) {
                    UserRole.create(userPerson, roleUser)
                }
            }
        }
    }
    def destroy = {
    }
}
