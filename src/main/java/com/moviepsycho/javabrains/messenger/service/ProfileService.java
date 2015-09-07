package com.moviepsycho.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.moviepsycho.javabrains.messenger.database.DatabaseClass;
import com.moviepsycho.javabrains.messenger.model.Profile;
import com.moviepsycho.javabrains.messenger.model.Profile;

public class ProfileService {

	private Map<String,Profile> profiles= DatabaseClass.getProfiles();
	
	public ProfileService()
	{
		profiles.put("Manu", new Profile(1L,"Manu","Manu","Mishra"));
	}
	
	public List<Profile> getAllProfiles()
	{
			return new ArrayList<Profile>(profiles.values()); 
			
	}
	
	public Profile getProfile(String profileName)
	{
		return profiles.get(profileName); 
	}
	
	public Profile addProfile(Profile message)
	{
		message.setId(profiles.size()+1);
		profiles.put(message.getProfileName(),message);
		return message;
	}
	
	public Profile updateProfile(Profile message)
	{
		if(message.getProfileName().isEmpty())
			return null;
		else
			profiles.put(message.getProfileName(),message);
		return message;
	}
	
	public Profile removeProfile(String profileName)
	{
		return profiles.remove(profileName);
	}
	
	
}
