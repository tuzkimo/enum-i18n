package com.example.enumi18n;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class StatusController {

    @GetMapping("status")
    public ResponseEntity<?> getAllAvailableStatus() {
        return ResponseEntity.ok(
                Arrays
                        .stream(Status.values())
                        .collect(Collectors.toMap(Enum::name, Status::toString))
        );
    }
}
