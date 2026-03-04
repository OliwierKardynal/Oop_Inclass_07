package ie.atu.oop_inclass_07.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loan {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private long loanId;
}
