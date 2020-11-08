package com.wizzdi.twilio.whatsapp.model;

import com.flexicore.iot.ExternalServer;
import com.flexicore.security.SecurityContext;

import javax.persistence.Entity;

@Entity
public class WhatsappServer extends ExternalServer {
    private String twilioAccountSid;
    private String authenticationToken;


    public WhatsappServer() {
    }

    public WhatsappServer(String name, SecurityContext securityContext) {
        super(name, securityContext);
    }

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
