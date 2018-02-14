<div class="jumbotron">
    <div class="row">
        <h1 class="panel-title col-md-12">
            Register
        </h1>
    </div>
<!--details-->
    <g:form name="registration" controller="Homepage" action="register">
        <div class="row-fluid">
            %{--<span>
                <g:hasErrors bean="${user}">
                    <div class="errors">
                        <g:renderErrors bean="${user}"/>
                    </div>
                </g:hasErrors>
            </span>--}%
            <div class="row">
                <div class="col-md-4">
                    <label class="col-form-label" for="username">
                        Username
                    </label>
                </div>
                <div class="col-md-8">
                    <input class="form-control" type="text" id="username" name="username"
                           placeholder="Provide Valid Username"/>
                    <span>
                        <g:renderErrors bean="${userCO}" as="list" field="username"/>
                    </span>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4">
                    <label class="col-form-label" for="email">
                        Email
                    </label>
                </div>

                <div class="col-md-8">
                    <input class="form-control" type="email" id="email" name="email" required
                           placeholder="Provide Valid Email"/>
                    <span>
                        <g:renderErrors bean="${userCO}" as="list" field="email"/>
                    </span>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4">
                    <label class="col-form-label" for="password">
                        Password
                    </label>
                </div>

                <div class="col-md-8">
                    <input class="form-control" type="password" id="password" name="password" required
                           placeholder="Provide Valid Password"/>
                    <span>
                        <g:renderErrors bean="${userCO}" as="list" field="password"/>
                    </span>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4">
                    <label class="col-form-label" for="confirmPassword">
                        Confirm Password
                    </label>
                </div>

                <div class="col-md-8">
                    <input class="form-control" type="password" id="confirmPassword"
                           name="confirmPassword" required placeholder="Retype Password"/>
                    <span>
                        <g:renderErrors bean="${userCO}" as="list" field="confirmPassword"/>
                    </span>
                </div>

            </div>

            <div class="row">
                <div class="col-md-4">
                    <label class="col-form-label" for="firstName">
                        First Name
                    </label>
                </div>

                <div class="col-md-8">
                    <input class="form-control" type="text" id="firstName"
                           name="firstName" required placeholder="Please Provide First Name"/>
                    <span>
                        <g:renderErrors bean="${userCO}" as="list" field="firstName"/>
                    </span>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4">
                    <label class="col-form-label" for="lastName">
                        Last Name
                    </label>
                </div>

                <div class="col-md-8">
                    <input class="form-control" type="text" id="lastName"
                           name="lastName" required placeholder="Please Provide Last Name"/>
                    <span>
                        <g:renderErrors bean="${userCO}" as="list" field="lastName"/>
                    </span>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4">
                    <label class="col-form-label" for="photo">
                        Photo
                    </label>
                </div>

                <div class="col-md-8">
                    <input class="" type="file" id="photo" name="photo" accept="image/*">
                    <span>
                        <g:renderErrors bean="${userCO}" as="list" field="photo"/>
                    </span>
                </div>
            </div>
        </div>
        &nbsp;
        <div class="row">
            <div class="col-md-4">

            </div>

            <div class="col-md-4">
                <input class=" btn btn-info" type="reset" id="reset" value="Reset"/>
            </div>

            <div class="col-md-4">
                <input class=" btn btn-dark" type="submit" id="submit"
                       value="Sign Up"/>
            </div>
        </div>
        <div class="row">
            <g:if test="${flash.message}">
                <div class="message">${flash.message}</div>
            </g:if>
        </div>
    </g:form>
</div>