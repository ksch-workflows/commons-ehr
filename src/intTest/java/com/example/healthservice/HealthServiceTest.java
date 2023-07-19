package com.example.healthservice;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.healthservice.api.PatientRecordService;
import com.example.healthservice.core.PatientRecordRepository;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class HealthServiceTest {

    @Autowired
    private PatientRecordService patientRecordService;

    @Autowired
    private PatientRecordRepository patientRecordRepository;

    @Test
    void should_create_patient_record() {

        patientRecordService.createPatientRecord();
        patientRecordService.createPatientRecord();
        patientRecordService.createPatientRecord();
        patientRecordService.createPatientRecord();

        int numberOfPatientRecords = patientRecordRepository.countPatientRecords();

        assertThat(numberOfPatientRecords, equalTo(4));
    }
}
