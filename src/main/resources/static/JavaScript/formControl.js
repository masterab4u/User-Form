//$(document).ready(function(){
	
	$('#submitButton').click(function(e) {
		e.preventDefault()
	console.log("xus");
	
				output = $('input[name=option]:checked', '#form').val();
	
				var formData = {
					Id : $("#Id").val(),
					name : $("#name").val(),
					//sex : $(sex).val(),
					
					
					//sex : $('.btn-group input[type="radio"]').click(function(){ var value = $("#sex").val();}),
					//sex : $('input[name=sex]:checked', '#form').val(),
					sex : output,
					//sex : $("#form input:radio[name=sex-radio]:checked").val(),
					email : $("#email").val(),
					phone : $("#phone").val(),
					address : $("#address").val(),
					department : $("#department").val()
				}//$("#form input[name=inlineRadioOptions]:checked").val(),
				console.log("formData ", formData);
				var data = JSON.stringify(formData);
				
        $.ajax({
           type: "POST",
           url: "/users/save",
           data: data,
           contentType: "application/json; charset=utf-8",
           success: function(data)
           {
               alert(data); 
           }
         });


   })    
//})
