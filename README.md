# Ticket Booking System

## Overview

The Ticket Booking System is a web-based application developed using Java Full Stack technologies. The project allows users to create, view, update, and delete ticket records easily. It helps in managing passenger details and travel information in an organized manner.

The application follows CRUD operations and MVC architecture to provide a smooth and user-friendly experience.

## Features

* Add new ticket details
* View all booked tickets
* Update ticket information
* Delete individual ticket records
* Delete all ticket records
* Store passenger details in database
* Responsive and simple user interface
* Automatic ticket ID generation

## Technologies Used

### Frontend

* HTML
* CSS
* Bootstrap
* Thymeleaf

### Backend

* Java
* Spring Boot
* Spring MVC
* Hibernate
* JPA

### Database

* MySQL

## Project Structure

```text
Ticket-Booking-System/
│
├── src/main/java/com/example/demo/
│   ├── Ticket.java
│   ├── TicketController.java
│   ├── TicketService.java
│   ├── TicketDao.java
│   └── DemoApplication.java
│
├── src/main/resources/
│   ├── templates/
│   │   ├── home.html
│   │   ├── addticket.html
│   │   ├── viewtickets.html
│   │   └── editticket.html
│   │
│   ├── static/
│   │   ├── css/
│   │   └── images/
│   │
│   └── application.properties
│
├── pom.xml
└── README.md
```

## Working Process

1. User opens the Ticket Booking System.
2. The application displays the ticket booking form.
3. User enters passenger details such as name, email, phone number, source station, and destination.
4. The system validates the entered details.
5. If the details are correct, the information is stored in the MySQL database.
6. Users can view all booked tickets in a table.
7. Users can edit ticket details if required.
8. Users can delete selected ticket records.
9. The system updates the ticket list after every operation.

## Installation

```bash
git clone https://github.com/your-username/ticket-booking-system.git
cd ticket-booking-system
```

Open the project in Spring Tool Suite or IntelliJ IDEA.

Update database details in application.properties:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ticketdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

Run the project using:

```bash
mvn spring-boot:run
```

## Requirements

```text
Java 17+
Spring Boot
MySQL
Maven
Bootstrap
Thymeleaf
```

## Future Enhancements

* Add login and registration system
* Add payment gateway integration
* Generate PDF tickets
* Send email notifications
* Add search and filter options
* Add booking history page
* Add seat selection feature

## Conclusion

The Ticket Booking System is a useful Java Full Stack project for learning CRUD operations, MVC architecture, database connectivity, and frontend-backend integration. It provides practical knowledge of how real-world booking systems work and can be enhanced further with advanced features.
