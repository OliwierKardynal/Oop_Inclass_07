package ie.atu.oop_inclass_07.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanId;

    @NotNull(message = "Error: Loan must have a tag")
    @Min(value = 0, message = "Loan tag must be at least 0")
    @Max(value = 100, message = "Loan tag must be at most 100")
    private Long loanTag;

    @NotBlank(message = "Error: Loan must have a name")
    private String loanName;

    @NotNull(message = "Error: Please enter a loan rate")
    @DecimalMin(value = "0.0", message = "Loan rate must be at least 0")
    @DecimalMax(value = "100.0", message = "Loan rate must be at most 100")
    private Double loanRate;

    @NotNull(message = "Please enter a positive loan period above 0")
    @Min(value = 1, message = "Loan period must be at least 1")
    @Max(value = 10, message = "Loan period must be at most 10")
    private Integer loanPeriod;

    @NotBlank(message = "Please enter an email address")
    @Email(message = "Please enter a valid email address")
    private String email;
}