jQuery(document).ready(function(){
	/* alert(context); */
});

function openModal(selector) {
	var trigger = jQuery(selector);
	var yes = jQuery(trigger.attr('rel')).find('.yes').eq(0);
	
	if(trigger.hasClass('modalInputHref')) {
		yes.attr('href', jQuery(trigger).attr('rev'));
	}
	if(trigger.hasClass('modalInputClick')) {
		yes.unbind('click')
			.click(new Function(trigger.attr('rev')))
			.click(function(){trigger.data('overlay').close(); return false;});
	}	
	if (jQuery(selector).data('triggered')) {
		jQuery(selector).overlay().load();
	} else {
		jQuery(selector).data('triggered', true);
		jQuery(selector).overlay({
			mask: {
			color: '#aaa',
			loadSpeed: 'fast',
			opacity: 0.5
		},
		speed: 'fast',
		closeOnClick: true,
	    load: true
		/* cos zamiast rel triggera 
		,target: '#yesno' */			
		});
	}
}
