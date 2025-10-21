package br.edu.infnet.games;

import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.edu.infnet.games.model.domain.User;
import br.edu.infnet.games.model.repository.UserRepository;

@org.springframework.context.annotation.Configuration
public class UserLoader {
    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository, PasswordEncoder encoder) {
        return args -> {
            if (userRepository.count() == 0) {
                userRepository.save(new User("admin", encoder.encode("admin123"), Set.of("ADMIN")));
                userRepository.save(new User("user", encoder.encode("user123"), Set.of("USER")));
            }
        };
    }
}
