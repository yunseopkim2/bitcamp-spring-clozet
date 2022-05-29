package kr.co.clozet.soccer.services;

import kr.co.clozet.soccer.domains.Player;
import kr.co.clozet.soccer.domains.Schedule;
import kr.co.clozet.soccer.domains.Stadium;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface StadiumService {

    List<Stadium> findAll();

    List<Stadium> findAll(Sort sort);

    Page<Stadium> findAll(Pageable pageable);

    long count();

    String put(Stadium stadium);

    String delete(Stadium stadium);

    String save(Stadium stadium);

    Optional<Stadium> findById(String stadiumid);

    boolean existsById(String stadiumid);

    // custom
    List<Stadium> findByStadiumName(String name);
}