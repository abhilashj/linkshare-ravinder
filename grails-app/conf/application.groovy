dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = 'org.hibernate.dialect.MySQL5InnoDBDialect'
}

environments {
    development {
        dataSource {
            dbCreate = "none"
            url = "jdbc:mysql://localhost:3306/linksharedb?autoreconnect=true"
            username = "root"
            logSql = false
            password = "next"
        }
    }
    test {
        dataSource {
            dbCreate = "none"
            url = "jdbc:mysql://localhost:3306/linksharedb?autoreconnect=true"
            username = "root"
            logSql = false
            password = "next"
        }
    }
    production {
        dataSource {
            dbCreate = "none"
            url = "jdbc:mysql://localhost:3306/linksharedb?autoreconnect=true"
            username = "root"
            logSql = false
            password = "next"

        }
    }
}
//Added by the Database Migration Plugin
grails.plugin.databasemigration.changelogFileName = 'changelog.groovy'
grails.plugin.databasemigration.updateOnStart = true
grails.plugin.databasemigration.updateOnStartFileNames = 'changelog.groovy'

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'spring.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'spring.UserRole'
grails.plugin.springsecurity.authority.className = 'spring.Role'

grails.plugin.springsecurity.successHandler.defaultTargetUrl = "/Homepage/success"
grails.plugin.springsecurity.failureHandler.defaultFailureUrl = "/Homepage/index"
grails.plugin.springsecurity.logout.postOnly = false
grails.plugin.springsecurity.auth.loginFromUrl = "/Homepage/index"

grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

