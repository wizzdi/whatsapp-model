package com.wizzdi.twilio.whatsapp.model;

import com.flexicore.model.dynamic.ExecutionParametersHolder;

import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
public class SendWhatsappMessage extends ExecutionParametersHolder {

    private String sendFrom;
    private String sendTo;
    @Lob
    private String content;

    public String getSendFrom() {
        return sendFrom;
    }

    public <T extends SendWhatsappMessage> T setSendFrom(String sendFrom) {
        this.sendFrom = sendFrom;
        return (T) this;
    }

    public String getSendTo() {
        return sendTo;
    }

    public <T extends SendWhatsappMessage> T setSendTo(String sendTo) {
        this.sendTo = sendTo;
        return (T) this;
    }

    @Lob
    public String getContent() {
        return content;
    }

    public <T extends SendWhatsappMessage> T setContent(String content) {
        this.content = content;
        return (T) this;
    }
}
