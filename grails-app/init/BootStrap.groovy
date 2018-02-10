class BootStrap {

    def init = { servletContext ->
        /*Role roleAdmin = Role.findByAuthority("ROLE_ADMIN")
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
            userAdmin.password = "next7@default"
            userAdmin.email = "ravinder7@fintechlabs.in"
            userAdmin.firstName = "Ravinder"
            userAdmin.lastName = "Rawat"
            userAdmin.admin = Boolean.TRUE
            if (userAdmin.errors.hasErrors()) {
                println "error in creating new admin as it is already exits"
            } else {
                if (userAdmin.save(flush: true, failOnError: true))
                    UserRole.create(userAdmin, roleAdmin)
            }
        }

        User userPerson = User.findByUsername("ravs")
        if (!userPerson) {
            userPerson = new User()
            userPerson.username = "ravs"
            userPerson.password = "next7@default"
            userPerson.email = "rawat.ravinder24@gmail.com"
            userPerson.firstName = "Ravs"
            userPerson.lastName = "Wolf"
            if (userPerson.hasErrors()) {
                println "error in creating new Default User as it is already exits"
            } else {
                if (userPerson.save(flush: true))
                    UserRole.create(userPerson, roleUser)
            }
        }*/
    }
    def destroy = {
    }
}
