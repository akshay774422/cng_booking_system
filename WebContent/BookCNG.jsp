<%@ page import="com.akshay.works.*" %>
<%@ page import="java.sql.*" %>
<!doctype html>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <title>CNG BOOKING</title>

  <!-- Template CSS -->
  <link rel="stylesheet" href="assets/css/style-starter.css">

  <!-- google fonts -->
  <link href="//fonts.googleapis.com/css?family=Nunito:300,400,600,700,800,900&display=swap" rel="stylesheet">
</head>

<body class="">
<div class="se-pre-con"></div>
<section>
  <!-- sidebar menu start -->
  <div class="sidebar-menu sticky-sidebar-menu">

    <!-- logo start -->
    <div class="logo">
      <h1><a href="index.html">CNG BOOKING</a></h1>
    </div>

  <!-- if logo is image enable this -->
    <!-- image logo --
    <div class="logo">
      <a href="index.html">
        <img src="image-path" alt="Your logo" title="Your logo" class="img-fluid" style="height:35px;" />
      </a>
    </div>
    <!-- //image logo -->

    <div class="logo-icon text-center">
      <a href="index.html" title="logo"><img src="assets/images/logo.png" alt="logo-icon"> </a>
    </div>
    <!-- //logo end -->

    <div class="sidebar-menu-inner">

      <!-- sidebar nav start -->
   <ul class="nav nav-pills nav-stacked custom-nav">
        <li><a href="index.html"><i class="fa fa-tachometer"></i><span>Home Screen</span></a>
        </li>
        <li><a href="bookcng.html"><i class="fa fa-tachometer"></i><span>Book CNG</span></a>
        </li>
       
       
         <li><a href="userrelated.html"><i class="fa fa-table"></i> <span>Logout</span></a></li>
       
      </ul>
      <!-- //sidebar nav end -->
      <!-- toggle button start -->
      <a class="toggle-btn">
        <i class="fa fa-angle-double-left menu-collapsed__left"><span>Collapse Sidebar</span></i>
        <i class="fa fa-angle-double-right menu-collapsed__right"></i>
      </a>
      <!-- //toggle button end -->
    </div>
  </div>
  <!-- //sidebar menu end -->
  <!-- header-starts -->
  <div class="header sticky-header">

    <!-- notification menu start -->
    <div class="menu-right">
      <div class="navbar user-panel-top">
       
          <div class="profile_details">
            <ul>
              <li class="dropdown profile_details_drop">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" id="dropdownMenu3" aria-haspopup="true"
                  aria-expanded="false">
                  <div class="profile_img">
                    <img src="assets/images/profileimg.jpg" class="rounded-circle" alt="" />
                    <div class="user-active">
                      <span></span>
                    </div>
                  </div>
                </a>
                <ul class="dropdown-menu drp-mnu" aria-labelledby="dropdownMenu3">
                  <li class="user-info">
                    <h5 class="user-name">John Deo</h5>
                    <span class="status ml-2">Available</span>
                  </li>
                  <li> <a href="#"><i class="lnr lnr-user"></i>My Profile</a> </li>
                  <li> <a href="#"><i class="lnr lnr-users"></i>1k Followers</a> </li>
                  <li> <a href="#"><i class="lnr lnr-cog"></i>Setting</a> </li>
                  <li> <a href="#"><i class="lnr lnr-heart"></i>100 Likes</a> </li>
                  <li class="logout"> <a href="#sign-up.html"><i class="fa fa-power-off"></i> Logout</a> </li>
                </ul>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
    <!--notification menu end -->
  </div>
  <!-- //header-ends -->
<!-- main content start -->
<div class="main-content">

    <!-- content -->
    <div class="container-fluid content-top-gap">

        <!-- breadcrumbs -->
        <nav aria-label="breadcrumb" class="mb-4">
            <ol class="breadcrumb my-breadcrumb">
                
            </ol>
        </nav>
        <!-- //breadcrumbs -->
        <!-- forms -->
        <section class="forms">
            <!-- forms 1 -->
            <div class="card card_border py-2 mb-4">
                <div class="form-group">
                     <h3><span></span></h3>
                </div>
                <div class="card-body">
                    <!-- //forms 1 -->
				<form action="Book" method="post">
                        <div class="form-group">
                            <label for="exampleInputEmail1" class="input__label">Pump ID (Pump Database present at bottom side)</label>
                            <input type="txt" name="pid" class="form-control input-style" id="exampleInputEmail1"
                                aria-describedby="emailHelp" placeholder="Pump ID">
                            
                        </div>
                         <div class="form-group">
                            <label for="exampleInputEmail1" class="input__label">Quantity (Enter quantity in KG's)</label>
                            <input type="txt" name="quantity" class="form-control input-style" id="exampleInputEmail1"
                                aria-describedby="emailHelp" placeholder="Quantity">
                            
                        </div>
                         <div class="form-group">
                            <label for="exampleInputEmail1" class="input__label">Your Name</label>
                            <input type="txt" name="name" class="form-control input-style" id="exampleInputEmail1"
                                aria-describedby="emailHelp" placeholder="Name">
                            
                        </div>
                         <div class="form-group">
                            <label for="exampleInputEmail1" class="input__label">Contact Number</label>
                            <input type="txt" name="contact" class="form-control input-style" id="exampleInputEmail1"
                                aria-describedby="emailHelp" placeholder="Contact Number">
                            
                        </div>
                         <div class="form-group">
                            <label for="exampleInputEmail1" class="input__label">Your City</label>
                            <input type="txt" name="city" class="form-control input-style" id="exampleInputEmail1"
                                aria-describedby="emailHelp" placeholder="City">
                            
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail1" class="input__label">Your Current Address</label>
                            <input type="txt" name="add" class="form-control input-style" id="exampleInputEmail1"
                                aria-describedby="emailHelp" placeholder="Address">
                            
                        </div>
                        
                        
                        <button type="submit" class="btn btn-primary btn-style mt-4">BOOK</button>
                    </form>
                    <br>
           


            

        
        <!-- //forms -->
         <h3><span>AVAILABLE CNG PUMPS NEAR YOUR</span></h3>
                     
                       <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">P_id</th>
      <th scope="col">Pump Name</th>
      <th scope="col">Address</th>
      <th scope="col">Contact</th>
      <th scope="col">City</th>
      <th scope="col">Taluka</th>
      <th scope="col">District</th>
      <th scope="col">Open Time</th>
      <th scope="col">Close Time</th>
      <th scope="col">Latitude</th>
      <th scope="col">Longitude</th>
      <th scope="col">Password</th>
      <th scope="col">Available CNG</th>
     
     
    </tr>
  </thead>
  <tbody>
  <%
  try
  {
	  String u_city = request.getParameter("city");
	  String u_taluka = request.getParameter("taluka");
	  String u_district = request.getParameter("district");
	  Connection con = ConnectDB.getConnect();
	  PreparedStatement ps2 = con.prepareStatement("select * from cngpumps_tbl where city=? and taluka=? and district=?");
	  ps2.setString(1, u_city);
	  ps2.setString(2, u_taluka);
	  ps2.setString(3, u_district);
	  ResultSet rs = ps2.executeQuery();
	  while(rs.next())
	  {
  %>
    <tr>
 
      <td><%= rs.getInt(1) %></td>
      <td><%= rs.getString(2) %></td>
      <td><%= rs.getString(3) %></td>
      <td><%= rs.getString(4) %></td>
      <td><%= rs.getString(5) %></td>
      <td><%= rs.getString(6) %></td>
      <td><%= rs.getString(7) %></td>
      <td><%= rs.getString(8) %></td>
      <td><%= rs.getString(9) %></td>
      <td><%= rs.getFloat(10) %></td>
      <td><%= rs.getFloat(11) %></td>
      <td><%= rs.getString(12) %></td>
      <td><%= rs.getInt(13) %></td>
      
     

     
    </tr>
   <% 
   }
	  }
   catch(Exception e)
   {
	   e.printStackTrace();
   }
   %>
  </tbody>
</table>
                    </form>
                </div>
            </div>
           
        </section>
        <!-- //forms  -->

    </div>
    <!-- //content -->

</div>
<!-- main content end-->
</section>
<!--footer section start-->
<footer class="dashboard">
  <p>WELLCOME TO CNG BOOKING.  <a href="index.html" target="_blank"
      class="text-primary">By Akshay Badgujar.</a></p>
</footer>
<!--footer section end-->
<!-- move top -->
<button onclick="topFunction()" id="movetop" class="bg-primary" title="Go to top">
  <span class="fa fa-angle-up"></span>
</button>
<script>
  // When the user scrolls down 20px from the top of the document, show the button
  window.onscroll = function () {
    scrollFunction()
  };

  function scrollFunction() {
    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
      document.getElementById("movetop").style.display = "block";
    } else {
      document.getElementById("movetop").style.display = "none";
    }
  }

  // When the user clicks on the button, scroll to the top of the document
  function topFunction() {
    document.body.scrollTop = 0;
    document.documentElement.scrollTop = 0;
  }
</script>
<!-- /move top -->


<script src="assets/js/jquery-3.3.1.min.js"></script>
<script src="assets/js/jquery-1.10.2.min.js"></script>

<!-- chart js -->
<script src="assets/js/Chart.min.js"></script>
<script src="assets/js/utils.js"></script>
<!-- //chart js -->

<!-- Different scripts of charts.  Ex.Barchart, Linechart -->
<script src="assets/js/bar.js"></script>
<script src="assets/js/linechart.js"></script>
<!-- //Different scripts of charts.  Ex.Barchart, Linechart -->


<script src="assets/js/jquery.nicescroll.js"></script>
<script src="assets/js/scripts.js"></script>

<!-- close script -->
<script>
  var closebtns = document.getElementsByClassName("close-grid");
  var i;

  for (i = 0; i < closebtns.length; i++) {
    closebtns[i].addEventListener("click", function () {
      this.parentElement.style.display = 'none';
    });
  }
</script>
<!-- //close script -->

<!-- disable body scroll when navbar is in active -->
<script>
  $(function () {
    $('.sidebar-menu-collapsed').click(function () {
      $('body').toggleClass('noscroll');
    })
  });
</script>
<!-- disable body scroll when navbar is in active -->

 <!-- loading-gif Js -->
 <script src="assets/js/modernizr.js"></script>
 <script>
     $(window).load(function () {
         // Animate loader off screen
         $(".se-pre-con").fadeOut("slow");;
     });
 </script>
 <!--// loading-gif Js -->

<!-- Bootstrap Core JavaScript -->
<script src="assets/js/bootstrap.min.js"></script>


</body>

</html>