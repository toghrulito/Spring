$(window).scroll(function(){
	$('header').toggleClass('scrolled', $(this).scrollTop() > 0 /*set height to start transition here*/ );
});