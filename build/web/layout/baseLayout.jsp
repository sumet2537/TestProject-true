<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib  uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<html lang="eng">
    <head>
        <title>ระบบขอสินเชื่อบ้าน </title>
        <meta charset="UTF-8">


        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/css1/styleBeass.css"/>
        <!--<script src="<%=request.getContextPath()%>/css/css1/styleBeass.js" type="text/javascript"></script>-->
        <!--<script language="javascript" src="./plugins/datatables/dataTables.bootstrap.min.js" type="text/javascript"></script>-->
        <!--<script language="javascript" src="./plugins/datatables/jquery.dataTables.min.js" type="text/javascript"></script>-->
        <link href="plugins/datatables/dataTables.bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="plugins/datatables/jquery.dataTables.css" rel="stylesheet" type="text/css"/>
        <!--<script src="plugins/datatables/sweetalert.min.js" type="text/javascript"></script>-->
        <script src="<%=request.getContextPath()%>/plugins/datatables/dataTables.bootstrap.min.js" type="text/javascript"></script>




        <!--validate-->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/css1/bootstrapValidator.min.css">
       <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
        <script src="<%=request.getContextPath()%>/js/bootstrapvalidator.min.js" type="text/javascript"></script>
        <script src="<%=request.getContextPath()%>/js/validate-register.js" type="text/javascript"></script>
        <script src="<%=request.getContextPath()%>/js/modal.js" type="text/javascript"></script>

        <!--validate-->

        <!-- Bootstrap 3.3.4 -->
        <!--<link href="css/style1.css" rel="stylesheet" type="text/css" />-->
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <!-- Font Awesome Icons -->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Ionicons -->
        <link href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css" rel="stylesheet" type="text/css" />
        <!-- jvectormap -->
        <link href="plugins/jvectormap/jquery-jvectormap-1.2.2.css" rel="stylesheet" type="text/css" />
        <!-- Theme style -->
        <link href="dist/css/AdminLTE.min.css" rel="stylesheet" type="text/css" />
        <!-- AdminLTE Skins. Choose a skin from the css/skins
             folder instead of downloading all of them to reduce the load. -->
        <link href="dist/css/skins/_all-skins.min.css" rel="stylesheet" type="text/css" />

    </head>

    <body class="skin-blue sidebar-mini">
        <div class="wrapper">
            <header class="main-header">
                <tiles:insert name="header" />
            </header>
            <aside class="main-sidebar">
                <tiles:insert name="menu" />
            </aside>
            <div class="content-wrapper">
                <tiles:insert name="body" />
            </div>
            <footer class="main-footer">
                <tiles:insert name="footer" />
            </footer>
            <script src="<%=request.getContextPath()%>/js/alert.js"></script>
            <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/css1/sweetalert.css"/>
            <script src="<%=request.getContextPath()%>/css/css1/sweetalert.min.js" type="text/javascript"></script>

            <!-- jQuery 2.1.4 -->
            <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<!--           <script src="<%=request.getContextPath()%>/plugins/jQuery/jquery-3.1.1.min.js" type="text/javascript"></script>-->
            <!--<script src="https://code.jquery.com/jquery-1.12.4.js"></script>-->

            <script src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
            <!--<script src="plugins/jQuery/jquery-1.10.2.js" type="text/javascript"></script>-->
            <!-- Bootstrap 3.3.2 JS -->
            <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
            <!-- FastClick -->
            <script src='plugins/fastclick/fastclick.min.js'></script>
            <!-- AdminLTE App -->
            <script src="dist/js/app.min.js" type="text/javascript"></script>
            <!-- Sparkline -->
            <script src="plugins/sparkline/jquery.sparkline.min.js" type="text/javascript"></script>
            <!-- jvectormap -->
            <script src="plugins/jvectormap/jquery-jvectormap-1.2.2.min.js" type="text/javascript"></script>
            <script src="plugins/jvectormap/jquery-jvectormap-world-mill-en.js" type="text/javascript"></script>
            <!-- SlimScroll 1.3.0 -->
            <script src="plugins/slimScroll/jquery.slimscroll.min.js" type="text/javascript"></script>
            <!-- ChartJS 1.0.1 -->
            <script src="plugins/chartjs/Chart.min.js" type="text/javascript"></script>
            <script src="plugins/jQueryUI/jquery.validate.js" type="text/javascript"></script>
            <!-- AdminLTE for demo purposes -->
            <script src="dist/js/demo.js" type="text/javascript"></script>
        </div>
    </body>

</html>

<script>
    $(function () {
        $('#example1').DataTable({
            "paging": true,
            "ordering": true
//             "dom": '<"pull-left"f><"pull-right"l>tip'
//            "info": true
//              "dom": '<"top"i>rt<"bottom"flp><"clear">'
        });

    });
</script>
<style>
    /*    .dataTables_filter {
       width: 50%;
       float: right;
       text-align: right;
    }*/
    
</style>