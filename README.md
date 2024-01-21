<div align="center">
<h3 align="center">REST API - Studies</h3>
  <p align="center">
    Team project for studies
    <br />
    <a href="https://github.com/Rhanjie/RestAPI-Studies/blob/master/docs/documentation.md"><strong>Explore the docs »</strong></a>
    <br />
</p>
</div>
<br />
<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

The project consists in providing a REST API for a sample library database in order to be able to use the data in a mobile and web applications to facilitate readers' access to the book database with a convenient interface that will display information such as the date the books were borrowed, the final return date, the stock and any penalties.

Our aim is to develop our programming skills in practice, so creating a project like this is an opportunity for us to make the world better. (XD)

<p align="right">(<a href="#top">back to top</a>)</p>



### Built With

The project uses several libraries that allow you to speed up the work on the target functionality, i.e. providing a safe and developed API for the library system. The dependencies used are:

* [Spring](https://spring.io/)
* [Lombok](https://projectlombok.org/)
* [H2 Database Engine](https://www.h2database.com/)
* [Hibernate JPA](https://hibernate.org/)

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these simple example steps.

### Prerequisites

To be able to run the project, **Java 14** and the **Gradle** tool are required to download the all dependencies. It is also recommended to use **IntelliJ IDEA**, but it depends on your preferences.

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/Rhanjie/RestAPI-Studies
   ```
2. Open the project using your IDE.
3. Reload the project using gradle to download the dependencies
   ```sh
   gradle build --refresh-dependencies
   ```

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
## Usage

Once the project has been successfully launched, you can access its endpoints locally. The address for this is:
```
http://localhost:8080/
```

To use the H2 database, go to the appropriate address and log in without changing the default credentials:
```
http://localhost:8080/h2-console
```

To use the Swagger tool to test the available endpoints, go to the address below:
```
http://localhost:8080/swagger-ui.html#/
```

To be able to use endpoints and requests in swagger, log in with the appropriate credentials and paste the obtained token into the special field.
<br>
The test user is:
```
Nickname: test
Password: test
```

_For more examples, please refer to the [Documentation](https://github.com/Rhanjie/RestAPI-Studies/blob/master/docs/documentation.md)_

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- Team -->
## Meet the team - Spice Girls UJD

Marcin Dyla - [RhAnjiE](https://github.com/Rhanjie) - irhanjie@gmail.com
<br>
Natalia Praska - [Essmira](https://github.com/Essmira) - natalia.praska73@gmail.com

<p align="right">(<a href="#top">back to top</a>)</p>