# Persona3
## Technology : 
  * Spring Boot
  * SQL
 
 
**Goals (completed) :**

* Desgined an API for getting all the ad_creative for that ad_placement:
  
Route: `http://localhost:8080/v1/{ad_placement_id}`

Response : 
```
[
    {
        "adCreativeId": 2,
        "imageUrl": "https://picsum.photos/300",
        "deviceType": "DeskTop",
        "lat": "20.06",
        "lang": "35.07"
    },
    {
        "adCreativeId": 3,
        "imageUrl": "https://picsum.photos/400",
        "deviceType": "Mobile",
        "lat": "20.06",
        "lang": "35.07"
    },
    {
        "adCreativeId": 4,
        "imageUrl": "https://picsum.photos/500",
        "deviceType": "Phone",
        "lat": "20.06",
        "lang": "35.07"
    },
    {
        "adCreativeId": 5,
        "imageUrl": "https://picsum.photos/600",
        "deviceType": "Tablets",
        "lat": "20.06",
        "lang": "35.07"
    }
]
```

![postman_testing](https://github.com/Kumaravinash9/Campground/assets/64456168/03b085fd-1bfc-4d48-a179-32e0b939613a)


## Database Overview :

![database_overview](https://github.com/Kumaravinash9/Campground/assets/64456168/20ad076c-b698-475f-bde9-96f1d3e16797)


### Prerequisites

* `java version "18.0.2" 2022-07-19`
* `maven 3.8 above`
* `HK database`

### Development

   **Dependencies**
   
   
        * spring-boot-starter-data-jpa
        * spring-boot-starter-web
        * h2
        * lombok
        * spring-boot-maven-plugin
        
        
      
   **Database**
   
        (1). HK database (locally  setup)
        
        
        
## Installing on Local Machine

* `cd Persona/`
* `mvn clean install`
* `java -jar target/persona-0.0.1-SNAPSHOT.jar`

### API testing :
* `PostMan`
