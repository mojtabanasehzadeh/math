package com.rapid.math.api;

import com.rapid.math.service.MathLibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rapid/api/factorial")
public class MathLibController {

    private final MathLibService mathLibService;

    @Autowired
    public MathLibController(MathLibService mathLibService) {
        this.mathLibService = mathLibService;
    }

    @GetMapping("/{n}")
    public long getFactorial(@PathVariable int n) {
        return mathLibService.factorial(n);
    }

    @GetMapping("/uneven/{n}")
    public long getUnevenFactorial(@PathVariable int n) {
        return mathLibService.unevenFactorial(n);
    }

    @GetMapping("/square/{n}")
    public long getSquareFactorial(@PathVariable int n) {
        return mathLibService.squareFactorial(n);
    }
}