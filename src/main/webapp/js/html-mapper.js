function toHTML(users){
	let s = `<h2>Nombre client : ${users.length}</h2>
	<table class="data-table">
		<tr>
            <th>CIN</th>
            <th>FirstName</th>
            <th>LatsName</th>
            <th>Number</th>
            <th>Sexe</th>
            <th>Date de Naissance</th>
        </tr>
	`;
	for(let i = 0; i<users.length; i++){
		s +=`
			<tr>
                        <td>${users[i].cin}</td>
                        <td>${users[i].firstName}</td>
                        <td>${users[i].lastName}</td>
                        <td>${users[i].number}</td>
                        <td>${users[i].sexe}</td>
                        <td>${users[i].birthday}</td>
                </tr>`
	}
	s +='</table>';
	return s;
	
	//Création d'une table HTML avec tous les auteurs;
}