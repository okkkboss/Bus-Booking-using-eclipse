<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Places in Mumbai</title>
	<link rel="stylesheet" href=
"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
		integrity=
"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
		crossorigin="anonymous">
		
<style type="text/css">
body{
background-image:url("shivshahi.jpg");
<meta charset="ISO-8859-1">
</style>
</head>

<body>
	<h2 style="color:yellow" >Welcome to the Shivshahi Travels...</h2>
		
	
<p style="color:gray"><b>Click on the button to see images...</b></p>

		<!-- Using Bootstrap Modal: -->
	<!-- Button to launch a modal -->
	<button type="button"
		class="btn btn-primary"
		data-toggle="modal"
		data-target="#exampleModal1">
		Pune
	</button>

	<!-- Modal -->
	<div class="modal fade"
		id="exampleModal1"
		tabindex="-1"
		role="dialog"
		aria-labelledby="exampleModalLabel"
		aria-hidden="true">
		
		<div class="modal-dialog" role="document">
			<div class="modal-content">
			
				<!-- Add image inside the body of modal -->
				<div class="modal-body">
					<img id="image" src="pune.jpg" height="170px" width="297px"
						alt="Click on button" />
				</div>

				<div class="modal-footer">
					<button type="button"
						class="btn btn-secondary"
						data-dismiss="modal">
						Close
				</button>
				</div>
			</div>
		</div>
	</div>
	<br>
	<br>
	
	<button type="button"
		class="btn btn-primary"
		data-toggle="modal"
		data-target="#exampleModal2">
		Satara
	</button>

	<!-- Modal -->
	<div class="modal fade"
		id="exampleModal2"
		tabindex="-1"
		role="dialog"
		aria-labelledby="exampleModalLabel"
		aria-hidden="true">
		
		<div class="modal-dialog" role="document">
			<div class="modal-content">
			
				<!-- Add image inside the body of modal -->
				<div class="modal-body">
					<img id="image" src="satara.jpg" height="170px" width="297px"
						alt="Click on button" />
				</div>

				<div class="modal-footer">
					<button type="button"
						class="btn btn-secondary"
						data-dismiss="modal">
						Close
				</button>
				</div>
			</div>
		</div>
	</div>
	<br>
	<br>
	
	<button type="button"
		class="btn btn-primary"
		data-toggle="modal"
		data-target="#exampleModal3">
		Kolhapur
	</button>

	<!-- Modal -->
	<div class="modal fade"
		id="exampleModal3"
		tabindex="-1"
		role="dialog"
		aria-labelledby="exampleModalLabel"
		aria-hidden="true">
		
		<div class="modal-dialog" role="document">
			<div class="modal-content">
			
				<!-- Add image inside the body of modal -->
				<div class="modal-body">
					<img id="image" src="kolhapur.jpg" height="170px" width="297px"
						alt="Click on button" />
				</div>

				<div class="modal-footer">
					<button type="button"
						class="btn btn-secondary"
						data-dismiss="modal">
						Close
				</button>
				</div>
			</div>
		</div>
	</div>
	<br>
	<br>
	
	<button type="button"
		class="btn btn-primary"
		data-toggle="modal"
		data-target="#exampleModal4">
		Ratnagiri
	</button>

	<!-- Modal -->
	<div class="modal fade"
		id="exampleModal4"
		tabindex="-1"
		role="dialog"
		aria-labelledby="exampleModalLabel"
		aria-hidden="true">
		
		<div class="modal-dialog" role="document">
			<div class="modal-content">
			
				<!-- Add image inside the body of modal -->
				<div class="modal-body">
					<img id="image" src="ratnagiri.jpg" height="170px" width="297px"
						alt="Click on button" />
				</div>

				<div class="modal-footer">
					<button type="button"
						class="btn btn-secondary"
						data-dismiss="modal">
						Close
				</button>
				</div>
			</div>
		</div>
	</div>
	<br>
	<br>
	
	
	<!-- Adding scripts to use bootstrap -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
			integrity=
"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
			crossorigin="anonymous">
	</script>
	<script src=
"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
			integrity=
"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
			crossorigin="anonymous">
	</script>
	<script src=
"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
			integrity=
"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
			crossorigin="anonymous">
	</script>
</body>

</html>
