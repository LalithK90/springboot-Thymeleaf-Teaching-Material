package lk.lalithk90.springbootthymelaf.employee.service;

import lk.lalithk90.springbootthymelaf.employee.dao.WeekDayDao;
import lk.lalithk90.springbootthymelaf.employee.entity.WeekDay;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeekDayService {
    private final WeekDayDao weekDayDao;

    public WeekDayService(WeekDayDao weekDayDao) {
        this.weekDayDao = weekDayDao;
    }

    public List< WeekDay > findAll() {
        return weekDayDao.findAll();
    }
}
