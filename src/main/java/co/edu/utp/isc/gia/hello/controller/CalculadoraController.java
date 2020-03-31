package co.edu.utp.isc.gia.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("calc")
public class CalculadoraController {
        
        @GetMapping("/suma")
        public int suma(@RequestParam("numerouno") int numerouno, @RequestParam("numerodos") int numerodos){
            return numerouno + numerodos;
        }
        
        @GetMapping("/resta")
        public int resta(@RequestParam("numerouno") int numerouno, @RequestParam("numerodos") int numerodos){
            return numerouno - numerodos;
        }
        
        @GetMapping("/multiplicacion")
        public int multiplicacion(@RequestParam("numerouno") int numerouno, @RequestParam("numerodos") int numerodos){
            return numerouno * numerodos;
        }
        
        @GetMapping("/division")
        public int division(@RequestParam("numerouno") int numerouno, @RequestParam("numerodos") int numerodos){
            return numerouno / numerodos;
        }
}
