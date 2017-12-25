package com.face;

import com.face.constants.Constants;
import com.face.persongroup.PersonGroup;

public class App
{
    public static void main(String[] args)
    {
    	PersonGroup personGroup = new PersonGroup();
    	personGroup.getAllPersonsInPersonGroup(Constants.getPersonGroupId());
    
    }
}