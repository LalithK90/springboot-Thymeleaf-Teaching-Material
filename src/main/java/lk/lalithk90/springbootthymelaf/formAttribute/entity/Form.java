package lk.lalithk90.springbootthymelaf.formAttribute.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Form {

    private String simpleText;
    private String textArea;
    private LocalDate localDate;
    private LocalDateTime localDateTime;
    private String colour;
    private SingleValueCheckBox singleValueCheckBox;
    private List<MultiValueCheckBox> multiValueCheckBoxList;
    private RadioButton radioButton;
    private List<DropDown> dropDownList;

    /* Validation java - constraint */
   /* @Email()
    @NotNull()
    @Null()
    @DecimalMax()
    @DecimalMin()
    @Size
    @Max()
    @Min()
    @Pattern()*/

}
