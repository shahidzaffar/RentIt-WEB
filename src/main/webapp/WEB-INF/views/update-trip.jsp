<%@include file="common/header.jspf" %>

<div class="container">
		<h1><b>Update a Trip</b></h1>
	  

		<form:form action="/updateTrip" method="post" modelAttribute="trip">
		
			<form:hidden path="id"/>
			<form:hidden path="trip_date"/>
			<form:hidden path="start_time"/>
			<form:hidden path="end_time"/>
			<form:hidden path="reading_at_start"/>
			<form:hidden path="customer.id"/>
			<form:hidden path="vehicle.id"/>
			
			
	
			
			
			<fieldset class="form-group">
				<form:label path="status">Status</form:label>
				<form:input style="width:450px" path="status" type="text" class="form-control" required="required"/>
				<form:errors path="status" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="reading_at_start">Meter Reading at Start Of Ride:</form:label>
				<form:input style="width:450px" path="reading_at_start" type="text" class="form-control" required="required"/>
				<form:errors path="reading_at_start" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="reading_at_end">Meter Reading at End Of Ride:</form:label>
				<form:input style="width:450px" path="reading_at_end" type="text" class="form-control" required="required"/>
				<form:errors path="reading_at_end" cssClass="text-warning" />
			</fieldset>
		
		
		<fieldset class="form-group">
				<form:label path="description">Comment</form:label>
				<form:input style="width:450px" path="description" type="text" class="form-control" required="required"/>
				<form:errors path="description" cssClass="text-warning" />
			</fieldset>
		
			<button type="submit" class="btn btn-success">Submit</button>
			
		</form:form>
		
		
	</div>




<%@include file="common/footer.jspf" %>