package kr.co.clozet.soccer.services;

import kr.co.clozet.soccer.domains.Player;
import kr.co.clozet.soccer.domains.Schedule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface ScheduleService {

    List<Schedule> findAll();

    List<Schedule> findAll(Sort sort);

    Page<Schedule> findAll(Pageable pageable);

    long count();

    String put(Schedule schedule);

    String delete(Schedule schedule);

    String save(Schedule schedule);

    Optional<Schedule> findById(String Schedule);

    boolean existsById(String Schedule);

    // custom
    List<Schedule> findByScheduleName(String name);
}
