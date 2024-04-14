package org.glenchiridza.emailservice.controller;


import lombok.RequiredArgsConstructor;
import org.glenchiridza.emailservice.model.EmailDetails;
import org.glenchiridza.emailservice.service.api.EmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EmailController {
    private final EmailService emailService;

    @PostMapping("/send-mail")
    public String sendMail(
            @RequestBody EmailDetails details
            ){
        return emailService.sendSimpleMail(details);
    }
    @PostMapping("/sendmail-with-attachment")
    public String sendMailWithAttachment(@RequestBody EmailDetails details){
        return emailService.sendMailWithAttachment(details);
    }
}
