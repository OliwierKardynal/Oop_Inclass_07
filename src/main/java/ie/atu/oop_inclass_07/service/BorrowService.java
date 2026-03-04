package ie.atu.oop_inclass_07.service;


import ie.atu.oop_inclass_07.controller.BorrowController;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BorrowService {
    private final List<LoanList> loans new ArrayList<>();
    private long loanId;

}
