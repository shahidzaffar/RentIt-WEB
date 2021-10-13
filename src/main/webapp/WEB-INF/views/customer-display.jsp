<%@include file="common/header.jspf" %>
<%@include file="common/adminNavigation.jspf" %>

<table class="table table-striped">
<caption>
	<b>	The Registered Customer are:</b>
</caption>

	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>CNIC</th>
			<th>Email Address</th>
			<th>PhoneNumber</th>
			<th>Description</th>
			<th></th>
			
		</tr>
	</thead>
	
	
	<tbody>
	
	
		<c:forEach items="${customers}" var="cus">

			<tr>
				<td> ${cus.id}</td>
				<td> ${cus.name}</td>
				<td>${cus.cnic}</td>
				<td>${cus.email}</td>
				<td>${cus.phone}</td>
				<td>${cus.description}</td>
				<td>
				<a class="btn btn-danger" href="/deleteCustomer?id=${cus.id}">Delete</a></td>
			</tr>
		
		</c:forEach>
				
		</tbody>
	</table>





<%@include file="common/footer.jspf" %>
<%@include file="common/highlight.jspf" %>