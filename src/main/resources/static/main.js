/**
 * 
 */

$('document').ready(function() {

	
	$("#submit").click(function(event) {
		console.log('Hello')
        if( !confirm('Are you sure that you want to submit the form') ){
			
            event.preventDefault();
        } 

    });
	
	
	
});