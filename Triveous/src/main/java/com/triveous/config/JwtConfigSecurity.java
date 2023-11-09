package com.triveous.config;
import javax.crypto.SecretKey;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import io.jsonwebtoken.security.Keys;
import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "application.jwt")
@Data
public class JwtConfigSecurity {

    @NotBlank
    private String secretKey;

    @NotBlank
    private String tokenPrefix;

    @Positive
    private int tokenExpirationAfterDays;

    public SecretKey getSecretKey() {
        return Keys.hmacShaKeyFor(secretKey.getBytes());
    }
}
