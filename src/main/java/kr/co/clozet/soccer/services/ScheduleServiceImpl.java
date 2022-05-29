package kr.co.clozet.soccer.services;


import kr.co.clozet.soccer.domains.Player;
import kr.co.clozet.soccer.domains.Schedule;
import kr.co.clozet.soccer.repositories.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository repository;

    @Override
    public List<Schedule> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Schedule> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Schedule> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String put(Schedule schedule) {
        return "";
    }

    @Override
    public String delete(Schedule schedule) {
        repository.delete(schedule);
        return "";
    }

    @Override
    public String save(Schedule schedule) {
        repository.save(schedule);
        return "";
    }

    @Override
    public Optional<Schedule> findById(String Schedule) {
        return repository.findById(0L);
    }

    @Override
    public boolean existsById(String Schedule) {
        return repository.existsById(0L);
    }

    @Override
    public List<Schedule> findByScheduleName(String name) {
        return null;
    }
}