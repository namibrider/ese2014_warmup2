package org.sample.controller.service;

import org.sample.controller.exceptions.InvalidUserException;
import org.sample.controller.pojos.SaveTeamNameForm;
import org.sample.controller.pojos.SignupForm;
import org.sample.model.Address;
import org.sample.model.TeamName;
import org.sample.model.User;
import org.sample.model.dao.AddressDao;
import org.sample.model.dao.TeamNameDao;
import org.sample.model.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;


@Service
public class SampleServiceImpl implements SampleService {

    @Autowired    UserDao userDao;
    @Autowired    AddressDao addDao;
    @Autowired    TeamNameDao teamNameDao;
    
    @Transactional
    public SignupForm saveFrom(SignupForm signupForm) throws InvalidUserException{

        String firstName = signupForm.getFirstName();

        if(!StringUtils.isEmpty(firstName) && "ESE".equalsIgnoreCase(firstName)) {
            throw new InvalidUserException("Sorry, ESE is not a valid name");   // throw exception
        }


        Address address = new Address();
        address.setStreet("TestStreet-foo");
        
        User user = new User();
        //TeamName teamName = new TeamName();
        //(teamName.getUsers()).add(user);
        user.setFirstName(signupForm.getFirstName());
        user.setEmail(signupForm.getEmail());
        user.setLastName(signupForm.getLastName());
        user.setAddress(address);
        user.setTeamName(getTeamNameById(signupForm.getTeamId()));
        
        
        
        user = userDao.save(user);   // save object to DB
        //teamName = teamNameDao.save(teamName);
        
        
        // Iterable<Address> addresses = addDao.findAll();  // find all 
        // Address anAddress = addDao.findOne((long)3); // find by ID
        
        
        signupForm.setUserId(user.getUserId());
        //signupForm.setTeamNameId(user.getTeamName().getTeamId());

        return signupForm;

    }


    
    @Transactional
    public SaveTeamNameForm saveTeamName(SaveTeamNameForm saveTeamNameForm) throws InvalidUserException{
        String teamName = saveTeamNameForm.getTeamName();

        if(!StringUtils.isEmpty(teamName) && "ESE".equalsIgnoreCase(teamName)) {
            throw new InvalidUserException("Sorry, ESE is not a valid name");   // throw exception
        }

        
        TeamName team = new TeamName();
        team.setTeamName(saveTeamNameForm.getTeamName());
        team.setTimeStampTeamCreation();
        
        team = teamNameDao.save(team);   // save object to DB
        
                
        saveTeamNameForm.setId(team.getTeamId());

        return saveTeamNameForm;
    }
    
    @Transactional
    public Iterable<TeamName> getAllTeamNames(){
        
        return teamNameDao.findAll();

    }
    
    
    @Transactional
    public TeamName getTeamNameById(Long id){
        
        return teamNameDao.findOne(id);
    }
      

    @Transactional
    public User getUserById(Long id) {
        return userDao.findOne(id);
    }
}
