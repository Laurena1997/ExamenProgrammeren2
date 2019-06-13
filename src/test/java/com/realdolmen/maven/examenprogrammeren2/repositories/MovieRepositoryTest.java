package com.realdolmen.maven.examenprogrammeren2.repositories;


import com.realdolmen.examen.examenprogrammeren2.exceptions.NoQueryPossibleException;
import com.realdolmen.maven.examenprogrammeren2.domain.Movie;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MovieRepositoryTest {
    
    //TODO 
    //Opdracht 2 Unit testen : Er is al een deel van de repository test opgesteld. Alle gegevens die je nodig hebt staan al ingevuld. 
    //20 : tracht alle methoden die hieronder beschreven zijn in te vullen zodat ze slagen. Tips kan je vinden in de methoden zelf.
    private static String URL = "jdbc:mysql://localhost:3306/movie_db_test?autoReconnect=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    private MovieRepository repository;
    
    public void init() {
        repository = new MovieRepository(URL);
    }
    
    @Test
    public void findTestSucces() throws Exception {
        
        MovieRepository movieRepository = new MovieRepository();
        List<Movie> movies = movieRepository.find("SELECT * FROM movies");
        assertFalse(movies.isEmpty());            
    }
      
    @Test//TODO maak een test voor MovieRepository.find()
    public void findTestWrongQueryThrowsNoQueryPossibleException() throws Exception
    {
            
        //Geef als parameter de String "SELECT tieeel FROM movies" mee
        
        //Doe de nodige check om een succesvolle test te krijgen indien nodig
    }
    
}
