RestService
===========
Spring Jersey REST-ful Web Services<br>
DB: MongoDB<br>
BuildTool: Maven<br>
Configuration: resources/persistence.properties<br>
WebApp: target/rest-service-0.0.1.war

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
