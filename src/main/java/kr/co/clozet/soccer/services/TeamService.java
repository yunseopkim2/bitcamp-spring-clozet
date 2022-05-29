package kr.co.clozet.soccer.services;

import kr.co.clozet.soccer.domains.Stadium;
import kr.co.clozet.soccer.domains.Team;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface TeamService {

    List<Team> findAll();

    List<Team> findAll(Sort sort);

    Page<Team> findAll(Pageable pageable);

    long count();

    String put(Team team);

    String delete(Team team);

    String save(Team team);

    Optional<Team> findById(String teamid);

    boolean existsById(String teamid);

    // custom
    List<Team> findByTeamName(String name);
}