package kr.co.clozet.clozet.services;

import kr.co.clozet.auth.domains.Messenger;
import kr.co.clozet.clozet.domains.Clothes;
import kr.co.clozet.clozet.domains.User;
import kr.co.clozet.clozet.repositories.ClothesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static kr.co.clozet.lambda.Lambda.string;

/**
 * packageName    : kr.co.clozet.clozet.services
 * fileName       : ClothesServiceImpl
 * author         : kimyunseop
 * date           : 2022-05-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-31        kimyunseop       최초 생성
 */
@RequiredArgsConstructor
@Service
public class ClothesServiceImpl implements ClothesService{
    private final ClothesRepository repository;
    @Override
    public List<Clothes> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Clothes> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Clothes> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Messenger count() {
        return Messenger.builder().message(string(repository.count())).build();
    }

    @Override
    public Messenger delete(Clothes clothes) {
        repository.delete(clothes);
        return Messenger.builder().build();
    }

    @Override
    public Messenger save(Clothes clothes) {
        return null;
    }

    @Override
    public Optional<Clothes> findByDate(String date) {
        return Optional.empty();
    }

    @Override
    public Messenger existsById(String userid) {
        return null;
    }

    @Override
    public Messenger getOne(Long id) {
        return null;
    }

    @Override
    public Optional<Clothes> findByUserId(String userId) {
        return null;
    }

    @Override
    public Messenger update(Clothes clothes) {
        return null;
    }
}
