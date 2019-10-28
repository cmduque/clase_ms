package org.classes.ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/FunctionService")
public class FunctionService {
    FunctionServiceCloud funcServCloud;

    @GetMapping("/sum/{a}/{b}")
    public Integer sum(@PathVariable Integer a, @PathVariable Integer b) {
        return a + b;
    }

    @GetMapping("/subtraction/{a}/{b}")
    public Integer subtraction(@PathVariable Integer a, @PathVariable Integer b){
        return a - b;
    }

    @GetMapping("/multiplication/{a}/{b}")
    public Integer multiplication(@PathVariable Integer a, @PathVariable Integer b){
        return a * b;
    }

    @GetMapping("/pow/{base}/{pow}")
    public Integer pow(@PathVariable Integer base, @PathVariable Integer pow) {
        Double returnValue = Math.pow(base, pow);
        return returnValue.intValue();
    }

    @GetMapping("/sumEnOracleCloud/{a}/{b}")
    public double sumEnOracleCloud(double a, double b){
        return funcServCloud.sum(a,b);
}

}
