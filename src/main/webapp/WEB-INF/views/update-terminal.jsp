<%@include file="common/header.jspf" %>

<div class="container">
		<h1><b>Update a Terminal</b></h1>
	  

		<form:form action="/updateTerminal" method="post" modelAttribute="terminal">
		
			<form:hidden path="id"/>
			
			<fieldset class="form-group">
				<form:label path="name">Name</form:label>
				<form:input style="width:450px" path="name" type="text" class="form-control" required="required"/>
				<form:errors path="name" cssClass="text-warning" />
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