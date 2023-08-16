function addClient(){
	let url = 'hotel/add-client';
	let result = document.getElementById('result');
	let data ={
		cin : document.getElementById('cin').value,
		firstName : document.getElementById('firstName').value,
		lastName : document.getElementById('lastName').value,
		number : document.getElementById('number').value,
		sexe : document.getElementById('sexe').value,	
		brithDate : document.getElementById('birthDate').value
	}
	let options ={
		method : 'POST',
		body : JSON.stringify(data),
		headers : {
			'Content-Type' : 'application/json'
		}
	}
	
	fetch(url, options)
	.then(response => response.json())
	.then(data => result.innerHTML = data.status + ' : ' + data.model.name + ' Bien enregistré !! ' )
	.catch(err => console.log('Erreur : ' + err))
}

function addRoom(){
	let url = 'hotel/add-room';
	let result = document.getElementById('result');
	let data ={
		id : document.getElementById('id').value,
		stat : document.getElementById('stat').value,
		beds : document.getElementById('beds').value,
		price : document.getElementById('price').value
	}
	let options ={
		method : 'POST',
		body : JSON.stringify(data),
		headers : {
			'Content-Type' : 'application/json'
		}
	}
	
	fetch(url, options)
	.then(response => response.json())
	.then(data => result.innerHTML = data.status + ' : ' + data.model.name + ' Bien enregistré !! ' )
	.catch(err => console.log('Erreur : ' + err))
}

function addReservation(){
	let url = 'hotel/add-reservation';
	let result = document.getElementById('result');
	let data ={
		id : document.getElementById('id').value,
		cin : document.getElementById('cin').value,
		departude : document.getElementById('departude').value,
		arrival : document.getElementById('arrival').value,
		totalPrice : document.getElementById('totalPrice').value
	}
	let options ={
		method : 'POST',
		body : JSON.stringify(data),
		headers : {
			'Content-Type' : 'application/json'
		}
	}
	
	fetch(url, options)
	.then(response => response.json())
	.then(data => result.innerHTML = data.status + ' : ' + data.model.name + ' Bien enregistré !! ' )
	.catch(err => console.log('Erreur : ' + err))
}

/*
function getClients() {
	let keyword = document.getElementById('keyword').value;
	let url = 'hotel/get-clients-by-keyword?keyword=' + keyword;
	let result = document.getElementById('result');
	
	fetch(url)
	.then(response => response.json())
	.then(data => result.innerHTML = toHTML(data) )
	.catch(err => console.log('Erreur : ' + err))
}

//Moteur AJAX basé sur l'object XMLHttpRequest
function getClients() {
	let keyword = document.getElementById('keyword').value;
	let url = 'hotel/get-clients-by-keyword?keyword=' + keyword;
	let result = document.getElementById('result');
	
	let xhr = new XMLHttpRequest();
	xhr.open('GET', url, true);//Mode asynchrone
	xhr.onreadystatechange = () => {//Fonction CallBack
		if(xhr.readyState == XMLHttpRequest.DONE){
			if(xhr.status == 200){
				let clients =JSON.parse(xhr.responseText);
				result.innerHTML = toHTML(clients);
			}
			else{
				console.log('Erreur !!')
				result.innerHTML = 'Erreur !!';
			}
		}
	}
	xhr.send();
}
*/