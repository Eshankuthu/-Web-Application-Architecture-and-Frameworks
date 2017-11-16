// pathname is contextRoot/path/path/ so we want to get [1] 
// that is where contextRoot is
// [0] has "" as a result of split 
var contextRoot = "/" + window.location.pathname.split('/')[1];

// Translate form to array
// Then put in JSON format
function serializeObject(form) {
	var jsonObject = {};
	var array = form.serializeArray();
//	console.log(array);
	$.each(array, function() {
		jsonObject[this.name] = this.value;
	});
	return jsonObject;

};

function categorySubmit() {
	var dataToSend = JSON.stringify(serializeObject($('#categoryForm')));
//	console.log(dataToSend);
	$.ajax({
		type : 'POST',
		url : contextRoot + '/addCategory',
		dataType : "json", // Accept header
		data : dataToSend,
		contentType : 'application/json', // Sends - Content-type
		success : function(response) {
			$('#errors').html("");
			$("#result").append('<H3 align="center"> OKAY!! <H3>');
			$('#result').show();
			//Code here..
		},
		error : function(errorObject) {
			// error: function(jqXHR, textStatus, HTTPStatus ){
			// jqXHR = jQuery XMLHttpRequest superset of XMLHttpRequest
			// EXAMPLE values: error: function(jQuery XMLHttpRequest, "error",
			// "Bad Request" ){
			// see http://api.jquery.com/jquery.ajax/

			if (errorObject.responseJSON.errorType == "ValidationError") {
				$('#success').html("");
				$('#errors').html("");
				$("#errors").append('<H3 align="center"> Error(s)!! <H3>');
				$("#result").append('<p>');

				var errorList = errorObject.responseJSON.errors;
				$.each(errorList, function(i, error) {
					$("#errors").append(error.message + '<br>');
				});
				$("#errors").append('</p>');
				$('#result').show();
			} else {
				alert(errorObject.responseJSON.errors(0)); // "non" Validation
				// Error
			}
		}
	});
}

