package net.retimus.appdirect.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.retimus.appdirect.domain.appdirect.User;
import net.retimus.appdirect.domain.myapp.Profile;
import net.retimus.appdirect.repository.BaseRepository;
import net.retimus.appdirect.repository.ProfileRepository;

@Service
public class ProfileService extends BaseCrudService<Profile, Long> {

    @Autowired
    private ProfileRepository repository;

    public Profile getByOpenID(String openId) {
        return repository.findByOpenId(openId);
    }

    public Profile getByEmail(String email) {
        return repository.findByEmail(email);
    }



    @Override
    protected BaseRepository<Profile, Serializable> getRepository() {
        return repository;
    }
}
