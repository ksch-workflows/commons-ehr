package com.example.healthservice.core;

import java.util.UUID;

import org.openehr.rm.common.change_control.VersionedObject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.healthservice.api.Patient;
import com.example.healthservice.api.PatientRecordService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PatientRecordServiceImpl implements PatientRecordService {

    private final PatientRecordRepository patientRecordRepository;

    @Override
    @Transactional
    public VersionedObject<Patient> createPatientRecord() {
        UUID patientRecordId = UUID.randomUUID();

        VersionedObject<Patient> result = org.ksplus.ehr.rm.common.change_control.VersionedObject.<Patient>builder()
            .id(patientRecordId)
            .build();

        return patientRecordRepository.save(result);
    }
}
