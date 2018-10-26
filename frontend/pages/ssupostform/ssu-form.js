// ssu-form page javascript goes here
$(document).ready(function() {
	$("#title").keyup(function() {
		$("#noInputError").html("")
		if ($(this).val().length >= 15) {
			$("#titleError").html("Error: Over Limit")
		}
		else {
			$("#titleError").html("")
		}
	})
	$("#description").keyup(function() {
		$("#noInputError").html("")
		if ($(this).val().length >= 500) {
			$("#descriptionError").html("Error: Over Limit")
		}
		else {
			$("#descriptionError").html("")
		}
	})
	$("#post").click(function() {
		if ($("#title").val().length >= 15 || $("#description").val().length >= 500) {
			$("#noInputError").html("Error: Limit exceeded")
		}
		else if ($("#title").val().length == 0 || $("#description").val().length == 0) {
			$("#noInputError").html("Error: No Input")
		}
		else {
			$("form").submit()
			//TODO: use api to send info to other locations
		}
	})
	var date = new Date()
})