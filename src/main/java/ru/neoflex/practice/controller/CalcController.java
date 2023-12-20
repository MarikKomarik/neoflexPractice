package ru.neoflex.practice.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.practice.model.CalculationResult;
import ru.neoflex.practice.repository.CalculationResultRepository;

import javax.xml.transform.Result;
import java.util.List;

@RestController
@OpenAPIDefinition(info = @Info(title = "Calc API", version = "1.0", description = "Для складывания или вычитания чисел"))
public class CalcController {
    @Autowired
    private  CalculationResultRepository calculationResultRepository;
    @GetMapping("/history")
    public List< CalculationResult > getAll() {
        return calculationResultRepository.findAll();
    }
    public CalcController(CalculationResultRepository calculationResultRepository) {
        this.calculationResultRepository = calculationResultRepository;
    }

    @GetMapping("/plus/{a}/{b}")
    public Integer sum(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        CalculationResult result = new CalculationResult();
        result.setResult(a + b);
        calculationResultRepository.save(result);
        return a + b;
    }
    @GetMapping("/minus/{a}/{b}")
    public Integer difference(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        CalculationResult result = new CalculationResult();
        result.setResult(a - b);
        calculationResultRepository.save(result);
        return a - b;
    }
}
