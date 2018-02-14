<html>
<head>
    <meta name="layout" content="home"/>
    <title>
        HomePage of Linkshare
    </title>
</head>

<body>
&nbsp;
<div class="container-fluid content">
    <div class="row">
        <!--recent share-->
        <div class="col-md-6">
            <g:render template="/templates/recentShare"/>
        </div>
        <!--recent share end-->
        <!--register form-->
        <div class="col-md-6">
            <g:render template="/templates/registration"/>
        </div>
        <!--register form end-->
    </div>

    <div class="row">
        <!--top post-->
        <div class="col-md-6">
            <g:render template="/templates/topPost" />
        </div>
        <!--top post end-->
        <!--Login form-->
        <div class="col-md-6">
        <div class="jumbotron">
            <div class="row-fluid">
                <h1 class="panel-title">
                    Login
                </h1>
            </div>

            <form action="/login/authenticate" id="loginForm" method="POST" class="cssform" autocomplete="off">
                <div class="row-fluid">
                    <div class="row">
                        <div class="col-md-4">
                            <label for="username" class="col-form-label">
                                Username
                            </label>
                        </div>
                        <div class="col-md-8">
                            <input class="form-control text_" type="text" id="username" class="text_" name="${usernameParameter ?: 'username'}" required
                                   placeholder="Provide Valid Username"/>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-4">
                            <label class="col-form-label" for="password">
                                Password
                            </label>
                        </div>

                        <div class="col-md-8">
                            <input class="form-control text_" type="password" id="password" name="${passwordParameter ?: 'password'}" required
                                   placeholder="Provide Valid Password"/>
                        </div>
                    </div>
                </div>
                &nbsp;
                <div class="row">
                    <div class="col-md-4">

                    </div>

                    <div class="col-md-4">
                        <a class="" href="%{--${createLink(action: 'forgetPassword')}--}%">Forget Password</a>
                    </div>

                    <div class="col-md-4">
                        <input class=" btn btn-dark" type="submit" id="submitLogin"
                               value="${message(code: 'springSecurity.login.button')}"/>
                    </div>
                </div>
                <div class="row">
                    <g:if test="${flash.message}">
                        <div class="message">${flash.message}</div>
                    </g:if>
                </div>
            </form>
        </div>
        </div>
        <!--Login form end-->
    </div>
</div>
</body>
</html>