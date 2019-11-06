package com.twilio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;

public class TwilioSender implements SmsSender
{
	public static final String ACCOUNT_SID = "AC4b9d48b884219ec23240fd3374b20274";
    public static final String AUTH_TOKEN = "605fd529e27cf91a2b780180b49445f6";
    public static final String PHON_NUMBER = "+12247013868";
	
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
