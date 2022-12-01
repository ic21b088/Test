package at.fhtw.Test.Service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    private long sum = 0;

    public Long getSquare(long number)
    {
        return number*number;
    }

    public void addToSum(long summand)
    {
        sum += summand;
    }

    public Long getSumme()
    {
        return sum;
    }


}
