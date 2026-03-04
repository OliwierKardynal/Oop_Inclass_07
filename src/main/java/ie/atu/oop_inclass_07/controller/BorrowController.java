package ie.atu.oop_inclass_07.controller;

import ie.atu.oop_inclass_07.service.BorrowService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;
@RestController
@RequestMapping("/Borrow")
public class BorrowController {
    private final BorrowService borrowService;
    public BorrowController(BorrowService borrowService) {
        this.borrowService = borrowService;
    }
   @PostMapping
    public ResponseEntity<BorrowService>addx(@Valid@RequestBody BorrowService borrow) {
       BorrowController saved = BorrowService.addx(borrow);
        return ResponseEntity.status(CREATED).body(saved);

   }
}

