<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lic Agent Hyderabad</title>
</head>
<body>
          <div class="td-pb-span4 td-main-sidebar" role="complementary">
                            <div class="td-ss-main-sidebar">
                                <aside id="text-2" class="td_block_template_4 widget text-2 widget_text"><h4 class="td-block-title"><span>Book an Appointment</span></h4>			<div class="textwidget"><div role="form" class="wpcf7" id="wpcf7-f117-o1" lang="en-US" dir="ltr">
<div class="screen-reader-response"><p role="status" aria-live="polite" aria-atomic="true"></p> <ul></ul></div>
 <form:form action="/postData" method="post" modelAttribute="book">
<div style="display: none;">
</div>

<p><label><span class="wpcf7-form-control-wrap" data-name="your-name"><input type="text" name="name" value="" size="40" class="wpcf7-form-control wpcf7-text wpcf7-validates-as-required" aria-required="true" aria-invalid="false" placeholder="Your Name *" /></span> </label></p>
<p><label><span class="wpcf7-form-control-wrap" data-name="your-email"><input type="email" name="your-email" value="" size="40" class="wpcf7-form-control wpcf7-text wpcf7-email wpcf7-validates-as-required wpcf7-validates-as-email" aria-required="true" aria-invalid="false" placeholder="Email Address *" /></span> </label></p>
<p><label><span class="wpcf7-form-control-wrap" data-name="your-phone"><input type="text" name="your-phone" value="" size="40" class="wpcf7-form-control wpcf7-text wpcf7-validates-as-required" aria-required="true" aria-invalid="false" placeholder="Phone Number *" /></span> </label></p>
<p><label><span class="wpcf7-form-control-wrap" data-name="your-message"><textarea name="your-message" cols="40" rows="10" class="wpcf7-form-control wpcf7-textarea" aria-invalid="false" placeholder="Message *"></textarea></span> </label></p>
<p><input type="submit" value="Submit" class="wpcf7-form-control has-spinner wpcf7-submit" /></p>
<div class="wpcf7-response-output" aria-hidden="true"></div></form:form></div>
</div>
		</aside>                            </div>
                        </div>
</body>
</html>