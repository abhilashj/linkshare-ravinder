%{--<g:hasErrors bean="${bean}" field="${field}">
    <p class="text-danger">
        <g:fieldError bean="${bean}" field="${field}"/>
    </p>
</g:hasErrors>
<div class="row">
    <div class="col-md-4">
    </div>
    <span class="has-error">
        <g:renderErrors bean="${userCO}" field="username"/>
    </span>
</div>--}%
<div class="row">
    <div class="col-md-4">
    </div>
    <span class="has-error">
        <g:renderErrors bean="${bean}" field="${field}"/>
    </span>
</div>