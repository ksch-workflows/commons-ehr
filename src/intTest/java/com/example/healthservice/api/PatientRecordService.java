package com.example.healthservice.api;

import org.openehr.rm.common.change_control.VersionedObject;

public interface PatientRecordService {
    VersionedObject<Patient> createPatientRecord();
}
