package hu.me.krz.haladojava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppTest 
{
    @Test
    public void PlanetTest()
    {
        Astronomer a = new Astronomer("teszt");
        assertEquals("teszt", a.getName());
    }
}
