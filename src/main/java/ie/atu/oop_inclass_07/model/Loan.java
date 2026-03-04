package ie.atu.oop_inclass_07.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loan {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    @NotBlank(message = "Error Loan must have a tag")@Min(value = 0)@Max(value = 100)
    private long loanTag;
    @NotBlank(message = "Error loan must have a name")@Length(max = 27)
    private String loanName;
    @NotBlank(message = "Error please enter a loan Id")
    private double loanId;
    @NotBlank@Min(value = 0)@Max(value = 100)
    private double loanRate;
    @Positive(message = "Please enter a positive loan period above 0")@Min(value = 1)@Max(value = 10)
    private double loanPeriod;
    @Email(message = "Please enter a valid email address")
    private String email;




}
