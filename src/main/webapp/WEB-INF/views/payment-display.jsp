<%@include file="common/header.jspf" %>
<%@include file="common/adminNavigation.jspf" %>

<table class="table table-striped">
<caption>
		<b>The Payments are:</b>
</caption>

	<thead>
		<tr>
			<th>Id</th>
			<th>Payment Time</th>
			<th>Bill</th>
			<th>Customer</th>
			<th>Trip</th>
			<th>Description</th>
			
			
		</tr>
	</thead>
	
	
	<tbody>
	
	
		<c:forEach items="${payments}" var="pay">

			<tr>
				<td>${pay.id}</td>
				<td> ${pay.payment_time}</td>
				<td>${pay.bill}</td>
				<td>${pay.customer.name}</td>
				<td>${pay.trip.id}</td>
				
				<td>${pay.description}</td>
				<td>
				<a class="btn btn-danger" href="/deleteTrip?id=${pay.id}">Delete</a></td>
			</tr>
		
		</c:forEach>
				
		</tbody>
	</table>





<%@include file="common/footer.jspf" %>
<%@include file="common/highlight.jspf" %>