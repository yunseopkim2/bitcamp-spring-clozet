package kr.co.clozet.clozet.services;

import kr.co.clozet.auth.configs.AuthProvider;
import kr.co.clozet.auth.domains.Messenger;
import kr.co.clozet.auth.exception.SecurityRuntimeException;
import kr.co.clozet.clozet.domains.Users;
import kr.co.clozet.clozet.domains.UserDTO;
import kr.co.clozet.clozet.repositories.UserRepository;
import kr.co.clozet.lambda.dataStructure.Box;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static kr.co.clozet.lambda.Lambda.*;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final PasswordEncoder encoder;
    private final AuthProvider provider;
    private final ModelMapper modelMapper;
    //모델이랑 엔티티를 바꿔주는것

    @Override
    public UserDTO login(UserDTO paramUser) {
        try{
            UserDTO returnUser = new UserDTO();
            String username = paramUser.getUsername();
            Users findUser = repository.findByUsername(username).orElse(null);
            if (findUser != null){
                boolean checkPassword = encoder.matches(paramUser.getPassword(), findUser.getPassword());
                if (checkPassword){
                    returnUser = modelMapper.map(findUser, UserDTO.class);
                    String token = provider.createTokken(username, returnUser.getRoles());
                    returnUser.setToken(token);

                }else {
                    String token = "FAILURE";
                    returnUser.setToken(token);
                }
            }else {
                returnUser.setToken("FAILURE");
            }
            return returnUser;
        }catch (Exception e){
            throw new SecurityRuntimeException("유효하지 않은 아이디/비밀번호", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    @Override
    public Messenger logout() {
        return Messenger.builder().build();
    }


    @Override
    public List<Users> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Users> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Users> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Messenger count() {
        return Messenger.builder().message(string(repository.count())).build();

    }

    @Override
    public Messenger update(Users user) {
        return Messenger.builder().build();
    }
    @Override
    public Messenger delete(Users user) {
        repository.delete(user);
       return Messenger.builder().build();
    }

    @Override
    public Messenger save(UserDTO user) {
        return null;
    }


    @Override
    public Optional<Users> findById(String userid) {
        return Optional.empty();
    }

    @Override
    public Messenger existsById(String userid) {
        return repository.existsById(longParse(userid))
                ? Messenger.builder().message("EXIST").build()
                : Messenger.builder().message("NOT_EXIST").build();
    }

    @Override
    public Messenger getOne(Long id) {
        return null;
    }

    @Override
    public List<Users> findByUserName(String name) {
        List<Users> ls = repository.findAll();
        Box<String, Users> box = new Box<>();
        //ls = box.findByUserName(ls, name);
        //ls.stream().filter(...);
        return null;

    }
}
