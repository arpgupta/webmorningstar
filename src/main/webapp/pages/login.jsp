<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title> Login page</title>
  <!-- CORE CSS-->
  <link rel="shortcut icon" type="image/png" href="img/login.png"/>
 <!--   <link rel="stylesheet" href="css/materialize.min.css"> -->
 
 <style>
 html,
body {
    height: 100%;
}
/*html {
    display: table;
    margin: auto;
}*/
.body {
    display: table-cell;
    vertical-align: middle;
     display: table;
    margin:auto ;
}
.margin {
  margin: 0 !important;
}
.size-logo{
  height: 12em !important;
}
.body{
	background-color: rgb(11, 90, 146) !important;
}
.input-field input:focus + label {
   color:  rgb(11, 90, 146) !important;
 }
 /* label underline focus color */
 .row .input-field input:focus {
   border-bottom: 1px solid  rgb(9, 123, 204)!important;
   box-shadow: 0 1px 0 0  rgb(9, 123, 204) !important
 }

 .input-field .prefix.active {
    color: rgb(9, 123, 204) !important;
}
[type="checkbox"]:checked+label:before {
    top: -4px;
    left: -3px;
    width: 12px;
    height: 22px;
    border-top: 2px solid transparent;
    border-left: 2px solid transparent;
    border-right: 2px solid rgb(9, 123, 204);
    border-bottom: 2px solid rgb(9, 123, 204);
    -webkit-transform: rotate(40deg);
    -moz-transform: rotate(40deg);
    -ms-transform: rotate(40deg);
    -o-transform: rotate(40deg);
    transform: rotate(40deg);
    -webkit-backface-visibility: hidden;
    -webkit-transform-origin: 100% 100%;
    -moz-transform-origin: 100% 100%;
    -ms-transform-origin: 100% 100%;
    -o-transform-origin: 100% 100%;
    transform-origin: 100% 100%;
}
.btn, .btn-large {
    text-decoration: none;
    color: #fff;
    background-color: rgb(11, 90, 146);
    text-align: center;
    letter-spacing: .5px;
    -webkit-transition: .2s ease-out;
    -moz-transition: .2s ease-out;
    -o-transition: .2s ease-out;
    -ms-transition: .2s ease-out;
    transition: .2s ease-out;
    cursor: pointer;
}
.btn:hover, .btn-large:hover {
    background-color: rgb(9, 123, 204);
}
#login-page{
	margin-top: 30px;
}
nav{
 padding:  0px 20px 0px 20px;
 background-color:rgb(11, 90, 146) !important;
}
.dropdown-content li>a, .dropdown-content li>span {
    font-size: 1.2rem;
    color: rgb(11, 90, 146) !important;
    display: block;
    padding: 1rem 1rem;
}

.dashboard-body{
	background-color: #f5f2f0;
}
.card-margin{
	    margin-top: 3em;
}
.img-card{    height: 150px;
    width: 150px !important;
    margin: 10px auto;}
    .text-center{
    	text-align: center;
    }
    .card-1:hover {
  box-shadow: 0 14px 28px rgba(0,0,0,0.25), 0 10px 10px rgba(0,0,0,0.22);
}
.arrows { white-space: nowrap;padding: 0px;	 }
.arrows li {
    display: inline-block;
    line-height: 26px;
    margin: 0 9px 0 -10px;
    padding: 0 20px;
    position: relative;
   
}
.arrows li::before,
.arrows li::after {
    border-right: 1px solid #666666;
    content: '';
    display: block;
    height: 50%;
    position: absolute;
    left: 0;
    right: 0;
    top: 0;
    z-index: -1;
    transform: skewX(45deg);   
}
.arrows li::after {
    bottom: 0;
    top: auto;
    transform: skewX(-45deg);
}

.arrows li:last-of-type::before, 
.arrows li:last-of-type::after { 
    display: none; 
}

.arrows li a { 
   font: bold 16px Sans-Serif;  
   letter-spacing: -1px; 
   text-decoration: none;
}

.arrows li:nth-of-type(1) a {     color: #5f9cc7;; } 
.arrows li:nth-of-type(2) a {     color: #5f9cc7; } 
.arrows li:nth-of-type(3) a {     color: #5f9cc7; } 
.arrows li:nth-of-type(4) a {     color: #0b5a92; } 
.text-logo{
	    position: absolute;
    color: #fff;
    display: inline-block;
    font-size: 2.1rem;
    padding: 0;
    white-space: nowrap;
    left: 60px;
}
.img-logo{
	    top: 6px !important;
}
.text-h-ad{
	padding: 7px;
    font-size: 17px;
    color: #0b5a92;
}
.padding{
	      padding-left: 17px;
}
[type="radio"]:checked+label:after {
    border-radius: 50%;
    border: 2px solid #0b5a92;
    background-color: #0b5a92;
    z-index: 0;
    -webkit-transform: scale(1.02);
    -moz-transform: scale(1.02);
    -ms-transform: scale(1.02);
    -o-transform: scale(1.02);
    transform: scale(1.02);
}
.card-main{
       padding: 1em 2em 4em 2em !important;
}
.breadcrumb { 
  list-style: none; 
  overflow: hidden; 
  font: 18px Sans-Serif;
}
.breadcrumb li { 
  float: left; 
}
.breadcrumb li a {
  color: white;
  text-decoration: none; 
  padding: 10px 0 10px 65px;
  background: brown; /* fallback color */
  background: hsl(205, 86%, 31%); 
  position: relative; 
  display: block;
  float: left;
}.breadcrumb li a::after { 
  content: " "; 
  display: block; 
  width: 0; 
  height: 0;
  border-top: 50px solid transparent; /* Go big on the size, and let overflow hide */
  border-bottom: 50px solid transparent;
  border-left: 30px solid hsl(205, 86%, 31%);
  position: absolute;
  top: 50%;
  margin-top: -50px; 
  left: 100%;
  z-index: 2; 
}.breadcrumb li a::before { 
  content: " "; 
  display: block; 
  width: 0; 
  height: 0;
  border-top: 50px solid transparent;       
  border-bottom: 50px solid transparent;
  border-left: 30px solid white;
  position: absolute;
  top: 50%;
  margin-top: -50px; 
  margin-left: 1px;
  left: 100%;
  z-index: 1; 
}
 .active_list a{
     background: rgb(9, 123, 204) !important; 
}
 .active_list>a:after{
      border-left-color: rgb(9, 123, 204) !important; 
}
.breadcrumb li:first-child a {
  padding-left: 10px;
}
.breadcrumb li:nth-child(2) a       { background:        hsl(205, 86%, 31%); }
.breadcrumb li:nth-child(2) a:after { border-left-color: hsl(205, 86%, 31%); }
.breadcrumb li:nth-child(3) a       { background:        hsl(205, 86%, 31%); }
.breadcrumb li:nth-child(3) a:after { border-left-color: hsl(205, 86%, 31%); }
.breadcrumb li:nth-child(4) a       { background:        hsl(205, 86%, 31%); }
.breadcrumb li:nth-child(4) a:after { border-left-color: hsl(205, 86%, 31%); }
.breadcrumb li:nth-child(5) a       { background:        hsl(205, 86%, 31%); }
.breadcrumb li:nth-child(5) a:after { border-left-color: hsl(205, 86%, 31%); }
.breadcrumb li:last-child a {
  background: hsl(205, 86%, 31%); !important;
  
}
.breadcrumb li:last-child a :after { border-left-color: hsl(205, 86%, 31%); }

.breadcrumb li a:hover { 
  background: rgb(9, 123, 204); 
}
.breadcrumb li a:hover:after { 
  border-left-color: rgb(9, 123, 204) !important; 
}
.button-margin{
    top: 37px;
}
button:focus {
    outline: none;
    background-color: rgb(9, 123, 204);
}
.registations{
    font-size: 107px;
    text-align: center;
    margin-left: 50px;
    color: #8a8585;
}
.p_check_mar{
    margin-left: 11px;
}
.row_form{
    margin: 0em 2.5em 1.5em;
}
.label-fee{
font-size: 20px !important;
}
.text-light{
color:    rgba(9, 123, 204, 0.71);
    padding: 20px 0px 25px 0px;
}
.dropdown-content li>span {
  
    color: #0b5a92 !important;
   
}
[type="checkbox"]:checked+label:before {
    
    border-right: 2px solid #0b5a92 !important;
    border-bottom: 2px solid #0b5a92 !important;
   
}
[type="checkbox"]:not(:checked):disabled+label:before {
    border: none;
    background-color: rgb(11, 90, 146) !important;
}
.picker__date-display {
   
    background-color:  #084c7d !important;
    color: #fff;
   
}
.picker__weekday-display {
    background-color: #073d64 !important;
   
}

.picker__day--selected, .picker__day--selected:hover, .picker--focused .picker__day--selected {
   
    background-color: #073d64 !important;
    color: #ffffff;
}
.picker__day.picker__day--today {
    color: #073d64 !important;
}
.picker__close, .picker__today {
    font-size: 1.1rem;
    padding: 0 1rem;
    color: #073d64 !important;
}
.btn, .btn-large {
   
    background-color: #0b5a92 !important;
    
   
}
.btn:hover, .btn-large:hover {
    background-color: rgb(9, 123, 204) !important;
}
.input-field label {
    color: #0b5a92 !important;
   
}
label {
    color: #0b5a92 !important;
}
.header2{
        color: #0b5a92;
}
.dropify-wrapper {
   
    border: 1px solid #0b5a92 !important;
}
.container_b {
    width: 94%;
    margin-left: 2.5em;
}
.green-text{

}
.font-size-icon{
	vertical-align: text-top;
    height: 15px;
    margin-right: 5px;
}
.icon-img{
  height: 30px;
    width: 30px !important;
    top: 12px;
}
.button-img{
      vertical-align: inherit;
    height: 20px;
    margin-left: 10px;
}
.recipt-width{
  width: 100% !important;
}
.logo-recipt{
  display: none;
}
[type="radio"]:checked+label:after {
    border-radius: 50%;
    border: 2px solid #0b5a92 !important;
    background-color: #0b5a92 !important;
    z-index: 0;
    -webkit-transform: scale(1.02);
    -moz-transform: scale(1.02);
    -ms-transform: scale(1.02);
    -o-transform: scale(1.02);
    transform: scale(1.02);
}
.dropimg{
height: 14px;
    vertical-align: middle;
    margin-left: 18px;}
    .picker__day.picker__day--today.picker__day--selected {
    color: #fff !important;
}
.main_cantainer{
	width: 94%;
    margin: 0 auto;
    
}
.label-fee{
    font-size: 18px;

    position: relative;
}
.col-fee{
        margin-top: 22px;
}
.fee-selction{
       box-shadow: 0 2px 5px 0 rgba(0,0,0,0.16), 0 2px 10px 0 rgba(0,0,0,0.12);
    padding: 2em !important;
    margin: 2em 0em 0em 0em;
}
.searchtop{
	top:10px;
}
.paid{
font-size: 18px;
    font-weight: 500;
   
    margin-top: 9px;}
    .containe-pay{
    width:94%;
    margin:0 auto;
    }
   label .error{top: 47px;
    color: red !important;}
   textarea.materialize-textarea:focus:not([readonly]) {
    border-bottom: 1px solid #0b5a92 !important;
    box-shadow: 0 1px 0 0 #0b5a92 !important;
}
.radio-add{
	padding-top:30px !important;
}
.radio-add>p{
	    display: inline;
}
.radio-add>label{
	font-size: 15px;
}
.h6-p{
padding-left: 4px;
    font-size: 18px;
}
input[type=number]::-webkit-inner-spin-button, 
input[type=number]::-webkit-outer-spin-button { 
  -webkit-appearance: none !important; 
  margin: 0; 
}
.serach-top{
    margin-top: 34px;}
    input[type=text].invalid, input[type=text]:focus.invalid, input[type=password].invalid, input[type=password]:focus.invalid, input[type=email].invalid, input[type=email]:focus.invalid, input[type=url].invalid, input[type=url]:focus.invalid, input[type=time].invalid, input[type=time]:focus.invalid, input[type=date].invalid, input[type=date]:focus.invalid, input[type=datetime-local].invalid, input[type=datetime-local]:focus.invalid, input[type=tel].invalid, input[type=tel]:focus.invalid, input[type=number].invalid, input[type=number]:focus.invalid, input[type=search].invalid, input[type=search]:focus.invalid, textarea.materialize-textarea.invalid, textarea.materialize-textarea:focus.invalid {
    border-bottom: 1px solid #F44336;
    box-shadow: 0 1px 0 0 #F44336;
}
   .serach-img{ position: absolute;
    display: inline-block;
    white-space: nowrap;
    word-wrap: normal;
    direction: ltr;
    margin-left: -37px;
    margin-top: 13px;
    height: 26px;
}
input[type=text]:disabled, input[type=text][readonly="readonly"], input[type=password]:disabled, input[type=password][readonly="readonly"], input[type=email]:disabled, input[type=email][readonly="readonly"], input[type=url]:disabled, input[type=url][readonly="readonly"], input[type=time]:disabled, input[type=time][readonly="readonly"], input[type=date]:disabled, input[type=date][readonly="readonly"], input[type=datetime-local]:disabled, input[type=datetime-local][readonly="readonly"], input[type=tel]:disabled, input[type=tel][readonly="readonly"], input[type=number]:disabled, input[type=number][readonly="readonly"], input[type=search]:disabled, input[type=search][readonly="readonly"], textarea.materialize-textarea:disabled, textarea.materialize-textarea[readonly="readonly"] {
    color: rgb(0, 0, 0) !important;
    border-bottom: 1px solid rgba(0, 0, 0, 0.26);
}
.date{ display: inline;}
    margin-top: 34px;}
 
 
 </style>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.1/css/materialize.min.css">

  <!-- Compiled and minified JavaScript -->
  
          
  <link rel="stylesheet" type="text/css" href="css/style.css">

<body class="body">


  <div id="login-page" class="row">
    <div class="col s12 z-depth-6 card-panel">
      <form:form  modelAttribute="login"  action="login.do" method="post"  class="login-form"> 
        <div class="row">
          <div class="input-field col s12 center">
            <img src="images/login.png" alt="" class="responsive-img valign profile-image-login size-logo">
          </div>
        </div>
         <c:if test="${not empty message}">
                <span class="text-center redcolor">${message}</span>
         </c:if>
        <div class="row margin">
          <div class="input-field col s12">
            <img src="images/user.png" class="prefix icon-img">
            <form:input path="email"  type="text" class="validate" placeholder="Email"/>
            <label for="email" data-error="wrong" >Email</label>
          </div>
        </div>
        <div class="row margin">
          <div class="input-field col s12">
             <img src="images/password.png" class="prefix icon-img">
           <form:input path="password" id="password" placeholder="password" type="password"  />
            <label for="password">Password</label>
          </div>
        </div>
        <div class="row">          
          <div class="input-field col s12 m12 l12  login-text">
              <input type="checkbox" id="remember-me" />
              <label for="remember-me">Remember me</label>
          </div>
        </div>
        <div class="row">
          <div class="input-field col s12">
            <a href="javascript:submitForm('login')" class="btn waves-effect waves-light col s12">Login</a>
          </div>
        </div>
        <div class="row">
          <div class="input-field col s6 m6 l6">
              <p class="margin right-align medium-small"><a href="#">Forgot password?</a></p>
          </div>          
        </div>

      </form:form>
    </div>
  </div>

 <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.1/js/materialize.min.js"></script>
  <script type="text/javascript">
    	function submitForm(formId){
       		 $("#"+formId).submit();
       	}
    	
    	
      </script>
 

  
</body>

</html>