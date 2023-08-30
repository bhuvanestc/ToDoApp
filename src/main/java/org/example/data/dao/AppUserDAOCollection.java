package org.example.data.dao;

import org.example.model.AppRole;
import org.example.model.AppUser;
import org.example.model.Person;
import org.example.model.TodoItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class AppUserDAOCollection implements AppUserDAO{
    private Collection<AppUser> appUser;
    @Override
    public AppUser persist(AppUser appUser) {
        AppUser a1=new AppUser("guru", AppRole.ROLE_APP_ADMIN);
        this.appUser.add(a1);
        return a1;
    }
    @Override
    public AppUser findByUsername(AppUser username) {
            for (AppUser user : appUser)
            {
                if (user.getUsername().contains(username.getUsername())) {
                    return user;
                }
            }
            return null;
        }

    @Override
    public Collection<AppUser> findAll() {
        return new ArrayList<>(appUser);
    }

    @Override
    public void remove(AppUser username) {
        Iterator<AppUser> iterator = appUser.iterator();


        while (iterator.hasNext()) {
            AppUser item = iterator.next();
            if (item.getUsername() == username.getUsername()) {
                iterator.remove();
            }
        }


    }
}
