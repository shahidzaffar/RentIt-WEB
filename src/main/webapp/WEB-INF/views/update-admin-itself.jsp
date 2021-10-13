<%@include file="common/header.jspf" %>


<div class="container">
		
		
		<h1 style="border:orange; border-width:5px; border-style:solid;">
		
		<b>Update Your Profile</b></h1>
	  

		<form:form action="/updateAdminItself" method="post" modelAttribute="admin"
		style="border:blue; border-width:5px; border-style:double;
		margin-top: 100px;
 		 margin-bottom: 100px;
  		margin-right: 150px;
  		margin-left: 80px;;">
  		
		
			<form:hidden path="id"/>
			<form:hidden path="userName"/>
			
			<fieldset class="form-group">
				<form:label path="fullName">Full Name:</form:label>
				<form:input style="width:450px" path="fullName" type="text" class="form-control" required="required"/>
				<form:errors path="fullName" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="password">Password:</form:label>
				<form:input style="width:450px" path="password" type="text" class="form-control" required="required"/>
				<form:errors path="password" cssClass="text-warning" />
			</fieldset>
			
			
			<fieldset class="form-group">
				<form:label path="cnic">CNIC:</form:label>
				<form:input style="width:450px" path="cnic" type="text" class="form-control" required="required"/>
				<form:errors path="cnic" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="email">Email Address:</form:label>
				<form:input style="width:450px" path="email" type="text" class="form-control" required="required"/>
				<form:errors path="email" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="phone">Phone Number:</form:label>
				<form:input style="width:450px" path="phone" type="text" class="form-control" required="required"/>
				<form:errors path="phone" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="description">Description</form:label>
				<form:input style="width:450px" path="description" type="text" class="form-control" required="required"/>
				<form:errors path="description" cssClass="text-warning" />
			</fieldset>
		
			<button type="submit" class="btn btn-success">Submit</button>
		</form:form>
		
	</div>




<%@include file="common/footer.jspf" %>