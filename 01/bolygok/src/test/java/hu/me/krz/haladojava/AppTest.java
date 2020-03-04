package hu.me.krz.haladojava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest 
{
    /*@Test
    void getName()
    {
    	String name = "Nem Tom";
    	Astronomer a = new Astronomer(name);
        assertThat();
    }*/
    
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
    

    @Test
    void observeTheSky()
    {
    	String name = "Nem Tom";
    	Astronomer a = new Astronomer(name);
        a.observeTheSky();
        assertTrue(a.getDiscoveredPlanets().size().isEqualTo(expand 10));
        
        assertTrue(a.getDiscoveredPlanets().get(0).getPosition()
        		.equals(new Point(0,0,0)));
    }
    
}
