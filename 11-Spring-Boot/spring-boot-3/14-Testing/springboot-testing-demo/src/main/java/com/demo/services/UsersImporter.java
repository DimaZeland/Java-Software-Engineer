
package com.demo.services;

import com.demo.entities.User;
import com.demo.exceptions.UserImportServiceCommunicationFailure;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UsersImporter {

    public List<User> importUsers() throws UserImportServiceCommunicationFailure {
        //Here
        List<User> users = new ArrayList<>();
        //get users by invoking some web service
        //if any exception occurs throw UserImportServiceCommunicationFailure

        //dummy data
        users.add(new User());
        users.add(new User());
        users.add(new User());

        return users;
    }

}
