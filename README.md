# Contact List Project

## Overview
This project is a Java-based application designed to manage a contact list. It utilizes Spring Boot for the backend, Maven for dependency management, and integrates with SQL databases for data persistence.

## Features
- **Contact Management**: Create, read, update, and delete contacts.
- **Phone Number Validation**: Validates phone numbers using a custom annotation to ensure data integrity.

## Technologies
- Java
- Spring Boot
- Maven
- SQL

## Getting Started

### Prerequisites
- JDK 11 or later
- Maven 3.6 or later
- An SQL database (MySQL, PostgreSQL, etc.)

### Setup
1. Clone the repository: `git clone https://github.com/mdemiguels/contact-list.git`
2. Navigate to the project directory: `cd contact-list`
3. Configure your SQL database settings in `src/main/resources/application.properties`

### Running the Application
Execute the following command to run the application:
1. Build the project: `mvn clean install`
2. Run the project: `mvn spring-boot:run`

## API Endpoints
The application provides the following RESTful endpoints:

- `GET /api/contacts`: Fetch all contacts.
- `POST /api/contacts`: Create a new contact.
- `GET /api/contacts/{id}`: Fetch a single contact by ID.
- `PUT /api/contacts/{id}`: Update a contact.
- `DELETE /api/contacts/{id}`: Delete a contact.
