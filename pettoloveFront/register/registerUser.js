
function addUser(){
    var email = $('.email').val();
    var username = $('.username').val();
    var name = $('.name').val();
    var password = $('.password').val();
    console.log('Lets start');
    $.ajax({
        url: 'http://localhost:8080/pettolove/user/',
        type: 'POST',
        data: JSON.stringify({
            email: email,
            name: name,
            username: username,
            password: password

        }),

        async: true,
        contentType: 'application/json',
        success:userAdded,
        error: errorCallback
    });
    
}

function userAdded(){
    console.log('jhbjhsbn');
    window.location.assign("../homepage/index.html");
}
function errorCallback(){
console.log('jkjhsn');
    alert("Error.");
}