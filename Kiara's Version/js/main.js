(function ($) {
    "use strict";

    //Map --> doesn't work rn... currently replaced w image in index.html
    function initMap() {
        // Set the initial coordinates & create a map
        var myLatLng = {lat: 41.50421905517578, lng: -81.60836029052734};
        var map = new google.maps.Map(document.getElementById('map'), {
        center: myLatLng,
        zoom: 14
        });
    
        // Add a marker to the map
        var marker = new google.maps.Marker({
        position: myLatLng,
        map: map,
        title: 'My location'
        });
    }



    // Fixed Navbar
    $(window).scroll(function () {
        if ($(this).scrollTop() > 300) {
            $('.sticky-top').addClass('shadow-sm').css('top', '0px');
        } else {
            $('.sticky-top').removeClass('shadow-sm').css('top', '-200px');
        }
    });
    
    
   // Back to top button
   $(window).scroll(function () {
    if ($(this).scrollTop() > 300) {
        $('.back-to-top').fadeIn('slow');
    } else {
        $('.back-to-top').fadeOut('slow');
    }
    });
    $('.back-to-top').click(function () {
        $('html, body').animate({scrollTop: 0}, 1500, 'easeInOutExpo');
        return false;
    });


    // studySpots-carousel
    $(".studySpots-carousel").owlCarousel({
        autoplay: true,
        smartSpeed: 2000,
        center: false,
        dots: true,
        loop: true,
        margin: 25,
        nav : true,
        navText : [
            '<i class="bi bi-arrow-left"></i>',
            '<i class="bi bi-arrow-right"></i>'
        ],
        responsiveClass: true,
        responsive: {
            0:{
                items:1
            },
            576:{
                items:1
            },
            768:{
                items:2
            },
            992:{
                items:3
            },
            1200:{
                items:4
            }
        }
    });

    function selectStudyList(){
        
    }

})(jQuery);

