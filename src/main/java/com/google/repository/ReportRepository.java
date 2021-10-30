package com.google.repository;

import com.google.domain.SysReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<SysReport, Long> {
}
