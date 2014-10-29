RestService
===========
Использован Jersey RESTful Web Services framework в связке со Spring-ом<br>
База: MongoDB<br>
Сборка: Maven-ом<br>
Настроить resources\persistence.properties

    Create(Method: POST):
    http://localhost:8080/rest/contacts/createOrUpdate
    example body: {"address":"testAddress","name":"testName","internationalPhone":"111-111","localPhone":"222-222"}

    Update(Method: POST):
    http://localhost:8080/rest/contacts/createOrUpdate
    example body: {"address":"testAddress","name":"testName","id":"54502827ea7032f7fffff8e4","internationalPhone":"111-111","localPhone":"222-222"}

    getAllContacts(Method: GET):
    http://localhost:8080/rest/contacts/getAll

    getContactByName(Method: GET):
    http://localhost:8080/rest/contacts/getByName/{name}

    deleteContact(Method: DELETE):
    http://localhost:8080/rest/contacts/delete/{id}
