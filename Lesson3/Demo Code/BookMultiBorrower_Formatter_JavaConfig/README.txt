This demo is for lesson: Lesson Spring MVC Tag Library

It uses Java Config instead of XML file.

Home page: http://localhost:8080/BookMultiBorrower_Formatter_JavaConfig

BookFormatter uses bookService which needs to be managed by Spring. We have to autowire BookFormatter in WebApplicationContextConfig instead creating
an object in addFormatters which won't work.

