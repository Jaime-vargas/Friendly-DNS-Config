package com.app.dhcp.dto;

import com.app.dhcp.model.GlobalConfig;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

public record GlobalConfigDto (Long id,
                               String subnet,
                               String netmask,
                               String start_range,
                               String end_range,
                               String default_lease_time,
                               String max_lease_time,
                               String router,
                               String primary_dns,
                               String secondary_dns,
                               String broadcast) {
}
