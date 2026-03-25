package ie.atu.oop_inclass_07.service;

import ie.atu.oop_inclass_07.model.Loan;
import ie.atu.oop_inclass_07.repository.LoanRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowService {

    private final LoanRepository loanRepository;

    public BorrowService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public Loan add(Loan loan) {
        return loanRepository.save(loan);
    }

    public List<Loan> getAllBorrow() {
        return loanRepository.findAll();
    }

    public Loan getById(Long id) {
        return loanRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Loan not found with id: " + id));
    }
}