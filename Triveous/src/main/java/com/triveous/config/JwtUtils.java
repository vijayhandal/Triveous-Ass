package com.triveous.config;

import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtils {

	 public static String generateToken(String username, JwtConfigSecurity jwtConfig) {
	        return Jwts.builder()
	                .setSubject(username)
	                .setIssuedAt(new Date())
	                .setExpiration(new Date(System.currentTimeMillis() + jwtConfig.getTokenExpirationAfterDays() * 24 * 60 * 60 * 1000))
	                .signWith(jwtConfig.getSecretKey(), SignatureAlgorithm.HS256)
	                .compact();
	    }
}

