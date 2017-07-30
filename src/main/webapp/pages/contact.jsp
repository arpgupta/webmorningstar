<%@ page import="com.ms.controller.JavaEmail"%>
<%@ page import="javax.mail.MessagingException"%>
<%
	String message = null;
	String status = null;
	if (request.getParameter("submit") != null) {
		JavaEmail javaEmail = new JavaEmail();
		javaEmail.setMailServerProperties();
		String emailSubject = "Contact Form using Java JSP GMail";
		String emailBody = "";
		if (request.getParameter("name") != null) {
			emailBody = "Sender Name: " + request.getParameter("name")
					+ "<br>";
		}
		if (request.getParameter("email") != null) {
			emailBody = emailBody + "Sender Email: "
					+ request.getParameter("email") + "<br>";
		}
		if (request.getParameter("phone") != null) {
			emailBody = emailBody + "Sender Phone: "
					+ request.getParameter("phone") + "<br>";
		}
		if (request.getParameter("message") != null) {
			emailBody = emailBody + "Message: " + request.getParameter("message")
					+ "<br>";
		}
		javaEmail.createEmailMessage(emailSubject, emailBody);
		try {
			javaEmail.sendEmail();
			status = "success";
			message = "Email sent Successfully!";
		} catch (MessagingException me) {
			status = "error";
			message = "Error in Sending Email!";
		}
	}
%>    
<%@ include file = "../include/header.jsp" %>
        <!--Page Title-->
        <section class="page-title">
            <div class="container">
                <div class="row clearfix">
                    <div class="col-md-6 col-sm-6 col-xs-12 pull-left">
                        <h1>Contact Us</h1>
                    </div>
                    <div class="col-md-6 col-sm-6 col-xs-12 pull-right text-right path"><a href="index-2.html">Home</a>&ensp;>&ensp;<a href="#">Contact Us</a>
                    </div>
                    <div class="overlay"></div>
                </div>
            </div>
        </section>
        <!--Page Title Ends-->
		<!--contact-address start-->
        <section class="contact-address">
            <div class="container">
                <div class="inner-box">
                    <div class="item-list">
                        <div class="row">
                            <div class="item col-md-4 col-sm-6 col-xs-12">
                                <div class="border">
                                    <div class="icon-box">
                                        <i class="icon fa fa-map-marker"></i>
                                    </div>
                                </div>
                                <h3>Address</h3>
                                <p>Swami KrishnanandPuram,
                                    <br>Karmer Road, Orai - 285001</p>
                            </div>
                            <div class="item col-md-4 col-sm-6 col-xs-12">
                                <div class="border">
                                    <div class="icon-box">
                                        <i class="icon fa fa-phone"></i>
                                    </div>
                                </div>
                                <h3>Phone</h3>
                                <p>05162 258242
                                    <br>05162 258242</p>
                            </div>
                            <div class="item col-md-4 col-sm-6 col-xs-12">
                                <div class="border">
                                    <div class="icon-box">
                                        <i class="icon fa fa-envelope"></i>
                                    </div>
                                </div>
                                <h3>Email</h3>
                                <p>info@morningstar.com
                                    <br>info@morningstar.com</p>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </section>
		<!--contact-address end-->
		<!--contact_details start-->
        <section class="contact_details sec-padd">
            <div class="container">
                <div class="home-google-map">
                    <div class="google-map" id="contact-google-map" data-map-lat="25.988207" data-map-lng="79.471707" data-icon-path="images/resources/map.png" data-map-title="Chester" data-map-zoom="16">
                    </div>
                </div>
            </div>
        </section>
		<!--contact_details end-->

		<!--contact_us start-->
        <section class="contact_us">
            <div class="container">
                <div class="sec-title text-center">
                    <h2>Get In <span>Touch</span></h2>
                    <!-- <p>Cupidatat non proident sunt culpa qui officia deserunt mollit anim idest laborum</p> -->
                </div>
                <div class="default-form-area">
                    <form id="frmContact" name="frmContact" class="default-form" action="" method="post">
                        <div class="row clearfix">
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <div class="form-group style-two">
                                    <input type="text" name="name" class="form-control" value="" placeholder="Name" required="">
                                </div>
                            </div>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <div class="form-group style-two">
                                    <input type="email" name="email" class="form-control required email" value="" placeholder="Email" required="">
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <div class="form-group style-two">
                                    <input type="text" name="phone" class="form-control" value="" placeholder="Phone">
                                </div>
                            </div>
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <div class="form-group style-two">
                                    <textarea name="form_message" class="form-control textarea required" placeholder="Your Message"></textarea>
                                </div>
                            </div>
                        </div>
                        
                        <input type="submit" name="submit" value="Send Message"
						id="send-message" style="clear: both;">
                                
                                <%
						if (null != message) {
							out.println("<div class='" + status + "'>"
									+ message + "</div>");
						}
					%>
                        <div class="contact-section-btn text-center">
                            <div class="form-group style-two">
                                <!-- <input id="form_botcheck" name="form_botcheck" class="form-control" type="hidden" value=""> -->
                                <!-- <button class="thm-btn thm-color" type="submit" data-loading-text="Please wait...">send message</button> -->
                                	<div id="mail-status"></div>
                                <!-- <input class="thm-btn thm-color" type="submit" >send message -->
                                
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </section>




<%@ include file = "../include/footer.jsp" %>
