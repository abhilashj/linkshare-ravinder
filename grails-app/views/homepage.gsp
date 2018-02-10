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
        <div class="col-md-6">
            <div class="jumbotron">
                <fieldset>
                    <legend>
                        <h1>
                            Recent Share
                        </h1>
                    </legend>

                    <p>
                        here goes the links of "sharing is caring"
                    </p>
                </fieldset>
            </div>
        </div>
        <!--register form-->
        <div class="col-md-6">
            <div class="jumbotron">
                <div class="row">
                    <h1 class="panel-title col-md-12">
                        Register
                    </h1>
                </div>
            <!--details-->
                <g:form name="register" controller="user" action="register">
                    <div class="row-fluid">
                        <div class="row">
                            <div class="col-md-4">
                                <label class="col-form-label" id="rlusername">
                                    Username
                                </label>
                            </div>

                            <div class="col-md-8">
                                <input class="form-control" type="text" id="username" name="username" required
                                       placeholder="Provide Valid Username"/>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-4">
                                <label class="col-form-label" id="rlemail">
                                    Email
                                </label>
                            </div>

                            <div class="col-md-8">
                                <input class="form-control" type="email" id="email" name="email" required
                                       placeholder="Provide Valid Email"/>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-4">
                                <label class="col-form-label" id="rlpassword">
                                    Password
                                </label>
                            </div>

                            <div class="col-md-8">
                                <input class="form-control" type="password" id="password" name="password" required
                                       placeholder="Provide Valid Password"/>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-4">
                                <label class="col-form-label" id="rlconfirmpassword">
                                    Confirm Password
                                </label>
                            </div>

                            <div class="col-md-8">
                                <input class="form-control" type="password" id="confirmpassword"
                                       name="confirmpassword" required placeholder="Retype Password"/>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-4">
                                <label class="col-form-label" id="rlfirstname">
                                    First Name
                                </label>
                            </div>

                            <div class="col-md-8">
                                <input class="form-control" type="text" id="firstname"
                                       name="firstname" required placeholder="Please Provide First Name"/>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-4">
                                <label class="col-form-label" id="rllastname">
                                    First Name
                                </label>
                            </div>

                            <div class="col-md-8">
                                <input class="form-control" type="text" id="lastname"
                                       name="lastname" required placeholder="Please Provide Last Name"/>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-4">
                                <label class="col-form-label" id="rlphoto">
                                    Photo
                                </label>
                            </div>

                            <div class="col-md-8">
                                <input class="" type="file" id="photo" name="photo" accept="image/*">
                            </div>
                        </div>
                    </div>
                    &nbsp;
                    <div class="row">
                        <div class="col-md-4">

                        </div>

                        <div class="col-md-4">
                            <input class=" btn btn-info" type="reset" id="resetregister" name="resetregister"/>
                        </div>

                        <div class="col-md-4">
                            <input class=" btn btn-dark" type="submit" id="submitregister"
                                   name="submitregister"/>
                        </div>
                    </div>
                </g:form>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-6">
            <div class="jumbotron">
                <fieldset>
                    <legend>
                        <h1>
                            Notifications
                        </h1>
                    </legend>

                    <p>
                        here goes the links of notif
                    </p>
                </fieldset>
            </div>
        </div>
        <!--Login form-->
        <div class="col-md-6">
            <div class="jumbotron">
                <div class="row-fluid">
                    <h1 class="panel-title">
                        Login
                    </h1>
                </div>

                <g:form name="loginForm" controller="user" action="login">
                    <div class="row-fluid">
                        <div class="row">
                            <div class="col-md-4">
                                <label class="col-form-label" id="slemail">
                                    Email
                                </label>
                            </div>

                            <div class="col-md-8">
                                <input class="form-control" type="email" id="semail" name="semail" required
                                       placeholder="Provide Valid Email"/>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-4">
                                <label class="col-form-label" id="slpassword">
                                    Password
                                </label>
                            </div>

                            <div class="col-md-8">
                                <input class="form-control" type="password" id="spassword" name="spassword" required
                                       placeholder="Provide Valid Password"/>
                            </div>
                        </div>
                    </div>
                    &nbsp;
                    <div class="row">
                        <div class="col-md-4">

                        </div>

                        <div class="col-md-4">
                            <a class="" href="${createLink(action: 'forgetPassword')}">Forget Password</a>
                        </div>

                        <div class="col-md-4">
                            <input class=" btn btn-dark" type="submit" id="submitLogin"
                                   name="submitLogin"/>
                        </div>
                    </div>
                </g:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>