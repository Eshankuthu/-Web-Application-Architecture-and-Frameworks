This demo is for lesson: Lesson Spring REST & AJAX

It uses Java Config instead of XML file.
This project provides only REST APIs services, so don't have any pages to display.
In order to test, you can use postman.
1. Add: http://localhost:8080/BookRestValidation_JavaConfig/api/addCategory
{
    "name": "",
    "description": "abc"
}

2. Get JSON: http://localhost:8080/BookRestValidation_JavaConfig/api/Computing.json

3. Get XML: http://localhost:8080/BookRestValidation_JavaConfig/api/Computing.xml

1. For JSON support, must add dependencies. otherwise, you'll get 415 Unsupported MediaType for POST request
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-core</artifactId>
			<version>2.8.10</version>
		</dependency>

		<dependency>
			<groupId>com.fasterxml.jackson.jaxrs</groupId>
			<artifactId>jackson-jaxrs-base</artifactId>
			<version>2.8.10</version>
		</dependency>
		
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.8.10</version>
		</dependency>
2. might see this exception: java.lang.NoSuchMethodError: com.fasterxml.jackson.databind.JavaType.isReferenceType()Z. It's because Jackson

3. To enable Cross-Origin-Resource-Sharing (CORS), use @CrossOrigin(origins = { "http://localhost:9080", "http://localhost:9000" }, maxAge = 6000)
