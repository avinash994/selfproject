$(function(){

	switch(menu){
	
		case 'About Us':
			$('#about').addClass('active').show();
			console.log("about");
			break;
			
		case 'Contact Us':
			$('#contact').addClass('active').show();
			console.log("contact");
			break;
			
		case 'All Products':
			$('#viewItems').addClass('active').show();
			console.log("prod");
			break;
			
		default:
			$('#viewItems').addClass('active').show();
			$('#a_'+menu).addClass('active').show();
			break;
	
	}
	
	
});

