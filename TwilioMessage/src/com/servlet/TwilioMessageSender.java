package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.twilio.SmsRequest;
import com.twilio.TwilioSender;

/**
 * Servlet implementation class TwilioMessageSender
 */
@WebServlet("/TwilioMessageSender")
public class TwilioMessageSender extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public TwilioMessageSender() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phonNumber = request.getParameter("number");
		String message = request.getParameter("message");
		SmsRequest smsRequest = new SmsRequest(phonNumber, message);
		System.out.println("Hello"+phonNumber +"Message : "+ message);
		TwilioSender twilioSender = new TwilioSender();
		
		twilioSender.sendSms(smsRequest);
		
		System.out.println("Send success");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		doGet(request, response);
	}

}
