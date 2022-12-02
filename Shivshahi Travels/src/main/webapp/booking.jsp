<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd"> 

<html>
<head>
<title>Shivshahi travels</title>
<script type="text/javascript">


function price(){
	var name = document.getElementById("guestname").value;
	var adults = document.getElementById("adults").value;
	var children = document.getElementById("children").value;
	var from = document.getElementById("from").value;
	var to = document.getElementById("to").value;
	var bustype = document.getElementById("bustype").value;
	var single = document.getElementById("single").value;
	
	///for PUNE
	if(to==="Pune" && bustype==="Standard" && single==="Single" && adults==="0" && children==="1")    {
	    var Total="500";
	}
	if(to==="Pune" && bustype==="Standard" && single==="Single" && adults==="1" && children==="0")    {
	    var Total="550";    
	}
	if(to==="Pune" && bustype==="Standard" && single==="Single" && adults==="1" && children==="1")    {
	    var Total="1050";
	}
	////////luxury
	if(to==="Pune" && bustype==="luxury" && single==="Single" && adults==="0" && children==="1")    {
	    var Total="510";
	}
	if(to==="Pune" && bustype==="luxury" && single==="Single" && adults==="1" && children==="0")    {
	    var Total="560";    
	}
	if(to==="Pune" && bustype==="luxury" && single==="Single" && adults==="1" && children==="1")    {
	    var Total="1070";
	}
	///////Semi-luxury
	if(to==="Pune" && bustype==="Semi-luxury" && single==="Single" && adults==="0" && children==="1")    {
	    var Total="505";
	}
	if(to==="Pune" && bustype==="Semi-luxury" && single==="Single" && adults==="1" && children==="0")    {
	    var Total="555";    
	}
	if(to==="Pune" && bustype==="Semi-luxury" && single==="Single" && adults==="1" && children==="1")    {
	    var Total="1060";
	}
	
	
	///return
	
	
	if(to==="Pune" && bustype==="Standard" && single==="Return" && adults==="0" && children==="1")    {
	    var Total="1000";
	}
	if(to==="Pune" && bustype==="Standard" && single==="Return" && adults==="1" && children==="0")    {
	    var Total="1100";    
	}
	if(to==="Pune" && bustype==="Standard" && single==="Return" && adults==="1" && children==="1")    {
	    var Total="2100";
	}
	////////luxury
	if(to==="Pune" && bustype==="luxury" && single==="Return" && adults==="0" && children==="1")    {
	    var Total="1020";
	}
	if(to==="Pune" && bustype==="luxury" && single==="Return" && adults==="1" && children==="0")    {
	    var Total="1120";    
	}
	if(to==="Pune" && bustype==="luxury" && single==="Return" && adults==="1" && children==="1")    {
	    var Total="2140";
	}
	///////Semi-luxury
	if(to==="Pune" && bustype==="Semi-luxury" && single==="Return" && adults==="0" && children==="1")    {
	    var Total="1010";
	}
	if(to==="Pune" && bustype==="Semi-luxury" && single==="Return" && adults==="1" && children==="0")    {
	    var Total="1110";    
	}
	if(to==="Pune" && bustype==="Semi-luxury" && single==="Return" && adults==="1" && children==="1")    {
	    var Total="2120";
	}
	
	
	
	///for SATARA
	if(to==="Satara" && bustype==="Standard" && single==="Single" && adults==="0" && children==="1")    {
	    var Total="600";
	}
	if(to==="Satara" && bustype==="Standard" && single==="Single" && adults==="1" && children==="0")    {
	    var Total="650";    
	}
	if(to==="Satara" && bustype==="Standard" && single==="Single" && adults==="1" && children==="1")    {
	    var Total="1150";
	}
	////////luxury
	if(to==="Satara" && bustype==="luxury" && single==="Single" && adults==="0" && children==="1")    {
	    var Total="610";
	}
	if(to==="Satara" && bustype==="luxury" && single==="Single" && adults==="1" && children==="0")    {
	    var Total="660";    
	}
	if(to==="Satara" && bustype==="luxury" && single==="Single" && adults==="1" && children==="1")    {
	    var Total="1170";
	}
	///////Semi-luxury
	if(to==="Satara" && bustype==="Semi-luxury" && single==="Single" && adults==="0" && children==="1")    {
	    var Total="605";
	}
	if(to==="Satara" && bustype==="Semi-luxury" && single==="Single" && adults==="1" && children==="0")    {
	    var Total="655";    
	}
	if(to==="Satara" && bustype==="Semi-luxury" && single==="Single" && adults==="1" && children==="1")    {
	    var Total="1160";
	}
	
	
	////return
	
	if(to==="Satara" && bustype==="Standard" && single==="Return" && adults==="0" && children==="1")    {
	    var Total="1200";
	}
	if(to==="Satara" && bustype==="Standard" && single==="Return" && adults==="1" && children==="0")    {
	    var Total="1300";    
	}
	if(to==="Satara" && bustype==="Standard" && single==="Return" && adults==="1" && children==="1")    {
	    var Total="2300";
	}
	////////luxury
	if(to==="Satara" && bustype==="luxury" && single==="Return" && adults==="0" && children==="1")    {
	    var Total="1220";
	}
	if(to==="Satara" && bustype==="luxury" && single==="Return" && adults==="1" && children==="0")    {
	    var Total="1320";    
	}
	if(to==="Satara" && bustype==="luxury" && single==="Return" && adults==="1" && children==="1")    {
	    var Total="2340";
	}
	///////Semi-luxury
	if(to==="Satara" && bustype==="Semi-luxury" && single==="Return" && adults==="0" && children==="1")    {
	    var Total="1210";
	}
	if(to==="Satara" && bustype==="Semi-luxury" && single==="Return" && adults==="1" && children==="0")    {
	    var Total="1310";    
	}
	if(to==="Satara" && bustype==="Semi-luxury" && single==="Return" && adults==="1" && children==="1")    {
	    var Total="2320";
	}
	
	
	
	///for Kolhapur
	if(to==="Kolhapur" && bustype==="Standard" && single==="Single" && adults==="0" && children==="1")    {
	    var Total="700";
	}
	if(to==="Kolhapur" && bustype==="Standard" && single==="Single" && adults==="1" && children==="0")    {
	    var Total="750";    
	}
	if(to==="Kolhapur" && bustype==="Standard" && single==="Single" && adults==="1" && children==="1")    {
	    var Total="1250";
	}
	////////luxury
	if(to==="Kolhapur" && bustype==="luxury" && single==="Single" && adults==="0" && children==="1")    {
	    var Total="710";
	}
	if(to==="Kolhapur" && bustype==="luxury" && single==="Single" && adults==="1" && children==="0")    {
	    var Total="760";    
	}
	if(to==="Kolhapur" && bustype==="luxury" && single==="Single" && adults==="1" && children==="1")    {
	    var Total="1270";
	}
	///////Semi-luxury
	if(to==="Kolhapur" && bustype==="Semi-luxury" && single==="Single" && adults==="0" && children==="1")    {
	    var Total="1205";
	}
	if(to==="Kolhapur" && bustype==="Semi-luxury" && single==="Single" && adults==="1" && children==="0")    {
	    var Total="755";    
	}
	if(to==="Kolhapur" && bustype==="Semi-luxury" && single==="Single" && adults==="1" && children==="1")    {
	    var Total="1260";
	}
	
	
	
	////return
	
	
	if(to==="Kolhapur" && bustype==="Standard" && single==="Return" && adults==="0" && children==="1")    {
	    var Total="1400";
	}
	if(to==="Kolhapur" && bustype==="Standard" && single==="Return" && adults==="1" && children==="0")    {
	    var Total="1500";    
	}
	if(to==="Kolhapur" && bustype==="Standard" && single==="Return" && adults==="1" && children==="1")    {
	    var Total="2500";
	}
	////////luxury
	if(to==="Kolhapur" && bustype==="luxury" && single==="Return" && adults==="0" && children==="1")    {
	    var Total="1420";
	}
	if(to==="Kolhapur" && bustype==="luxury" && single==="Return" && adults==="1" && children==="0")    {
	    var Total="1520";    
	}
	if(to==="Kolhapur" && bustype==="luxury" && single==="Return" && adults==="1" && children==="1")    {
	    var Total="1540";
	}
	///////Semi-luxury
	if(to==="Kolhapur" && bustype==="Semi-luxury" && single==="Return" && adults==="0" && children==="1")    {
	    var Total="2410";
	}
	if(to==="Kolhapur" && bustype==="Semi-luxury" && single==="Return" && adults==="1" && children==="0")    {
	    var Total="1510";    
	}
	if(to==="Kolhapur" && bustype==="Semi-luxury" && single==="Return" && adults==="1" && children==="1")    {
	    var Total="2520";
	}
	
	
	
	
	///for Ratnagiri
	if(to==="Ratnagiri" && bustype==="Standard" && single==="Single" && adults==="0" && children==="1")    {
	    var Total="800";
	}
	if(to==="Ratnagiri" && bustype==="Standard" && single==="Single" && adults==="1" && children==="0")    {
	    var Total="850";    
	}
	if(to==="Ratnagiri" && bustype==="Standard" && single==="Single" && adults==="1" && children==="1")    {
	    var Total="1850";
	}
	////////luxury
	if(to==="Ratnagiri" && bustype==="luxury" && single==="Single" && adults==="0" && children==="1")    {
	    var Total="810";
	}
	if(to==="Ratnagiri" && bustype==="luxury" && single==="Single" && adults==="1" && children==="0")    {
	    var Total="860";    
	}
	if(to==="Ratnagiri" && bustype==="luxury" && single==="Single" && adults==="1" && children==="1")    {
	    var Total="1370";
	}
	///////Semi-luxury
	if(to==="Ratnagiri" && bustype==="Semi-luxury" && single==="Single" && adults==="0" && children==="1")    {
	    var Total="1305";
	}
	if(to==="Ratnagiri" && bustype==="Semi-luxury" && single==="Single" && adults==="1" && children==="0")    {
	    var Total="855";    
	}
	if(to==="Ratnagiri" && bustype==="Semi-luxury" && single==="Single" && adults==="1" && children==="1")    {
	    var Total="1360";
	}
	
	
	/////return
	
	
	if(to==="Ratnagiri" && bustype==="Standard" && single==="Return" && adults==="0" && children==="1")    {
	    var Total="1600";
	}
	if(to==="Ratnagiri" && bustype==="Standard" && single==="Return" && adults==="1" && children==="0")    {
	    var Total="1700";    
	}
	if(to==="Ratnagiri" && bustype==="Standard" && single==="Return" && adults==="1" && children==="1")    {
	    var Total="3700";
	}
	////////luxury
	if(to==="Ratnagiri" && bustype==="luxury" && single==="Return" && adults==="0" && children==="1")    {
	    var Total="1620";
	}
	if(to==="Ratnagiri" && bustype==="luxury" && single==="Return" && adults==="1" && children==="0")    {
	    var Total="1720";    
	}
	if(to==="Ratnagiri" && bustype==="luxury" && single==="Return" && adults==="1" && children==="1")    {
	    var Total="2740";
	}
	///////Semi-luxury
	if(to==="Ratnagiri" && bustype==="Semi-luxury" && single==="Return" && adults==="0" && children==="1")    {
	    var Total="2610";
	}
	if(to==="Ratnagiri" && bustype==="Semi-luxury" && single==="Return" && adults==="1" && children==="0")    {
	    var Total="1710";    
	}
	if(to==="Ratnagiri" && bustype==="Semi-luxury" && single==="Return" && adults==="1" && children==="1")    {
	    var Total="2720";
	}
	
	
	
	alert("hello,  "+name+" ,\nYour details are\n No.of adults : "+adults+", No.of children : "+children+"\n From : "+from+", To : "+to+"\n Bus type : "+bustype+", Having : "+single+" trip"+"\n So, Your total ticket price is : "+Total);
}
function confirmBox(){
confirm("Confirm booking ???");

}
function cancel(){
	guestname.setText="";
	guestemail.setText="";
	guestelephone.setText="";
	adults.setText="";
	children.setText="";
	checkin.setText="";
	cars.setSelected=(false);
	carss.setSelected=(false);
	single.setText="";
}

</script>
<style type="text/css">
body{
background-image:url("reservations.jpg");
}
h4 {
  background-color: #80ced6;
}

h1 {
  background-color: #d5f4e6;
}
.button{
                background: url(gatewayofindia.jpg);
                
            }
            


<meta charset="ISO-8859-1">
<title>Welcome form</title>
</style>
</head>
<body>
		


  <div class="smart-forms smart-container wrap-2">
   
    <div class="form-header header-primary">
     <marquee direction="left" ><h4 style="color:blue; text-shadow: 1px 1px 1px rgba(0,0,0,0.3);">Make Ticket Reservations in seconds</h4></marquee>  
    </div>
 <pre>    
    <form method="post" action="insert.jsp" id="booking-form">
    
  <label for="adults" class="field-label">Please Enter Your Name:</label> <input type="text" name="guestname" id="guestname" class="gui-input" required="" placeholder="firstname lastname">
  Email Address: 	  <input type="email" name="guestemail" id="guestemail" class="gui-input" required="" placeholder="name@something.com"> 
  Telephone / Mobile:     <input type="text" name="guestelephone" id="guestelephone" class="gui-input" required="" placeholder="Telephone / Moble Number">
  Adults:                 <input type="number" id="adults" name="adults" class="gui-input" required="" placeholder="Number of adults">
  Children:               <input type="number" id="children" name="children" class="gui-input" required="" placeholder="Number of children">
  Date of Journey:        <input type="date" id="checkin" name="checkin" class="gui-input" required="" placeholder="mm/dd/yyyy">
  From:                   <select name="from" id="from">
            <option value="Mumbai">Mumbai</option>
      
    </select>
  To:                     <select name="to" id="to">
            <option value="Pune">Pune</option>
      <option value="Satara">Satara</option>
      <option value="Kolhapur">Kolhapur</option>
      <option value="Ratnagiri">Ratnagiri</option></select>
  Bus Type:               <select name="bustype" id="bustype">
            <option value="Standard">Standard</option>
      <option value="Semi-luxury">Semi-luxury</option>
      <option value="luxury">luxury</option></select>
  Single/Return:          <input type="text" name="single" id="single" class="gui-input" required="" placeholder="Single/Return"><h3 style="color:yellow;">Please recheck your booking details once...</h3><button type="submit" name="button"class="button btn-primary" onclick="confirmBox()">Confirm Booking</button>      <button type="button" onclick="price()">Total price</button>            <button type="reset" name="button1" onclick="cancel" >Clear</button>
      </div>
       
    </form>
    
  
</pre>
</body>
</html>