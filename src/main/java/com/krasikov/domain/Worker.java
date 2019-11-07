package com.krasikov.domain;

import javax.persistence.*;

@Entity
@Table(name = "WORKER")
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "worker_id")
    private Long id;
}
