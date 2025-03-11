# E-Blogs-Using-Spring-Boot (Project Description)  

## Steps to execute the eblogs projects :
*1. run the main file of project(which is having main method)*  
*2. access that project on browser by entering port no like e.g “localhost:8088/”  press enter*  
_3. click on registration button_  
_4. after successful registration, login to your account with valid email id_  
_5. if you forgot the password then click on “forgot password link” then you will receive OTP on entered mail id and by entering that OTP you can be able to change your password_  
_6. If you have successfully login then_  
_7. we can go on next page because we have use the pagination technique_  
_8. then logout_  

***In this, “eblog using springboot” we have used following concepts/technologies***   
### Backend:  
1.JPA(Java Persistence API)  
2.Srping core, Spring mvc  
3.Hibernate annotations  
4.Hibernate validation  
5.email services  
6.Spring annotations  
7.Hibernate Mappings  
8.Spring security  
9. Thymeleaf  
10.Rest API 
  
### Frontend:  
1.	Html  
2.	Css  
3.	Javascript  
4.	bootstrap  
   
In this project, basically it consists of two  main modules the USER modules and POST module  
**1. USER MODULE :** In the user module ,user can be able to register with this application by entering his/her email and password .Here user must have to specify valid mail id because if user forgot password in future so in this application we have implemented the concept of forgot password. I have use password encoder mechanism which encodes our readable password in non readable format using BcryptPasswordEncoder. 
In this forgot password concept we are using the concept of email services of spring boot. if you want to enable email services in application so you have to do two things  
1. add dependency of email services in the pom.xml file  
2. we have to configure some properties of email services in the application.properties file  
Once we have changed password by using the concept of forgot password, we can be able to login into our application once we are login we can be able to post blogs . user can also be able to logout from his account  

**2.POST Module :**  Now in the post module we can be able to add blogs ,view blogs ,edit ,delete blogs.In the add blog feature we can verify the content of our blogs on the plagarism checker tool(turnitin)
so here our eblogs application is acting like a client which sends request to server (turnnitin) by using restAPI on the server(turnnitin) our request or content will be verified within 50000 m/s = 50sec .. Once content will be verified ( if there is less than 50 % plagarism) we can able to post the blog (into our database).
But if the content is not verified by the turnitin means it contains plagarism then turnitin shows /displays Map(it is a collection which stores the data in the form of key and value pair) of <url ,plagarismpercentage>

