# SFMovies
- Create a service that shows on a ~~map~~ table where movies have been filmed in San Francisco.
- The user should be able to filter the view using ~~autocompletion~~ search.

## Demo
[SFMovies Service](http://115.159.29.176)

## REST Api
http://115.159.29.176/title/{title}/locations/{locations}

You can access this API, which follows the REST model, to get the information that meets the conditions in JSON format.
for example, if you want to know if there is a film has a title contains 'smile' near the 'Hills Brothers Plaza', you can find by
access '[http://115.159.29.176/title/smile/locations/Hills Brothers Plaza](http://115.159.29.176/title/smile/locations/Hills%20Brothers%20Plaza),then you will get the following information:
```json
[
    {
        "id": 22,
        "title": "A Smile Like Yours ",
        "releaseYear": "1997",
        "locations": "Hills Brothers Plaza (Embarcadero at Harrison Street)",
        "funFacts": "",
        "productionCompany": "Paramount Pictures",
        "distributor": "Paramount Pictures",
        "director": "Keith Samples",
        "writer": "Keith Samples & Kevin Meyer",
        "actor1": "Greg Kinnear",
        "actor2": "Lauren Holly",
        "actor3": ""
    }
]
```
## Operating Environment && Technology Tools
- JDK 1.8
- Maven 3.2.2
- Spring boot 1.4.2.RELEASE
- MySql 5.1

# Experience && Skills
- Spring
- Spring MVC
- Spring Data Jpa
- Hibernate
- Activiti WorkFlow
- jQuery
- bootstrap
- dwr
- sitemesh
- cxf
- MySql
- DB2
- Tomcat
- JUnit
- Maven
- Markdown
- hudson
- mantis
- Node.js
- AngularJs
- Flex
