$(document).ready(function () {
	$("#mySidebar a").click(function (e) {
		e.preventDefault();
		var page = $(this).attr("href");
		if (page == "profile") {
			$.ajax({
				url: profile,
				type: "post",
				data: { name },
				cache: false,
				success: function (profile) {
					$("#content").html(profile);
				}
			});
		}$("#content").load(page);
		if(page != "logout"){
			return false;
		}
			
		});
});