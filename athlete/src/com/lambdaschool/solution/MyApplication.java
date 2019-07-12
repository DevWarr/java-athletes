package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    private AthleteInterface athlete;

    public MyApplication(AthleteInterface athlete)
    {
        this.athlete = athlete;
    }

    public void displayAthlete()
    {
        athlete.stringPrint();
    }
}
