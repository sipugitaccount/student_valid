package Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank
        @Size(min = 3)
        private String firstName;

        @NotBlank
        @Size(min = 3)
        private String lastName;

        @NotNull
        @Past
        private LocalDate dob;

        @Min(16)
        @Max(20)
        private int age;

        @Min(0)
        @Max(100)
        private Integer marks;

        @NotBlank
        @Pattern(regexp = "[ABC]")
        private String section;

        @Pattern(regexp = "[MF]")
        private String gender;

        private int totalMarks;
        private double averageMarks;
        private String result;


}


