package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Admin;
import com.rijai.LocationApi.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Base64;

@Service
public class OAuthService {

    @Autowired
    private AdminRepository adminRepository;

    // Implement Encryption Layer. It is because this usually happens on the
    // View (Presentation) Layer
    private static final SecureRandom secureRandom = new SecureRandom();
    private static final Base64.Encoder base64enocder = Base64.getUrlEncoder();

    public Admin register(Admin admin) {
        // Now, begin comparing locally and remotely based on the fetch records
        return null;
    }

}
