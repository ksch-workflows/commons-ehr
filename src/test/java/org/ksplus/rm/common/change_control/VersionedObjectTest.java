package org.ksplus.rm.common.change_control;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class VersionedObjectTest {

    @Nested
    @DisplayName("#getUid")
    class GetUid {
        @Test
        void should_get_uid() {
            UUID id = UUID.randomUUID();

            VersionedObject<Patient> result = VersionedObject.<Patient>builder()
                .id(id)
                .build();

            assertThat(result.getUid().getValue(), equalTo(id.toString()));
        }
    }
}