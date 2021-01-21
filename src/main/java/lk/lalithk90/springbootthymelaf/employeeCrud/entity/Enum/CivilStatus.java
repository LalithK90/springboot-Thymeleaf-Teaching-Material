package lk.lalithk90.springbootthymelaf.employeeCrud.entity.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CivilStatus {
    MARRIED("Married"),
    WIDOW("Widow"),
    UNMARRIED("Unmarried");

    private String civilStatus;
}
