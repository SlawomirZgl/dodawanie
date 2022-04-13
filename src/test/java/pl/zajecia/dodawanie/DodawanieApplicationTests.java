package pl.zajecia.dodawanie;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DodawanieApplicationTests {

    @Test
    void addedTest() {
        DodawanieApplication dodawanieApplication = new DodawanieApplication();
        assertEquals(10,dodawanieApplication.added(5,5));
    }

}
