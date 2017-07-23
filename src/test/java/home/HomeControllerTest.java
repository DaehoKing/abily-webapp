package home;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import web.home.controller.HomeController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by User on 2017-07-16.
 */
public class HomeControllerTest {
    @Test
    public void home() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/home")).andExpect(view().name("home"));
    }
}
