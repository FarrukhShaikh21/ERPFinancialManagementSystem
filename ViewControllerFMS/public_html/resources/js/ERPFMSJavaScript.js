/**
 * Javascript functions to show top nitification
 * Success/Info messages
 * Developed By: FARRUKH SHAIKH
 * url: http://androidhive.info
 * © androidhive.info
 *
 * Created On: 21/4/2020
 *
 *
 * version 1.0
 *
 * Usage: call this function with params
 showNotification(message);
 **/
function showNotificationCallback(message) {
    showNotification(message);
}

function showNotificationJavaScript(message) {
    return function (componentEvent) {
        showNotification(message);
    };
}

function showNotification(message) {
    var duration = 2;//2 sec
    var time = new Date().getTime();

    // Parent Div container
    var container = '<div id="info_message_' + time + '" class="info_message"><div class="center_auto"><div class="message_area">';
    container += message;
    container += '</div></div></div></div></div>';

    $notification = $(container);

    $('div.info_message').remove();

    // Appeding notification to Body
    $('body').append($notification);

    var divHeight = $('div#info_message_' + time).height();
    // see CSS top to minus of div height
    $('div#info_message_' + time).css( {
        top : '-' + divHeight + 'px'
    });

    // showing notification message, default it will be hidden
    $('div#info_message_' + time).show();

    // sliding down the notification
    setTimeout(function () {
        $('div#info_message_' + time).animate( {
            top : 0
        });
        setTimeout(function () {
            closeNotification(duration, time);
        },
        duration);
    },
    parseInt(0));
}

// function to close notification message
function closeNotification(duration, time) {
    var divHeight = $('div#info_message_' + time).height();
    setTimeout(function () {
        $('div#info_message_' + time).animate( {
            top : '-' + divHeight
        });
        // removing the notification from body
        setTimeout(function () {
            $('div#info_message_' + time).remove();
        },
        1000);
    },
    parseInt(duration * 1000));
}