package capstonedesign.capstonedesign.repository.user;


import capstonedesign.capstonedesign.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}