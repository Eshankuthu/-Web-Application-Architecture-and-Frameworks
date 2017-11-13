This demo is for lesson: Resolvers & Upload & Exceptions & Internationalization & Tiles

It demos:
1. ContentNegotiatingViewResolver  
2. Upload images
3. Exception
3.1 Test URL: localhost:8080/webstore_resolvers/products/Smartphone - GOOD
		      localhost:8080/webstore_resolvers/products/chargers   - Fail
3.2 Add message to NoProductsFoundUnderCategoryException.java which is different from textbook
3.3 Test ControllerAdvice: http://localhost:8080/webstore_resolvers/product?id=P123999

4. Internationalization - only addProduct page
