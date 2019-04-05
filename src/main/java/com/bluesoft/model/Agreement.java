package com.bluesoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agreement")
public class Agreement {

    @Id
    @Column(name = "id")
    private Long id;
}
