package kata.academy.eurekaprofileservice.rest.outer;

import kata.academy.eurekaprofileservice.api.Response;
import kata.academy.eurekaprofileservice.model.dto.ProfilePersistRequestDto;
import kata.academy.eurekaprofileservice.model.dto.ProfileUpdateRequestDto;
import kata.academy.eurekaprofileservice.model.entity.Profile;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Positive;

@RestController
@RequestMapping("/api/v1/profile")
public class ProfileRestController {

    @PostMapping
    Response<Profile> addProfile(ProfilePersistRequestDto dto, @RequestParam @Positive Long userId) {
        return null;
    }

    @PutMapping
    Response<Profile> updateProfile(@RequestBody ProfileUpdateRequestDto dto, @RequestParam @Positive Long userId) {
        return null;
    }

    @DeleteMapping
    Response<Void> deleteProfile(@PathVariable Long profileId, @RequestParam @Positive Long userId) {
        return null;
    }

}
