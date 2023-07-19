package org.ksplus.base.base_types.identification;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.openehr.base.base_types.identification.Uid;

class UidBasedIdTest {

    @Nested
    @DisplayName("UidBasedId#root")
    class Root {

        @Test
        void should_return_root_only() {
            UidBasedId uidBasedId = new UidBasedId("foo_bar::abcde");

            Uid root = uidBasedId.root();

            assertThat(root.getValue(), equalTo("foo_bar"));
        }

        @Test
        void should_default_to_whole_string() {
            UidBasedId uidBasedId = new UidBasedId("abcde");

            Uid root = uidBasedId.root();

            assertThat(root.getValue(), equalTo("abcde"));
        }
    }

    @Nested
    @DisplayName("UidBasedId#extension")
    class Extension {

        @Test
        void should_return_right_side() {
            UidBasedId uidBasedId = new UidBasedId("foo_bar::abcde");

            String extension = uidBasedId.extension();

            assertThat(extension, equalTo("abcde"));
        }

        @Test
        void should_return_right_side_first_occurrence_of_double_colon() {
            UidBasedId uidBasedId = new UidBasedId("foo_bar::abcde::8763483");

            String extension = uidBasedId.extension();

            assertThat(extension, equalTo("abcde::8763483"));
        }

        @Test
        void should_return_empty_string_if_no_extension() {
            UidBasedId uidBasedId = new UidBasedId("foo_bar");

            String extension = uidBasedId.extension();

            assertThat(extension, equalTo(""));
        }
    }

    @Nested
    @DisplayName("UidBasedId#hasExtension")
    class HasExtension {

        @Test
        void should_evaluate_to_false_if_no_extension() {
            UidBasedId uidBasedId = new UidBasedId("foo_bar");

            Boolean result = uidBasedId.hasExtension();

            assertThat(result, equalTo(false));
        }

        @Test
        void should_evaluate_to_true_if_extension() {
            UidBasedId uidBasedId = new UidBasedId("foo_bar::1233423");

            Boolean result = uidBasedId.hasExtension();

            assertThat(result, equalTo(true));
        }
    }
}
