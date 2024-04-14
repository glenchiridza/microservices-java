package org.glenchiridza.emailservice.service.api;

import org.glenchiridza.emailservice.model.EmailDetails;

public interface EmailService {

    String sendSimpleMail(EmailDetails details);

    String sendMailWithAttachment(EmailDetails details);

}
