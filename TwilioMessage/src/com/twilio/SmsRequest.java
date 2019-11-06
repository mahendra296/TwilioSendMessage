package com.twilio;

public class SmsRequest
{
	private final String phonNumber;
	private final String message;
	

		
	public SmsRequest(String phonNumber, String message)
	{
		this.phonNumber = phonNumber;
		this.message = message;
	}
	
	public String getPhonNumber()
	{
		return phonNumber;
	}
	public String getMessage()
	{
		return message;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "SmsRequest [phonNumber=" + phonNumber + ", message=" + message + "]";
	}


	
}
