package com.dotitude.api.controller;

import com.dotitude.api.model.VaccinationRecordEntity;
import com.dotitude.api.service.VaccinationRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/vaccination")
@RequiredArgsConstructor
public class VaccinationController {

    private final VaccinationRecordService vaccinationRecordService;

    @GetMapping
    public ResponseEntity<List<VaccinationRecordEntity>> readVaccinationRecords () {
        return ResponseEntity.ok(vaccinationRecordService.readVaccinationRecords());
    }

    @GetMapping("/{id}")
    public ResponseEntity<VaccinationRecordEntity> readVaccinationRecord (@PathVariable("id") Long id) {
        return ResponseEntity.ok(vaccinationRecordService.readVaccinationRecord(id));
    }

    @PostMapping
    public ResponseEntity<VaccinationRecordEntity> createVaccinationRecord(@RequestBody VaccinationRecordEntity entity) {
        return new ResponseEntity<>(vaccinationRecordService.createVaccinationRecord(entity), HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<VaccinationRecordEntity> updateVaccinationRecord(@PathVariable("id") Long id, @RequestBody VaccinationRecordEntity entity) {
        return ResponseEntity.ok(vaccinationRecordService.updateVaccinationRecord(id, entity));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteVaccinationRecord (@PathVariable("id") Long id) {
        vaccinationRecordService.deleteVaccinationRecord(id);
        return ResponseEntity.ok().build();
    }

}
