package org.sample.controller.service;

import org.sample.controller.exceptions.InvalidUserException;
import org.sample.controller.pojos.SaveTeamNameForm;
import org.sample.controller.pojos.SignupForm;
import org.sample.model.TeamName;
import org.sample.model.User;

public interface SampleService {

    public SignupForm saveFrom(SignupForm signupForm) throws InvalidUserException;
    
    public SaveTeamNameForm saveTeamName(SaveTeamNameForm saveTeamName) throws InvalidUserException;
    
    public Iterable<TeamName> getAllTeamNames();
    
    public User getUserById(Long id);

}
