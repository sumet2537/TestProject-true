<%-- 
    Document   : teststyle
    Created on : Jan 5, 2017, 12:58:47 PM
    Author     : brass
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form class="cmxform" id="myForm" method="post" action="">
    <div id="tabs">
        <ul>
            <li><a href="#general">General</a></li>
            <li><a href="#tab2">Specifics</a></li>
        </ul>
        
        <div id="general">
            <label>First name</label>
            <input id="first" class="required" name="first" />
            <label>Last name</label>
            <input id="last" name="last" />
            <p>
                <a class="nexttab navbutton" href="#tab2"><span>Next</span></a>  
            </p>
        </div>
        <div id="tab2">
            <h2>Tab2</h2>
            <label>Middle name</label>
            <input id="middle" class="required" name="middle" />
            <p>
                <a class="nexttab navbutton" href="#general"><span>Prev</span></a>
                <a class="submit navbutton" id="submit" href="#"><span>Submit</span></a>
            </p>
        </div>
    </div>
</form>

    </body>
</html>
<script>
    var tabs = $("#tabs").tabs();
var validator = $("#myForm").validate();

$(".nexttab").click(function() {
    //var selected = $("#tabs").tabs("option", "selected");
    //$("#tabs").tabs("option", "selected", selected + 1);
    var valid = true;
    var i = 0;
    var $inputs = $(this).closest("div").find("input");
    
    $inputs.each(function() {
        if (!validator.element(this) && valid) {
            valid = false;
        }
    });

    if (valid) {
        $("#tabs").tabs("select", this.hash);
    }
});

//use link to submit form instead of button
$("a[id=submit]").click(function() {
    $(this).parents("form").submit();
});

//form validation


    </script>