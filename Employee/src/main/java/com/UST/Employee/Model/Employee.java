package com.UST.Employee.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Employee {

    private String id;
    private String employeeName;  // Field name updated to camelCase
    private String skillSet;      // Field name updated to camelCase
    private String email;         // Field name updated to camelCase
    private Status status;        // Employee Status (Enum)

}
