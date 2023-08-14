function addClient(){
	let url = 'hotel/add-client';
	let result = document.getElementById('result');
	let data ={
		cin : document.getElementById('cin').value,
		firstName : document.getElementById('firstName').value,
		lastName : document.getElementById('lastName').value,
		number : document.getElementById('number').value,
		sexe : document.getElementById('sexe').value,	
		brithDate : document.getElementById('brithDate').value
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