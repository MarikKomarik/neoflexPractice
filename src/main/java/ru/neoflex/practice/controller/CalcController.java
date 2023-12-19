package ru.neoflex.practice.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@OpenAPIDefinition(info = @Info(title = "Calc API", version = "1.0", description = "Для складывания или вычитания чисел"))
public class CalcController {
    @GetMapping("/plus/{a}/{b}")
    public Integer sum(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        return a + b;
    }
    @GetMapping("/minus/{a}/{b}")
    public Integer difference(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        return a - b;
    }
}
