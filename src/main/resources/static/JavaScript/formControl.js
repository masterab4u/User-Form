//$(document).ready(function(){
	
	$('#submitButton').click(function(e) {
		e.preventDefault()
	//console.log("xus");
	
				var formData = {
					Id : $("#Id").val(),
					name : $("#name").val(),
					sex : $('input[name=sex]:checked', '#form').val(),
					email : $("#email").val(),
					phone : $("#phone").val(),
					address : $("#address").val(),
					department : $("#department").val()
				}
				console.log("formData ", formData);
				var data = JSON.stringify(formData);
				
        $.ajax({
           type: "POST",
           url: "/users/save",
           data: data,
           dataType: 'json',
           contentType: "application/json; charset=utf-8",
           success: function(data)
           {
               console.log("data", data); 
               var s = '';
               for(var i=0; i<data.length; i++){
	            s+= '<tr>';
				s+= '<td/>' + data[i].Id;
				s+= '<td/>' + data[i].name;
				s+= '<td/>' + data[i].sex;
				s+= '<td/>' + data[i].email;
				s+= '<td/>' + data[i].phone;
				s+= '<td/>' + data[i].address;
				s+= '<td/>' + data[i].department;
				s+= '</tr>';
				}
				alert(s);
				console.log(s);
				$('#user-table').html(s);
               
           }
         });


   })    
	
	
