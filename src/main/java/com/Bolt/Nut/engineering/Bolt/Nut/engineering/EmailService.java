package com.Bolt.Nut.engineering.Bolt.Nut.engineering;

//package com.Bolt.Nut.engineering.Bolt.Nut.engineering;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender mailSender;

    // This pulls your email from application.properties
    @Value("${spring.mail.username}")
    private String fromEmail;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendInquiryEmail(Inquiry inquiry) {
        SimpleMailMessage message = new SimpleMailMessage();
        
        // This MUST be the authenticated email address (mwboltne@mweb.co.za)    
        message.setFrom(fromEmail);
        message.setTo("mwboltne@mweb.co.za"); //reciever 
        message.setSubject("New Product Inquiry: " + inquiry.getProduct());
        
        String content = String.format(
            "Customer Details:\n" +
            "Name: %s\n" +
            "Email: %s\n" +
            "Phone: %s\n\n" +
            "Order Details:\n" +
            "Product: %s\n" +
            "Quantity: %s\n" +
            "Fulfillment: %s\n" +
            "Address: %s\n\n" +
            "Message:\n%s",
            inquiry.getName(), inquiry.getEmail(), inquiry.getPhone(),
            inquiry.getProduct(), inquiry.getQuantity(), inquiry.getFulfillment(),
            inquiry.getAddress(), inquiry.getMessage()
        );

        message.setText(content);
        mailSender.send(message);
    }
}
