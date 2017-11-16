This demo is for lesson: Rest&Ajax. It's based on Webstore_SpringMVC + exception, so this demo doesn't contains validation, resolvers, image upload, etc.
		
Notes:
1. Add object to json dependency. The below also contains XML dependency.
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-oxm</artifactId>
			<version>4.3.0.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>org.codehaus.jackson</groupId>
			<artifactId>jackson-mapper-asl</artifactId>
			<version>1.9.10</version>
		</dependency>
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.8.0</version>
		</dependency>

2. Shopping cart is based on user's session ID. so once the project is redeployed, shopping cart will be reset. It's in memory database. 
	The 2nd edition book contains more complicated version of CartRest demos.
3. The project didn't use any template, so headers are repeated in JSPs.
4. The check out functionality doesn't work in this demo.
5. The controllers.js is angular version which is used inside textbooks. We'll use jQuery instead of angular in this course.

Test data:
1. http://localhost:8080/webstore_rest/rest/cart POST to create a shopping cart
{
    "cartId": "1234",
    "cartItems": {
        "P1234": {
            "product": {
                "productId": "P1234",
                "name": "iPhone 5s",
                "unitPrice": 500,
                "description": "Apple iPhone 5s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera",
                "manufacturer": "Apple",
                "category": "Smart Phone",
                "unitsInStock": 1000,
                "unitsInOrder": 0,
                "discontinued": false,
                "condition": "NEW"
            },
            "quantity": 1,
            "totalPrice": 500
        }
    },
    "grandTotal": 500
}
