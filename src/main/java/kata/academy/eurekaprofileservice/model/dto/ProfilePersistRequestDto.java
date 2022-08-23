package kata.academy.eurekaprofileservice.model.dto;

import kata.academy.eurekaprofileservice.model.enums.Gender;
import java.time.LocalDate;

public record ProfilePersistRequestDto(String firstName,
                                       String lastName,
                                       LocalDate birthdate,
                                       Gender gender) {
}
