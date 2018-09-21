package com.stackroute.buzzup.service;

import com.stackroute.buzzup.exceptions.UserAlreadyExistsException;
import com.stackroute.buzzup.exceptions.UserNotFoundException;
import com.stackroute.buzzup.model.UserProfile;

public interface UserProfileService {

	 UserProfile registerUser(UserProfile user) throws UserAlreadyExistsException;

	    UserProfile updateUser(String userMobile,UserProfile user) throws UserNotFoundException;

	    boolean deleteUser(String userMobile) throws UserNotFoundException;

	    UserProfile getUserByMobile(String userMobile) throws UserNotFoundException;
}
