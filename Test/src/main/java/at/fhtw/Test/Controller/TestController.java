package at.fhtw.Test.Controller;

import at.fhtw.Test.Service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestService service;

    public TestController(TestService service) //Constructor (Alt+Einfg)
    {
        this.service = service;
    }

    @PostMapping("/square/{number}")
    public Long getSquare(@PathVariable Long number)
    {
        return service.getSquare(number);
    }

    @GetMapping("/summe")
    public Long getSum()
    {
        return service.getSumme();
    }

    @PostMapping("/summe/{number}")
    public Long addToSum(@PathVariable Long number)
    {
        service.addToSum(number);
        return service.getSumme();
    }



}
