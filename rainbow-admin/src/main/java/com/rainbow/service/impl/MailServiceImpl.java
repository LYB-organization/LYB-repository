package com.rainbow.service.impl;

import com.rainbow.model.dto.SendHtmlMailDTO;
import com.rainbow.model.dto.SendMailWithAttchmentDTO;
import com.rainbow.model.dto.SendMailWithStaticDTO;
import com.rainbow.model.dto.SendSimpleMailDTO;
import com.rainbow.service.MailService;
import org.springframework.stereotype.Service;

/**
 * author  dengjie9527
 * date 2019/9/30
 */
@Service
public class MailServiceImpl implements MailService {
    @Override
    public void sendSimpleMail(SendSimpleMailDTO dto) {

    }

    @Override
    public void sendHtmlMail(SendHtmlMailDTO dto) {

    }

    @Override
    public void sendMailWithAttchment(SendMailWithAttchmentDTO dto) {

    }

    @Override
    public void sendMailWithStatic(SendMailWithStaticDTO dto) {

    }
}
