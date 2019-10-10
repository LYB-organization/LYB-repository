package com.rainbow.service;

import com.rainbow.model.dto.SendHtmlMailDTO;
import com.rainbow.model.dto.SendMailWithAttchmentDTO;
import com.rainbow.model.dto.SendMailWithStaticDTO;
import com.rainbow.model.dto.SendSimpleMailDTO;

/**
 * 邮件服务相关接口
 * author  dengjie9527
 * date 2019/9/30
 */
public interface MailService {

    /**
     * 发送简单邮件接口
     * @param dto
     */
    void sendSimpleMail(SendSimpleMailDTO dto);

    /**
     * 发送html格式邮件
     * @param dto
     */
    void sendHtmlMail(SendHtmlMailDTO dto);

    /**
     * 发送带附件的邮件
     * @param dto
     */
    void sendMailWithAttchment(SendMailWithAttchmentDTO dto);

    /**
     * 发送带静态资源的邮件
     * @param dto
     */
    void sendMailWithStatic(SendMailWithStaticDTO dto);
}
