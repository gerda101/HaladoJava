package hu.me.krz.haladojava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest
{
	
    @Test
    void getName()
    {
    	String name = "Nem Tom";
    	Astronomer a = new Astronomer(name);
        assertThat(a.getName().equals("name"));
    }
    
    @Test
    void ShouldAnswerWithTrue()
    {
    	assertTrue(true);
    }
    
    @Test
    void PlanetTest()
    {
        Astronomer a = new Astronomer("teszt");
        assertTrue(a.getName().equals("teszt"));
    }
    
}
