$('#submitForm').submit(function(e) {
        // reference to form object
	var form = user;
        // for stopping the default action of element
        e.preventDefault();
        // mapthat will hold form data
        var formData = {

					Id : $("#Id").val(),
					name : $("#name").val(),
					sex : $("#sex").val(),
					email : $("email").val(),
					phone : $("#phone").val(),
					address : $("#address").val(),
					department : $("#department").val()
				}
	//iterate over form elements   
        $.each(user, function(v){
	    var input = $(v);
	    // populate form data as key-value pairs
            // with the name of input as key and its value as value
            formData[input.attr("name")] = input.val();
	    //formData[input.attr("Id")] = input.val();
	    //formData[input.attr("name")] = input.val();
	    //formData[input.attr("sex")] = input.val();
	    //formData[input.attr("email")] = input.val();
	    //formData[input.attr("phone")] = input.val();
	    //formData[input.attr("address")] = input.val();
	    //formData[input.attr("department")] = input.val();
        });
        $.ajax({
            type: form.attr('POST'), // method attribute of form
            url: form.attr('/getAll'),  // action attribute of form
            dataType : 'json',
	    // convert form data to json format
            data : JSON.stringify(formData),
        });
   });