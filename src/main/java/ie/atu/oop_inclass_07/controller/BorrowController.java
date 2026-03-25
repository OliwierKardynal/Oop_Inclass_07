package ie.atu.oop_inclass_07.controller;

import ie.atu.oop_inclass_07.model.Loan;
import ie.atu.oop_inclass_07.service.BorrowService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrow")
public class BorrowController {

    private final BorrowService borrowService;

    public BorrowController(BorrowService borrowService) {
        this.borrowService = borrowService;
    }

    @PostMapping
    public ResponseEntity<Loan> add(@Valid @RequestBody Loan loan) {
        Loan saved = borrowService.add(loan);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping
    public ResponseEntity<List<Loan>> getAll() {
        return ResponseEntity.ok(borrowService.getAllBorrow());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Loan> getById(@PathVariable Long id) {
        return ResponseEntity.ok(borrowService.getById(id));
    }
}