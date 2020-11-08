package com.wizzdi.twilio.whatsapp.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.flexicore.data.jsoncontainers.Views;
import com.flexicore.iot.ExternalServer;
import com.flexicore.security.SecurityContext;

import javax.persistence.Entity;

@Entity
public class WhatsappServer extends ExternalServer {
    @JsonView(Views.ForSwaggerOnly.class)
    private String twilioAccountSid;
    @JsonView(Views.ForSwaggerOnly.class)
    private String authenticationToken;


    public WhatsappServer() {
    }

    public WhatsappServer(String name, SecurityContext securityContext) {
        super(name, securityContext);
    }

    @JsonView(Views.ForSwaggerOnly.class)
    public String getTwilioAccountSid() {
        return twilioAccountSid;
    }

    public <T extends WhatsappServer> T setTwilioAccountSid(String twilioAccountSid) {
        this.twilioAccountSid = twilioAccountSid;
        return (T) this;
    }

    @JsonView(Views.ForSwaggerOnly.class)
    public String getAuthenticationToken() {
        return authenticationToken;
    }

    public <T extends WhatsappServer> T setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
        return (T) this;
    }
}
