
function login() {
    let userName = document.getElementById("userName");
    let pwd = document.getElementById("pwd");

    let xhr = new XMLHttpRequest();
    let params = "email=" + userName.value + "&pwd=" + pwd.value;
    let url = "hotel/login?" + params
    xhr.open("GET", url, true);
    xhr.onreadystatechange = () => {
        if(xhr.readyState == 4 && xhr.status == 200) {
            let user = JSON.parse(xhr.responseText);
            if(user == null) {
                alert("Informations de connexion incorrecte")
            }
            else {
                goToMyAccount(user);
            }
        }
    }
    xhr.send();
}

function goToMyAccount(user) {
    let loginCtr = document.getElementById("login-ctr");
    loginCtr.style.display = "none";

    let account = document.getElementById("account");
    account.style.display = "flex";

    let userGreetings = document.getElementById("user-greetings");
    userGreetings.innerHTML = "Bienvenue  !"
}