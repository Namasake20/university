package com.namasake.University.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data @Entity @AllArgsConstructor @NoArgsConstructor @Table(name = "student")
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String email;
    String reg_number;
    @Column(name = "tenant_id")
    String tenantId;
}
