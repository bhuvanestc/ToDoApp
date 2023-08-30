package org.example.data.dao;

import org.example.model.AppUser;

import java.util.Collection;

public interface AppUserDAO {
    public AppUser persist (AppUser appUser);
    public AppUser findByUsername(AppUser username);
    public Collection<AppUser> findAll();
    public void remove(AppUser usename);
}
