<%-- 
    Document   : bootstrap-example
    Created on : Feb 23, 2016, 5:03:36 PM
    Author     : kohun_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container">
    <!--  Start Modal -->     
    <div class="page-header">
        <h1>Modal <small>Bootstrap Visual Test</small></h1>
    </div>    
    <button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
        Launch demo modal
    </button>

    <div id="myModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog">
            <div class="modal-content">

                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title" id="myModalLabel">Modal Heading</h4>
                </div>
                <div class="modal-body">
                    Kohung..
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save changes</button>
                </div>

            </div>
        </div>
    </div>      
    <!--  End Modal -->

    <!--  Start Tab -->
    <div class="page-header">
        <h1>Tab <small>Bootstrap Visual Test</small></h1>
    </div>

    <ul id="myTab" class="nav nav-tabs">
        <li class="active"><a href="#home" data-toggle="tab">Home</a></li>
        <li><a href="#profile" data-toggle="tab">Profile</a></li>
        <li class="dropdown">
            <a href="#" id="myTabDrop1" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown <b class="caret"></b></a>
            <ul class="dropdown-menu" aria-labelledby="myTabDrop1">
                <li><a href="#dropdown1" data-toggle="tab">@fat</a></li>
                <li><a href="#dropdown2" data-toggle="tab">@mdo</a></li>
            </ul>
        </li>
    </ul>
    <div id="myTabContent" class="tab-content">
        <div class="tab-pane active" id="home">
            Home.
        </div>
        <div class="tab-pane" id="profile">
            Profile.
        </div>
        <div class="tab-pane" id="dropdown1">
            Dropdown 1.
        </div>
        <div class="tab-pane" id="dropdown2">
            Dropdown 2.
        </div>
    </div>
    <!--  End Tab -->

    <!--  Start Dropdown -->
    <div class="page-header">
        <h1>Dropdown <small>Bootstrap Visual Test</small></h1>
    </div>

    <nav id="navbar-example" class="navbar navbar-default navbar-static" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <button class="navbar-toggle collapsed" type="button" data-toggle="collapse" data-target=".bs-example-js-navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Project Name</a>
            </div>
            <div class="collapse navbar-collapse bs-example-js-navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a id="drop1" href="#" role="button" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown <b class="caret"></b></a>
                        <ul class="dropdown-menu" aria-labelledby="drop1">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Separated link</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" id="drop2" role="button" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown 2 <b class="caret"></b></a>
                        <ul class="dropdown-menu" aria-labelledby="drop2">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Separated link</a></li>
                        </ul>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li id="fat-menu" class="dropdown">
                        <a href="#" id="drop3" role="button" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown 3 <b class="caret"></b></a>
                        <ul class="dropdown-menu" aria-labelledby="drop3">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Separated link</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!--  End Dropdown -->

    <!--  Start Panel -->
    <div class="page-header">
        <h1>Panel <small>Bootstrap Visual Test</small></h1>
    </div>
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3 class="panel-title"><span class="glyphicon glyphicon-cog"></span> Panel title</h3>
        </div>
        <div class="panel-body">
            Your Name
            <div class="row"> 
                <div class="col-lg-12">                            
                    <input type="text" name="name" class="form-control" />
                </div>
            </div>
            Position
            <div class="row">
                <div class="col-lg-12">
                    <select name="postion" class="selectpicker">
                        <option value="PG">Programmer</option>
                        <option value="PA">Programmer Analyst</option>
                        <option value="SA">System Analyst</option>
                        <option value="PM">Project Manager</option>
                    </select>
                </div>    
            </div>
        </div>
        <div class="panel-footer">
            <button type="button"  class="btn btn-success">
                <span class="glyphicon glyphicon-ok"></span> Ok
            </button>
            <button type="button"  class="btn btn-danger">
                <span class="glyphicon glyphicon-ban-circle"></span> Cancel
            </button>
        </div>

    </div>            
    <!--  End Panel -->
    <!--  Start Table -->
    <div class="page-header">
        <h1>Table <small>Bootstrap Visual Test</small></h1>
    </div>
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">Test Table</h3>
        </div>
        <div class="panel-body">
            <table class="table">
                <thead>
                    <tr>
                        <th>No</th>
                        <th>Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                        <th>Phone</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>Watchara</td>
                        <td>Sothirit</td>
                        <td>sothirit.w@gmail.com</td>
                        <td>08999888909</td>
                    </tr>
                </tbody>
            </table>                   
        </div>
        <div class="panel-footer">
            <button type="button"  class="btn btn-info">
                <span class="glyphicon glyphicon-plus-sign"></span> Add Data
            </button>
        </div>
    </div>
    <!--  End Table -->

    <!--  Start Radio -->
    <div class="page-header">
        <h1>Radio <small>Bootstrap Visual Test</small></h1>
    </div>
    <label for="sex" class="control-label input-group">Year</label>
    <div id="rdo" class="btn-group" data-toggle="buttons">
        <label class="btn btn-default">
            <span class="glyphicon"></span>
            <input type="radio" name="sex" value="Male" onclick="callRadioActive(this)">Male
        </label>
        <label class="btn btn-default">
            <span class="glyphicon"></span>
            <input type="radio" name="sex" value="Female" onclick="callRadioActive(this)">Female
        </label>
    </div>
    <!--  End Radio -->

    <!--  Start Check Box -->
    <div class="page-header">
        <h1>Checkbox <small>Bootstrap Visual Test</small></h1>
    </div>
    <label class="control-label input-group">Color</label>
    <div id="chk" class="btn-group" data-toggle="buttons">
        <label class="btn btn-primary">
            <span class="glyphicon"></span>
            <input type="checkbox" name="blue" value="2011" onclick="callCheckboxActive(this)">Blue
        </label>
        <label class="btn btn-danger">
            <span class="glyphicon"></span>
            <input type="checkbox" name="red" value="2012" onclick="callCheckboxActive(this)">Red
        </label>
        <label class="btn btn-success">
            <span class="glyphicon"></span>
            <input type="checkbox" name="green" value="2013" onclick="callCheckboxActive(this)">Green
        </label>
        <label class="btn btn-warning">
            <span class="glyphicon"></span>
            <input type="checkbox" name="yellow" value="2013" onclick="callCheckboxActive(this)">Yellow
        </label>
        <label class="btn btn-info">
            <span class="glyphicon"></span>
            <input type="checkbox"  name="skyblue" value="2013" onclick="callCheckboxActive(this)">Sky Blue
        </label>
    </div>
    <!--  End Check Box -->

    <!-- Start Progress -->
    <div class="page-header">
        <h1>Progress <small>Bootstrap Visual Test</small></h1>
    </div>
    <div class="progress">
        <div class="progress-bar progress-bar-success progress-bar-striped" style="width: 35%">
            <span class="sr-only">35% Complete (success)</span>
        </div>
        <div class="progress-bar progress-bar-warning progress-bar-striped" style="width: 20%">
            <span class="sr-only">20% Complete (warning)</span>
        </div>
        <div class="progress-bar progress-bar-danger progress-bar-striped" style="width: 10%">
            <span class="sr-only">10% Complete (danger)</span>
        </div>
    </div>
    <!--  End Progress -->


</div>
<script type="text/javascript">
    function callCheckboxActive() {

        $('#chk').find('.active').removeClass('active');
        $('#chk').find('.btn').find('.glyphicon-ok').removeClass('glyphicon-ok');

        $('#chk').find("input[type='checkbox']:checked").parent('.btn').addClass('active');
        $('#chk').find("input[type='checkbox']:checked").parent('.btn').find('span').addClass('glyphicon-ok');



    }
    function callRadioActive() {

        $('#rdo').find('.btn-info').removeClass('btn-info');
        $('#rdo').find('.active').removeClass('active');
        $('#rdo').find('.btn').find('.glyphicon-ok').removeClass('glyphicon-ok');

        $('#rdo').find("input[type='radio']:checked").parent('.btn').addClass('active');
        $('#rdo').find("input[type='radio']:checked").parent('.btn').addClass('btn-info');
        $('#rdo').find("input[type='radio']:checked").parent('.btn').find('span').addClass('glyphicon-ok');

        /*var selectedVal = "";
         var selected = $("#rdo input[type='radio']:checked");
         if (selected.length > 0) {
         selectedVal = selected.val();                    
         console.log(selectedVal);
         }*/

    }
</script>
