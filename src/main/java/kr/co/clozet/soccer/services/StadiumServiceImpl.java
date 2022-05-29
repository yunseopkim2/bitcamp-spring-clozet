package kr.co.clozet.soccer.services;

import kr.co.clozet.soccer.domains.Stadium;
import kr.co.clozet.soccer.repositories.StadiumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StadiumServiceImpl implements StadiumService{

    private final StadiumRepository repository;

    @Override
    public List<Stadium> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Stadium> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Stadium> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String put(Stadium stadium) {
        return "";
    }

    @Override
    public String delete(Stadium stadium) {
        repository.delete(stadium);
        return "";
    }

    @Override
    public String save(Stadium stadium) {
        repository.save(stadium);
        return "";
    }

    @Override
    public Optional<Stadium> findById(String stadiumid) {
        return repository.findById(0L);
    }

    @Override
    public boolean existsById(String stadiumid) {
        return repository.existsById(0L);
    }

    @Override
    public List<Stadium> findByStadiumName(String name) {
        return null;
    }
}
