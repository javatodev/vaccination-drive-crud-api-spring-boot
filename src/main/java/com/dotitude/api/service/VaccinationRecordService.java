package com.dotitude.api.service;

import com.dotitude.api.model.VaccinationRecordEntity;
import com.dotitude.api.repository.VaccinationRecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VaccinationRecordService {

    private final VaccinationRecordRepository vaccinationRecordRepository;

    public VaccinationRecordEntity createVaccinationRecord(VaccinationRecordEntity entity) {
        return vaccinationRecordRepository.save(entity);
    }

    public VaccinationRecordEntity readVaccinationRecord (Long id) {
        return vaccinationRecordRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public List<VaccinationRecordEntity> readVaccinationRecords () {
        return vaccinationRecordRepository.findAll();
    }

    public VaccinationRecordEntity updateVaccinationRecord(Long id, VaccinationRecordEntity entity) {

        VaccinationRecordEntity vaccinationRecordEntity = vaccinationRecordRepository.findById(id).orElseThrow(EntityNotFoundException::new);

        vaccinationRecordEntity.setFirstName(entity.getFirstName());
        vaccinationRecordEntity.setLastName(entity.getLastName());
        vaccinationRecordEntity.setAddressLine01(entity.getAddressLine01());
        vaccinationRecordEntity.setAddressLine02(entity.getAddressLine02());
        vaccinationRecordEntity.setCity(entity.getCity());

        return vaccinationRecordRepository.save(vaccinationRecordEntity);

    }

    public void deleteVaccinationRecord(Long id) {
        VaccinationRecordEntity vaccinationRecordEntity = vaccinationRecordRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        vaccinationRecordRepository.delete(vaccinationRecordEntity);
    }
}
