package at.fhtw.Test.Service;

import org.springframework.stereotype.Service;

@Service
public class TestService {


    public Long getSquare(long number)
    {
        return number*number;
    }

    /*public Long getSquare(Long number) //für weitere Feature
    {
        return number*number;
    }*/

}
