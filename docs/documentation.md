<div align="center">
<h3 align="center">REST API - Studies</h3>
  <p align="center">
    Documentation
</p>
</div>
<br />

## Communication

Communication with the database is based on the requests in the form of appropriate urls:
```http://<server-ip>:<port>/<endpoint>```, for example:
```
http://localhost:8080/users/5
http://localhost:8080/types/equipments?page=1&sort=DESC
```

![alt text](api_info.jpg)

<p align="right">(<a href="#top">back to top</a>)</p>



## Response statuses

The HTTP protocol provides many response statuses that we can provide to the client depending on the progress of their request. There are 5 basic groups:

* 1xx – information
* 2xx – success
* 3xx – redirections
* 4xx – client-side errors
* 5xx – server-side errors

The following is a download that provides information on what code should be returned depending on the action taken

![alt text](responses_info.jpg)

<p align="right">(<a href="#top">back to top</a>)</p>

## Database structure

The used database has the same structure as in the screenshot below:

![alt text](database_info.jpg)

<p align="right">(<a href="#top">back to top</a>)</p>

## Example requests:

```
GET http://localhost:8080/users/5
GET http://localhost:8080/types/equipments?page=1&sort=DESC

DELETE http://localhost:8080/users/payments/2
DELETE "http://localhost:8080/types/3"
```

<p align="right">(<a href="#top">back to top</a>)</p>
