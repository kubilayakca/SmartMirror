package com.face.persongroup;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;

import com.face.constants.Constants;
import com.face.httprequests.HttpRequests;

public class PersonGroup {
	// The valid characters for the personGroupName below include numbers, English letters in lower case, '-', and '_'.
	public void createNewPersonGroup(String personGroupName)
	{
		try
		{
			HttpPut request = new HttpPut(new URIBuilder(Constants.getCreateNewPersonGroupUrl(personGroupName)).build());
			request.setEntity(new StringEntity("{ \"name\":\""+ personGroupName +"\",\"userData\":\"Person Group\" }"));
			request.setHeader("Content-Type", "application/json");
			HttpRequests.SendRequest(request);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void getAllPersonsInPersonGroup(String personGroupName)
	{
		try
		{
			HttpGet request = new HttpGet(new URIBuilder(Constants.getPersonResourceUrl(personGroupName)).build());
			HttpRequests.SendRequest(request);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void createNewPersonInPersonGroup(String personGroupName)
	{
		try
		{
			HttpGet request = new HttpGet(new URIBuilder(Constants.getPersonResourceUrl(personGroupName)).build());
			HttpRequests.SendRequest(request);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
