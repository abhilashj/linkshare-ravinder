import commandObjects.UserCO
import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured
import spring.User

@Secured("permitAll")
class HomepageController {
    SpringSecurityService springSecurityService
    def userService

    def index() {
        render(view: "/login/auth")
    }

    def register() {
        UserCO userCO = new UserCO()
        bindData(userCO, params)
        if (userCO.validate()) {
            User user = new User(userCO)
            userService.registerNewUser(user)
            render(view: "/login/auth")
            flash.message = "Registered Successfully :)"
        } else {
            render(view: "/login/auth", model: [userCO: userCO])
            flash.message = "Registration Failed :("
        }
    }

    @Secured(['ROLE_CLIENT', 'ROLE_ADMIN'])
    def success() {
        String show = "welcome ${(springSecurityService.currentUser as User)?.username}"
        show = show + "\n ${createLink(controller: 'logout')}"
        render(show)
    }

    def failure(){
        render(view: "/login/auth")
        flash.message = "Login failed :)"
    }

    def myLogout() {
        redirect(controller: 'logout', action: 'index')
    }
}
