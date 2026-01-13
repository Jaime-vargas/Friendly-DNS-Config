package com.app.dhcp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class GlobalConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true, nullable=false)
    private String subnet;
    @Column(unique=true, nullable=false)
    private String netmask;
    @Column(unique=true, nullable=false)
    private String start_range;
    @Column(unique=true, nullable=false)
    private String end_Range;

    @Column(unique=true, nullable=false)
    private String default_lease_time;
    @Column(unique=true, nullable=false)
    private String max_lease_time;

    @Column(unique=true, nullable=false)
    private String router;
    @Column(unique=true, nullable=false)
    private String primary_dns;
    @Column(unique=true, nullable=false)
    private String secondary_dns;
    @Column(unique=true, nullable=false)
    private String broadcast;

}
