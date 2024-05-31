package com.ksilisk.virdeanoffauthserver.repository;

import com.ksilisk.virdeanoffauthserver.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
import org.springframework.security.oauth2.server.authorization.settings.TokenSettings;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static org.springframework.security.oauth2.core.AuthorizationGrantType.CLIENT_CREDENTIALS;
import static org.springframework.security.oauth2.core.ClientAuthenticationMethod.CLIENT_SECRET_BASIC;
import static org.springframework.security.oauth2.core.ClientAuthenticationMethod.CLIENT_SECRET_POST;

@Slf4j
@Component
@RequiredArgsConstructor
public class CustomRegisteredClientRepository implements RegisteredClientRepository {
    private final UserRepository userRepository;

    @Override
    public void save(RegisteredClient registeredClient) {
        log.warn("Saving client not work at this impl");
    }

    @Override
    public RegisteredClient findById(String id) {
        log.warn("This functionality not user yet. Null be returned");
        return null;
    }

    @Override
    public RegisteredClient findByClientId(String clientId) {
        Optional<User> optionalUser = userRepository.findByUserLogin(clientId);
        if (optionalUser.isEmpty()) {
            return null;
        }
        User user = optionalUser.get();
        return RegisteredClient.withId(user.getUserId().toString())
                .tokenSettings(TokenSettings.builder().build())
                .clientId(clientId)
                .scope(user.getRole().name())
                .authorizationGrantType(CLIENT_CREDENTIALS)
                .clientSecret(user.getUserPassword())
                .clientAuthenticationMethods(methods -> methods.addAll(List.of(CLIENT_SECRET_POST, CLIENT_SECRET_BASIC)))
                .build();
    }
}
