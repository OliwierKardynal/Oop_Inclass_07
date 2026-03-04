package ie.atu.oop_inclass_07.service;


import ie.atu.oop_inclass_07.controller.BorrowController;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data

@AllArgsConstructor
@Service
public class BorrowService<Borrow> {
    private final BorrowController borrowController;
    private final List<Borrow> loans = new ArrayList<>();
    private long loanId;
    private long loanTag;
    private String studentEmail;
    private String loanDate;
    private long startHour;
    private long durationHours;

   public Borrow addx(BorrowService borrow) {
       int nextId;
       borrow.setLoanId(loanId);
       borrow.setStudentEmail(studentEmail);
       borrow.setLoanDate(loanDate);
       borrow.setStartHour(startHour);
       borrow.setDurationHours(durationHours);
       borrow.addx(borrow);
       Borrow Borrow = null;
       return Borrow;
   }
   public List<Borrow>getAllborrow(){
       return Borrow;
   }


}
