package com.example.healthservice.core;

import org.openehr.rm.common.change_control.VersionedObject;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.healthservice.api.Patient;

import lombok.RequiredArgsConstructor;

@SuppressWarnings("SqlResolve")
@Component
@RequiredArgsConstructor
public class PatientRecordRepository {

    private final JdbcTemplate jdbcTemplate;

    public VersionedObject<Patient> save(VersionedObject<Patient> patientRecord) {
        var patientId = patientRecord.getUid().getValue();
        var sql = """
            INSERT INTO PATIENT_RECORD(ID) VALUES (?);
            """;
        jdbcTemplate.update(sql, patientId);
        return patientRecord;
    }

    public int countPatientRecords() {
        var sql = """
            SELECT COUNT(*) FROM PATIENT_RECORD;
            """;
        var result = jdbcTemplate.queryForObject(sql, Integer.class);
        return result != null ? result : 0;
    }
}
