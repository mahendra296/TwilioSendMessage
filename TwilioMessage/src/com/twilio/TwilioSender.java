package com.twilio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;

public class TwilioSender implements SmsSender
{
    public static final String ACCOUNT_SID = "<ACCOUNT_SID>";
    public static final String AUTH_TOKEN = "<AUTH_TOKEN>";
    public static final String PHON_NUMBER = "<TWILIO_PHON_NUMBER>";
	
    @Override
	public void sendSms(SmsRequest smsRequest)
	{
    	try{
    	Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    	System.out.println(smsRequest.getPhonNumber() + "Authinticated++++" + PHON_NUMBER);
		
  
    	PhoneNumber to = new PhoneNumber(smsRequest.getPhonNumber());
    	PhoneNumber from = new PhoneNumber(PHON_NUMBER);
    	String message = smsRequest.getMessage();
    	MessageCreator creator = Message.creator(to, from, message);
    	
    	creator.create();
    	}
    	catch(Exception e){System.out.println(e);
    		
    	}
    	}

}
