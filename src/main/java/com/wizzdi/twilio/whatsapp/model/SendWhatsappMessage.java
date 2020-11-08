package com.wizzdi.twilio.whatsapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.flexicore.interfaces.dynamic.IdRefFieldInfo;
import com.flexicore.model.dynamic.ExecutionParametersHolder;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Transient;

@Entity
public class SendWhatsappMessage extends ExecutionParametersHolder {

    private String sendFrom;
    private String sendTo;
    @Lob
    private String content;
    @IdRefFieldInfo(refType = WhatsappServer.class,list = false,mandatory = true,displayName = "whatsapp server")
    private String whatsAppServerId;
    @JsonIgnore
    @Transient
    private WhatsappServer whatsappServer;

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

    public String getWhatsAppServerId() {
        return whatsAppServerId;
    }

    public <T extends SendWhatsappMessage> T setWhatsAppServerId(String whatsAppServerId) {
        this.whatsAppServerId = whatsAppServerId;
        return (T) this;
    }

    @JsonIgnore
    @Transient
    public WhatsappServer getWhatsappServer() {
        return whatsappServer;
    }

    public <T extends SendWhatsappMessage> T setWhatsappServer(WhatsappServer whatsappServer) {
        this.whatsappServer = whatsappServer;
        return (T) this;
    }
}
