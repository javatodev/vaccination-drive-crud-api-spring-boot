package com.dotitude.api.repository;

import com.dotitude.api.model.VaccinationRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationRecordRepository extends JpaRepository<VaccinationRecordEntity, Long> {
}
