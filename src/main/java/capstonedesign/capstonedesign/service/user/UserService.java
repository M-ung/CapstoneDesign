package capstonedesign.capstonedesign.service.user;


import capstonedesign.capstonedesign.dto.token.TokenDTO;
import capstonedesign.capstonedesign.entity.user.User;
import capstonedesign.capstonedesign.repository.user.UserRepository;
import capstonedesign.capstonedesign.utils.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;

    @Value("${jwt.secret}")
    private String secretKey;
    private final Long expiredMs = 1000 * 60 * 60L; // 1 hour

//
//    public TokenDTO login(UserDTO userDTO) {
//        Optional<User> userOptional = userRepository.findByUserEmail(userDTO.getUserEmail());
//        if (userOptional.isPresent()) {
//            User user = userOptional.get();
//            if (passwordEncoder.matches(userDTO.getUserPassword(), user.getUserPassword())) {
//                return new TokenDTO(JwtUtil.createJwt(user.getUserEmail(), secretKey, expiredMs));
//            }
//        }
//        return null;
//    }
}
