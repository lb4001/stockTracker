# stockTracker

# Frontend
Using VueJS 3 with Element+
https://vuejs.org/ 
https://element-plus.org/en-US/

# Backend
##Spring Boot for the API
https://spring.io/guides/tutorials/rest/

#MySQL
## Setting Up MySQL
Get password from mysql container after starting
```
docker logs stocktrack-mysql
```

Connect to mysql using that password
```
docker exec -it stocktrack-mysql mysql -uroot -p
```

Update password and host connection source
```
ALTER USER 'root'@'localhost' IDENTIFIED BY 'mypassword';

UPDATE mysql.user SET Host='%' WHERE Host='localhost' AND User='root';
```



