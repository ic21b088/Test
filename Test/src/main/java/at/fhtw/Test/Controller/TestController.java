package at.fhtw.Test.Controller;

import at.fhtw.Test.Service.TestService;
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
    public Long getSquare(Long number)
    {
        return service.getSquare(number);
    }

    /*@PostMapping("/square/{number}") //für weitere Features nur dieser Teil nötig
    public Long getSquare(Long number)
    {
        return service.getSquare(number);
    }*/

}
