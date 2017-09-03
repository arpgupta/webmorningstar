/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
"use strict"; // Start of use strict

// 7. google map
function gMap () {
	if ($('.google-map').length) {
        $('.google-map').each(function () {
        	// getting options from html 
        	var mapName = $(this).attr('id');
        	var mapLat = $(this).data('map-lat');
        	var mapLng = $(this).data('map-lng');
        	var iconPath = $(this).data('icon-path');
        	var mapZoom = $(this).data('map-zoom');
        	var mapTitle = $(this).data('map-title');

        	
        	// if zoom not defined the zoom value will be 15;
        	if (!mapZoom) {
        		var mapZoom = 15;
        	};
        	// init map
        	var map;
            map = new GMaps({
                div: '#'+mapName,
                scrollwheel: false,
                lat: mapLat,
                lng: mapLng,
                zoom: mapZoom
            });
            // if icon path setted then show marker
            if(iconPath) {
        		map.addMarker({
	            	icon: iconPath,
	                lat: mapLat,
	                lng: mapLng,
	                title: mapTitle
	            });
        		map.addMarker({
	            	icon: iconPath,
	                lat: 41.375066,         //you can
	                lng: -74.177262,
	                title: "South Bloming Grove"
	            });
        	}
        });  
	};
}



// instance of fuction while Document ready event	
jQuery(document).on('ready', function () {
	(function ($) {
		gMap();
	})(jQuery);
});
