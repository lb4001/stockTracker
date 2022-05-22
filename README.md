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
[Pic 1](https://github.com/lb4001/stockTracker/blob/ed1c20c59f5a0fa6ff41e0ba820eba00070e82fd/whiteboard/IMG_5060.HEIC?raw=true)