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
                    <img src="./img/12.jpg"  /><br><br>
              

            </div>

        </div>
</section><!-- /.content -->

<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="panel with-nav-tabs panel-info">
                <div class="panel-heading1">
                    <ul class="nav nav-tabs">
                        <li class="active"><a href="#tab1" data-toggle="tab">Shipping</a></li>
                        <li><a href="#tab2" data-toggle="tab">Quantities</a></li>
                        <li><a href="#tab3" data-toggle="tab">Summary</a></li>
                        <li><a href="#tab4" data-toggle="tab">Quantities</a></li>
                        <li><a href="#tab5" data-toggle="tab">Summary</a></li>
                        <li><a href="#tab6" data-toggle="tab">Quantities</a></li>
                        <li><a href="#tab7" data-toggle="tab">Summary</a></li>
                    </ul>
                    <div class="tab-content">
                        <div class="tab-pane active" id="tab1">
                            <div class="center">   <a class="btn btn-primary btnNext">Next</a></div>
                        </div>
                        <div class="tab-pane" id="tab2">
                            
                            <div class="pull-left"> <a class="btn btn-primary btnNext pull-left">Next</a>
                            </div>
                            <div class="pull-right"> <a class="btn btn-primary btnPrevious">Previous</a></div>
                           
                        </div>
                        <div class="tab-pane" id="tab3">
                            <!--<a class="btn btn-primary btnPrevious">Previous</a>-->
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<br>
<script>
    $('.btnNext').click(function () {
        $('.nav-tabs > .active').next('li').find('a').trigger('click');
    });

    $('.btnPrevious').click(function () {
        $('.nav-tabs > .active').prev('li').find('a').trigger('click');
    });

</script>