package com.lucid.signup.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucid.signup.model.FamilyType;
import com.lucid.signup.model.User;
import com.lucid.signup.service.IUserManager;
import com.lucid.signup.utilities.Strings;

@RestController
@RequestMapping("/api/v1/user/")
public class UserController {
	@Autowired
	private IUserManager userManager;
	
	//for email validation
    private final String emailFormat = "^(.+)@(.+)$";
	
	@PostMapping("signUp")
	public ResponseEntity<Object> signUp(@RequestBody User user) {
		List <String> errors=null; 
		if(!user.isValidated()) {
		errors=validateUser(user);
		}
		if(errors!=null&&errors.size()>0) {
			return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok(userManager.signUp(user));
		
	}

	@SuppressWarnings("unlikely-arg-type")
	private List<String> validateUser(User user) {
        List<String> errors = new ArrayList<>();
        if (Strings.isNullOrEmpty(user.getEmailId())) {
            errors.add("emailId mandatory");
        }
        else if(!isValidMail(user.getEmailId())){
            errors.add("Invalid email format");
        }
        if(Strings.isNullOrEmpty(user.getFirstName())){
            errors.add("FirstName mandatory");
        }
        if(Strings.isNullOrEmpty(user.getLastName())){
            errors.add("LastName mandatory");
        }
        if(Strings.isNullOrEmpty(user.getMobileNumber())) {
        	errors.add("MobiNumber mandatory");
        }
        if(user.getGender()==null) {
        	errors.add("Please Select Gender");
        }
        if(user.getFamilyType()==null) {
        	errors.add("Please Select Family Type");
        }
        else {
        
        	if(user.getFamilyType().equals(FamilyType.PARENTS)) {
        		if(Strings.isNullOrEmpty(user.getFatherName())) {
        			errors.add("Please Enter Father Name");
        		}
        		if(Strings.isNullOrEmpty(user.getMotherName())) {
        			errors.add("Please Enter Mother Name");
        		}      	
        	}
        	else if(user.getFamilyType().equals(FamilyType.SPOUSE)) {
        		if(Strings.isNullOrEmpty(user.getSpouseName())) {
        			errors.add("Please Enter Spouse Name");
        		}
        	}
        	else if(user.getFamilyType().equals(FamilyType.GARDIEN)) {
        		if(Strings.isNullOrEmpty(user.getGardienName())) {
        			errors.add("Please Enter Gardien Name");
        		}
        	}
        }
        return errors;
    }

    //validate given emil format
    private boolean isValidMail(String userId) {
        Pattern emailPattern = Pattern.compile(emailFormat);
        if(emailPattern.matcher(userId).matches())
            return true;
        else
            return false;
    }

	

}
