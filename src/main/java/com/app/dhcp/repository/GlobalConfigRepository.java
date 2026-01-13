package com.app.dhcp.repository;

import com.app.dhcp.model.GlobalConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlobalConfigRepository extends JpaRepository<GlobalConfig,Long> {
}
