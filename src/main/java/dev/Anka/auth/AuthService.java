package dev.Anka.auth;

//import dev.Anka.jwt.JwtService;
import dev.Anka.user.Role;
import dev.Anka.user.User;
import dev.Anka.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository repository;
    private PasswordEncoder passwordEncoder;

    public AuthResponse register(RegisterRequest request) {
        User user = User.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .email(request.getEmail())
                .dateJoined(LocalDateTime.now())
                .role(Role.USER)
                .build();

        repository.save(user);

        return AuthResponse.builder()
                .message("User connected: ")
                .username(user.getUsername())
                .build();
    }
}
