package ie.atu.oop_inclass_07.repository;

import ie.atu.oop_inclass_07.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
}