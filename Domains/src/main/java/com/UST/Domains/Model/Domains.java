package com.UST.Domains.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor  // MongoDB collection name
@Document
public class Domains {

    @Id  // MongoDB ID field
    private String domain_id;  // Use ObjectId for MongoDB I
    private String domain_name;
    private String count;
}
