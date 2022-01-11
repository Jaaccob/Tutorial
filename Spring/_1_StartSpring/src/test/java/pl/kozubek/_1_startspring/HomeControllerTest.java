package pl.kozubek._1_startspring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.containsString;

@WebMvcTest(HomeController.class)
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;        //Wstrzyknięcie MockMvc

    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/"))           //Wykonanie żadania HTTP GET
                .andExpect(status().isOk())             //Oczekuje na połączenie
                .andExpect(view().name("home")) //Oczekiwany widok home
                .andExpect(content().string(
                        containsString("Witaj w..."))); //Oczekiwany "Witaj w..."
    }


}
