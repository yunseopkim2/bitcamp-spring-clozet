package kr.co.clozet.soccer.repositories;

import kr.co.clozet.soccer.domains.Player;
import kr.co.clozet.soccer.domains.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

interface ScheduleCustomRepository{
    // 스케줄 날짜만 수정이 되도록 하시오

}

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long>, ScheduleCustomRepository{
}
