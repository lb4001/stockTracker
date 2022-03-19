# stockTracker

# Frontend
https://vuejs.org/
https://bootstrap-vue.org/docs

# Using Sprint Boot for the API
https://spring.io/guides/tutorials/rest/

# Setting Up MySQL
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



