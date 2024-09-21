# Staff Management System

## Overview
This is a simple Staff Management System built with Spring Boot. The application allows users to add, update, delete, and view employee records.

## Features
- Add new employees
- Update existing employee details
- Delete employees
- View all employees in a list
- Input validation for employee fields

## Technologies Used
- Java 17
- Spring Boot 3.3.3
- Thymeleaf
- Hibernate
- Jakarta Validation
- Maven

## User Interface
The user interface (UI) is designed for simplicity and usability:

- **Home Page**: 
  - Contains links to add new employees and view all employees.
  - Provides a form for adding employee details, including name, title, and salary.

- **Employee List Page**:
  - Displays all employees in a responsive table format.
  - Each row shows the employee's name, title, salary, and includes buttons for updating or deleting the employee.
  - A notification is shown if no employees are available.

- **Styling**:
  - The UI is styled with modern CSS for an appealing look.
  - The navigation bar is centered and features hover effects for better user experience.
  - The layout is responsive, ensuring compatibility across devices.

## Getting Started

### Prerequisites
Make sure you have the following installed:
- Java 17 or later
- Maven

### Clone the Repository
```bash
git clone https://github.com/your-username/staff-management-system.git
cd staff-management-system
