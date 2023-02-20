package com.namasake.University.repo;

import com.namasake.University.config.DataSourceConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataSourceConfigRepository extends JpaRepository<DataSourceConfig,Long> {
    DataSourceConfig findByName(String name);
}
