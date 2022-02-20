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
GET http://localhost:8080/payments/1/users/5
POST http://localhost:8080/equipment/
```

![alt text](api_info.jpg)

<p align="right">(<a href="#top">back to top</a>)</p>



## Response statuses

The HTTP protocol provides many response statuses that we can provide to the client depending on the progress of their request. There are 5 basic groups:

* 1xx – informations
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

## Example endpoints:

TODO: Finish this section

<p align="right">(<a href="#top">back to top</a>)</p>