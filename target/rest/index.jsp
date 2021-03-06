<html>
<body>
<h2>Rest Service</h2>
<p>
    Использован Jersey RESTful Web Services framework в связке со Spring-ом<br>
    База: MongoDB<br>
    Сборка: Maven-ом
</p>
<p>
    Create(Method: POST):<br>
    http://localhost:8080/rest/contacts/createOrUpdate<br>
    example body: {"address":"testAddress","name":"testName","internationalPhone":"111-111","localPhone":"222-222"}
</p>
<p>
    Update(Method: POST):<br>
    http://localhost:8080/rest/contacts/createOrUpdate<br>
    example body: {"address":"testAddress","name":"testName","id":"54502827ea7032f7fffff8e4","internationalPhone":"111-111","localPhone":"222-222"}
</p>
<p>
    getAllContacts(Method: GET):<br>
    http://localhost:8080/rest/contacts/getAll
</p>
<p>
    getContactByName(Method: GET):<br>
    http://localhost:8080/rest/contacts/getByName/{name}
</p>
<p>
    deleteContact(Method: DELETE):<br>
    http://localhost:8080/rest/contacts/delete/{id}
</p>
</body>
</html>
