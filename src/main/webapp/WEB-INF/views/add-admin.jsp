<%@include file="common/header.jspf" %>


<%@include file="common/footer.jspf" %>

<div class="container">
		<h1><b>Add a new Contact Person</b></h1>

		<form:form action="/addAdmin" method="post" modelAttribute="adminAdd">
		
			<fieldset class="form-group">
				<form:label path="fullName">Name</form:label>
				<form:input style="width:450px" path="fullName" type="text" class="form-control" placeholder="Enter Full Name : " required="required"/>
				<form:errors path="fullName" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="userName">Username</form:label>
				<form:input style="width:450px" path="userName" type="text" class="form-control" placeholder="Enter Username : " required="required"/>
				<form:errors path="userName" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="password">Password</form:label>
				<form:input style="width:450px" path="password" type="text" class="form-control" placeholder="Enter Password:" required="required"/>
				<form:errors path="password" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="cnic">CNIC</form:label>
				<form:input  style="width:450px" path="cnic" type="text" class="form-control" placeholder="Enter CNIC:" required="required"/>
				<form:errors path="cnic" cssClass="text-warning" />
			</fieldset>
				
				
			<fieldset class="form-group">
				<form:label path="email">Email</form:label>
				<form:input style="width:450px" path="email" type="text" class="form-control" placeholder="Enter Email:" required="required"/>
				<form:errors path="email" cssClass="text-warning" />
			</fieldset>
			
			
			<fieldset class="form-group">
				<form:label path="phone">Phone Number</form:label>
				<form:input style="width:450px" path="phone" type="text" class="form-control" placeholder="Enter Phone Number : " required="required"/>
				<form:errors path="phone" cssClass="text-warning" />
			</fieldset>
			
			

			<fieldset class="form-group">
				<form:label path="description">Description</form:label>
				<form:input style="width:450px" path="description" type="text" placeholder="Enter Description" class="form-control"/>
				<form:errors path="description" cssClass="text-warning" />
			</fieldset>
			
			
			<button type="submit" class="btn btn-success">Submit</button>
		</form:form>
		
	</div>
