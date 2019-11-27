$(document).ready(function() {
	$("#mySidebar a").click(function(e) {
		var page = $(this).attr("href");
		$("#content").load(page );
		if (page != "logout") {
			return false;
		}
	});
});