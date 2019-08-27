package com.hendisantika.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;


@Entity
@Table(name = "Employee")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String username;

    @Column
    @JsonIgnore
    private String password;

    @Column
    private long salary;

    @Column
    private int age;

    @CreationTimestamp
    @Column(insertable = true, updatable = false)
    private Timestamp createdAt;
    @UpdateTimestamp
    @Column(insertable = false, updatable = true)
    private Timestamp updatedAt;

   /* @Column(name = "is_active", columnDefinition = "BOOLEAN DEFAULT true", nullable = false,
            insertable = true, updatable = false)
    private Boolean isActive = true;*/
    @Column(nullable = false)
    private String createdBy;
    @Column(nullable = false)
    private String updatedBy;
    @Column(unique = true)
    private String officialEmail;
    @Column(nullable = false,unique = true)
    private String employeeID;
    private String firstName;
    private String lastName;

    @Column(nullable = false)
    private Integer department_id;
    @Column(nullable = false)
    private Integer designation_id;
    private Date dateOfJoining;
    @Column(nullable = false)
    private String gender;
    private Long reportingTo;
    private String photo;
    @Column(nullable = false,unique = true)
    private Long mobileNO;
}
