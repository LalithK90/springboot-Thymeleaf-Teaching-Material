package lk.lalithk90.springbootthymelaf.employeeCrud.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.dao.WeekDayRepository;
import lk.lalithk90.springbootthymelaf.employeeCrud.entity.WeekDay;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeekDayService {
    private final WeekDayRepository weekDayRepository;

    public WeekDayService(WeekDayRepository weekDayRepository) {
        this.weekDayRepository = weekDayRepository;
    }

    public List< WeekDay > findAll() {
        return weekDayRepository.findAll();
    }
}
