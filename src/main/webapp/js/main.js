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

/**
 * wywolana na onclick zmienia przycisk w obrazek "loading" 
 * az do momentu, kiedy zawartosc zostanie zaladowana do miejsca 
 * wskazywanego przez selector
 * 
 * @param url
 * @param selector
 */
function loadAndProgress(bt, url, selector) { 
	var _this = bt;
	jQuery.ajax({
		url: url,
		beforeSend: function() {
			jQuery(_this).html('<img scr=\''+context+'/image'+'/>\' />');
		},
		success: function(data) {
			jQuery(selector).html(data);
		}
	});
}