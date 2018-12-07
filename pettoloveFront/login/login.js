$(document).ready(function () {

    //loginUser();

});

function loginUser() {
    $.ajax({
        url: 'http://localhost:8080/pettolove/user/list',
        type: 'GET',
        async: true,
        success: function (response) {
            var username = $('.username').val();
            var password = $('.password').val();
            response.forEach(function(user) {
                console.log("come here")
                if(user.username === username){
                    if(user.password === password){
                        window.location.assign("../homepage/index.html");
                    }
                }
                
            });
        },
        error: errorCallback
    })
}

function errorCallback(){
    alert("Error.");
}
