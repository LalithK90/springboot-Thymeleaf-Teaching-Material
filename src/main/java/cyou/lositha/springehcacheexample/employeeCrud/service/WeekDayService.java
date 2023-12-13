package cyou.lositha.springehcacheexample.employeeCrud.service;

import cyou.lositha.springehcacheexample.employeeCrud.dao.WeekDayRepository;
import cyou.lositha.springehcacheexample.employeeCrud.entity.WeekDay;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeekDayService {
    private final WeekDayRepository weekDayRepository;

    public WeekDayService(WeekDayRepository weekDayRepository) {
        this.weekDayRepository = weekDayRepository;
    }

    public List<WeekDay> findAll() {
        return weekDayRepository.findAll();
    }
}
