function getAllClients(){
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
                table.innerHTML += fillTableC(users);
                
            }
        }
    }
    xhr.send();
}

function fillTableC(users){
	let result="";
    result =`<tr>
            <th>CIN</th>
            <th>FirstName</th>
            <th>LatsName</th>
            <th>Number</th>
            <th>Sexe</th>
            <th>Date de Naissance</th>
        </tr>`;

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

function getAllRooms(){
    let table = document.getElementById("table");
    let url = "hotel/rooms";
    let xhr = new XMLHttpRequest();

    xhr.open('GET', url, true);

    xhr.onreadystatechange = ()=>{
        if(xhr.readyState == XMLHttpRequest.DONE){
            if(xhr.status == 200){
                console.log(xhr.responseText)
                let users = JSON.parse(xhr.responseText);
               
                table.innerHTML += fillTableR(users);
                
            }
        }
    }
    xhr.send();
}

function fillTableR(users){
	let result="";
    result +=`<tr>
            <th>ID</th>
            <th>beds</th>
            <th>stat</th>
            <th>price</th>
              </tr>`  ;

    for(let i = 0; i < users.length; i++){
        result +=`<tr>
                        <td>${users[i].id}</td>
                        <td>${users[i].beds}</td>
                        <td>${users[i].stat}</td>
                        <td>${users[i].price}</td>
                  </tr>`
    }
    return result;
}




function getAllReservations(){
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
                table.innerHTML += fillTableRS(users);
                
            }
        }
    }
    xhr.send();
}

function fillTableRS(users){
	let result="";
    result =`<tr>
            <th>CIN</th>
            <th>FirstName</th>
            <th>LatsName</th>
            <th>Number</th>
            <th>Sexe</th>
            <th>Date de Naissance</th>
        </tr>`;

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

