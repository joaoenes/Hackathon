function updateUser(){
    var id = $('.id').val();
    var email = $('.email').val();
    var username = $('.username').val();
    var name = $('.name').val();
    var password = $('.password').val();
    var phone = $('.phone').val();
    console.log('Lets start');
    $.ajax({
        url: 'http://localhost:8080/pettolove/user/' + id,
        type: 'PUT',
        data: JSON.stringify({
            id: id,
            email: email,
            name: name,
            username: username,
            password: password,
            phone: phone
        }),

        async: true,
        contentType: 'application/json',
        success:userEdited,
        error: errorCallback
    });
    
}

function userEdited(){
    window.location.assign("../homepage/index.html");
}
function errorCallback(){
    alert("Error.");
}