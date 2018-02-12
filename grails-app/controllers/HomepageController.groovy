import commandObjects.UserCO
import grails.plugin.springsecurity.LoginController
import spring.User

class HomepageController extends LoginController {
    def userService

    def index() {
        render(view: "/homepage")
    }

    def register(UserCO userCO) {
        User user = new User()
        if (userCO.validate()) {
            userService.registerNewUser(userCO, user)

            redirect(controller: 'Homepage')
        } else {
            userCO.errors.allErrors.each {
                println it
                flash.message = "Registration Failed"
                redirect(controller: 'Homepage')
            }
        }
    }

    def login() {
        Boolean isAdmin = userService.loginUsers(params)
        if (isAdmin) {
            redirect(controller: "adminSuccess")
        } else {
            redirect(controller: "userSuccess")
        }

    }

    def adminSuccess() {
        render(view: "adminDashboard")
    }

    def userSuccess() {
        render(view: "userDashboard")
    }

    def myLogout() {
        redirect(controller: 'logout', action: 'index')
    }
}
