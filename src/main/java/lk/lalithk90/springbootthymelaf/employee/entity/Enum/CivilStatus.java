package lk.lalithk90.springbootthymelaf.employee.entity.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CivilStatus {
    MARRIED("Married"),
    WINDOW("Window"),
    UNMARRIED("Unmarried");

    private String civilStatus;
}
