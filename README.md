# stockTracker

# Frontend
https://vuejs.org/
https://bootstrap-vue.org/docs

## Vue Template
https://www.creative-tim.com/learning-lab/vue/overview/soft-ui-dashboard/
https://github.com/creativetimofficial/vue-soft-ui-dashboard?ref=vuejsexamples.com

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



