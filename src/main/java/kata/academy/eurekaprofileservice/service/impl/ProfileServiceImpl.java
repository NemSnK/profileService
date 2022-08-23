package kata.academy.eurekaprofileservice.service.impl;

import kata.academy.eurekaprofileservice.model.entity.Profile;
import kata.academy.eurekaprofileservice.repository.ProfileRepository;
import kata.academy.eurekaprofileservice.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository profileRepository;

    @Override
    public Profile addProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public Profile updateProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public void deleteProfile(Long id) {
        profileRepository.deleteById(id);
    }

}
