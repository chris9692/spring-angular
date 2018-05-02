"# spring-angular" 

The original tutorial URL:

https://www.djamware.com/post/5a792ecb80aca7059c142978/spring-boot-mongodb-and-angular-5-crud-java-web-application



1. Generate Spring Boot Application with Spring Initializer (https://start.spring.io/)

2. modify src/main/java/resources/application.properties (mongodb connection)

3. src/main/java/com/sequoiasolutionsinc/springangular/models/Contact.java

4. src/main/java/com/sequoiasolutionsinc/springangular/repositories/ContactRepository.java

5. src/main/java/com/djamware/angular/controllers/ContactController.java

6. ./gradlew bootRun

7. curl -i -X POST -H "Content-Type: application/json" -d '{"name":"John Doe","address":"Jl. Cipaganti No.112","city":"Bandung","phone":"0811223112233","email":"john.doe@dummy.com"}' localhost:8080/contacts

8. curl -i -H "Accept: application/json" localhost:8080/contacts

9. ng new frontend

10. frontend/.angular-cli.json

11. npm install && ng build

12 ng g component contact

13 ng g component contact-detail

14 ng g component contact-create

15 ng g component contact-edit

16 ng build

17 ./gradlew bootRun

sudo npm install -g @angular/cli