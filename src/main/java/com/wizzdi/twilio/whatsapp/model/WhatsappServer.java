package com.wizzdi.twilio.whatsapp.model;

import com.flexicore.iot.ExternalServer;

import javax.persistence.Entity;

@Entity
public class WhatsappServer extends ExternalServer {
    private String twilioAccountSid;
    private String authenticationToken;


    public String getTwilioAccountSid() {
        return twilioAccountSid;
    }

    public <T extends WhatsappServer> T setTwilioAccountSid(String twilioAccountSid) {
        this.twilioAccountSid = twilioAccountSid;
        return (T) this;
    }

    public String getAuthenticationToken() {
        return authenticationToken;
    }

    public <T extends WhatsappServer> T setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
        return (T) this;
    }
}
