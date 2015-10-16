package net.retimus.appdirect.repository;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import net.retimus.appdirect.domain.myapp.Profile;

@Repository
public interface ProfileRepository extends BaseRepository<Profile, Serializable> {
    public Profile findByEmail(String email);
    public Profile findByOpenId(String openId);
}
