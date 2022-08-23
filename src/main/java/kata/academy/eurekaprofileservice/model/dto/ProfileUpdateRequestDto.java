package kata.academy.eurekaprofileservice.model.dto;

import kata.academy.eurekaprofileservice.model.enums.Gender;
import java.time.LocalDate;

public record ProfileUpdateRequestDto(String firstName,
                                      String lastName,
                                      LocalDate birthdate,
                                      Gender gender) {
}
