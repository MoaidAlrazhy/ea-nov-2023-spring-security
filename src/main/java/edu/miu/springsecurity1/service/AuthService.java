package edu.miu.springsecurity1.service;

import edu.miu.springsecurity1.entity.User;
import edu.miu.springsecurity1.entity.dto.request.LoginRequest;
import edu.miu.springsecurity1.entity.dto.request.SignUpRequest;
import edu.miu.springsecurity1.entity.dto.response.LoginResponse;
import edu.miu.springsecurity1.entity.dto.request.RefreshTokenRequest;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);

    LoginResponse signup(SignUpRequest loginRequest);

    String validate(SignUpRequest signUpRequest);

    User getCurrentUser();
}
