# stockTracker



# Frontend

### VueJS 3 w/ TypeScript, Pinia, Vue Router
https://vuejs.org/ 

### Volar - VS Code Plugin
https://github.com/johnsoncodehk/volar

### Element+ UI Component Library
https://element-plus.org/en-US/
https://github.com/element-plus/unplugin-element-plus#readme

Setting Up Element+
https://element-plus.org/en-US/guide/quickstart.html#full-import



# Backend
### Spring Boot for the API
https://spring.io/guides/tutorials/rest/

# MySQL
### Setting Up MySQL
Get MySQL image
> docker pull mysql

Get password from mysql container after starting
> docker logs stocktrack-mysql

Connect to mysql using that password
> docker exec -it stocktrack-mysql mysql -uroot -p

Update password and host connection source
> ALTER USER 'root'@'localhost' IDENTIFIED BY 'mypassword';
> UPDATE mysql.user SET Host='%' WHERE Host='localhost' AND User='root';


# Whiteboarding
![Pic 1](/whiteboard/IMG_5060.jpg?raw=true)
![Pic 2](/whiteboard/IMG_5061.jpg?raw=true)
![Pic 3](/whiteboard/IMG_5062.jpg?raw=true)
![Pic 4](/whiteboard/IMG_5068.jpg?raw=true)
![Pic 5](/whiteboard/IMG_5069.jpg?raw=true)