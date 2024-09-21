# Staff Service

This service is responsible for managing operations related to the `Staff` entity, including retrieving, adding, and updating employee records. It interacts with the **StaffRepository** to perform CRUD operations and implements basic business logic to manage staff data efficiently.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Class Breakdown](#class-breakdown)
- [Methods](#methods)
- [Usage](#usage)
- [Technologies Used](#technologies-used)

## Overview

The `StaffService` class follows the **three-layer architecture** and is part of the **service layer**. It interacts with the **repository layer** (`StaffRepository`) to perform the necessary data operations related to the `Staff` entity. The service handles retrieving employee details by ID, adding new employees, updating existing records, and submitting employee details based on existence in the repository.

## Features

- Retrieve employee by index or ID
- Add a new employee record
- Update an existing employee record
- Automatically decide whether to add or update employee data (via `submitStaff`)
- Retrieve a list of all employees

## Class Breakdown

- **Package:** `com.datawrite.tets_data_path.service`
- **Dependencies:** 
  - `StaffRepository`: Provides data access and CRUD operations.
  - `Constants`: Contains shared constants like `NO_MATCH`.
  - `Staff`: Entity class representing a staff member.
  
- **Annotations:**
  - `@Component`: Marks the class as a Spring-managed component, enabling dependency injection.

## Methods

### `geEmpByIndex(int index)`
- **Description:** Retrieves an employee by their index in the list.
- **Returns:** `Staff` object.

### `geEmpById(String id)`
- **Description:** Retrieves an employee by their unique ID. If no match is found, it returns an empty `Staff` object.
- **Returns:** `Staff` object.

### `addEmp(Staff staff)`
- **Description:** Adds a new employee to the repository.

### `updateEmp(Staff staff, int index)`
- **Description:** Updates an existing employee at the specified index.

### `getAllEmp()`
- **Description:** Retrieves a list of all employees.
- **Returns:** `List<Staff>`.

### `getEmpId(String id)`
- **Description:** Retrieves the index of an employee by their ID. If no match is found, it returns a constant `NO_MATCH`.
- **Returns:** `int` (index of employee).

### `submitStaff(Staff staff)`
- **Description:** Submits an employee record. If the employee already exists (matched by ID), their information is updated. If not, a new employee record is added.

## Usage

To use the `StaffService` in a Spring Boot application, you can inject it into your controller or other service classes as follows:

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StaffController {

    @Autowired
    private StaffService staffService;

    public void someMethod() {
        // Add new staff
        Staff newStaff = new Staff();
        staffService.addEmp(newStaff);

        // Get all staff
        List<Staff> allStaff = staffService.getAllEmp();

        // Submit a new staff or update existing
        staffService.submitStaff(newStaff);
    }
}
