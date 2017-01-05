<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Content Header (Page header) -->

<!-- Main content -->
<section class="content">
    <!-- Info boxes -->
    <div class="row">
        <div class="">
            <div class="" >

                <center><font style="font-size: 25px" color="#8878CD">  ระบบบริการขอสินเชื่อบ้าน <br></font>
                    <!--<div class="">-->

                    <p><font style="font-size: 25px" color="red">HOME Loan System </font> </p>
                    <img src="./img/12.jpg" width="100%" /><br><br>
                    </div>
                    </div>

                    <form class="tabs" id="myForm" method="post" action="">
                        <div class="panel with-nav-tabs panel-info responsive">
                            <div class="panel-heading1">
                                <ul class="nav nav-tabs">
                                    <li class="active"><a href="#general">General</a></li>
                                    <li><a href="#tab2">Specifics</a></li>
                                </ul>
                                <div class="tab-content">
                                    <div  class="tab-pane active" id="general">
                                        <label>First name</label>
                                        <input id="first" class="required" name="first" />
                                        <label>Last name</label>
                                        <input id="last" name="last" />
                                        <p>
                                            <a class="nexttab navbutton" href="#tab2"><span>Next</span></a>  
                                        </p>
                                    </div>
                                </div>
                                <div class="tab-content">
                                    <div class="tab-pane" id="tab2">
                                        <h2>Tab2</h2>
                                        <label>Middle name</label>
                                        <input id="middle" class="required" name="middle" />
                                        <p>
                                            <a class="nexttab navbutton" href="#general"><span>Prev</span></a>
                                            <a class="submit navbutton" id="submit" href="#"><span>Submit</span></a>
                                        </p>
                                    </div>
                                </div>
                                                         <ul class="nav nav-tabs">
    <li class="active"><a href="#tab1" data-toggle="tab">Shipping</a></li>
    <li><a href="#tab2" data-toggle="tab">Quantities</a></li>
    <li><a href="#tab3" data-toggle="tab">Summary</a></li>
</ul>
<div class="tab-content">
    <div class="tab-pane active" id="tab1">
        <a class="btn btn-primary btnNext">Next</a>
    </div>
    <div class="tab-pane" id="tab2">
        <a class="btn btn-primary btnNext">Next</a>
        <a class="btn btn-primary btnPrevious">Previous</a>
    </div>
    <div class="tab-pane" id="tab3">
        <a class="btn btn-primary btnPrevious">Previous</a>
    </div>
</div>
                            </div>
                            
                        </div>
                    </form>
                    <script>
                        var tabs = $("#tabs").tabs();
                        var validator = $("#myForm").validate();

                        $(".nexttab").click(function () {
                            //var selected = $("#tabs").tabs("option", "selected");
                            //$("#tabs").tabs("option", "selected", selected + 1);
                            var valid = true;
                            var i = 0;
                            var $inputs = $(this).closest("div").find("input");

                            $inputs.each(function () {
                                if (!validator.element(this) && valid) {
                                    valid = false;
                                }
                            });

                            if (valid) {
                                $("#tabs").tabs("select", this.hash);
                            }
                        });

                        //use link to submit form instead of button
                        $("a[id=submit]").click(function () {
                            $(this).parents("form").submit();
                        });

                        //form validation

   $('.btnNext').click(function(){
  $('.nav-tabs > .active').next('li').find('a').trigger('click');
});

  $('.btnPrevious').click(function(){
  $('.nav-tabs > .active').prev('li').find('a').trigger('click');
});
                    </script>
                    </section><!-- /.content -->

