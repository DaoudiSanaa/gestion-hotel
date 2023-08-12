function getAllUsers(){
    let table = document.getElementById("table");
    let url = "hotel/clients";
    let xhr = new XMLHttpRequest();

    xhr.open('GET', url, true);

    xhr.onreadystatechange = ()=>{
        if(xhr.readyState == XMLHttpRequest.DONE){
            if(xhr.status == 200){
                console.log(xhr.responseText)
                let users = JSON.parse(xhr.responseText);
                console.log(users[0].cin);
                table.innerHTML += fillTable(users);
                
            }
        }
    }
    xhr.send();
}

function fillTable(users){
    let result ="";

    for(let i = 0; i < users.length; i++){
        result +=`<tr>
                        <td>${users[i].cin}</td>
                        <td>${users[i].firstName}</td>
                        <td>${users[i].lastName}</td>
                        <td>${users[i].number}</td>
                        <td>${users[i].sexe}</td>
                        <td>${users[i].birthday}</td>
                </tr>`
    }
    return result;
}