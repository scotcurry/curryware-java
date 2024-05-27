package org.curryware.currywarejava;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

// To run this test go to command line and type ./gradlew test --tests FantasyTeamControllerTest
@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class FantasyTeamControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void testGetTeamInfo() throws Exception {

         var testJSON = webTestClient
                 .get()
                 .uri("/teaminfo/getteams")
                 .exchange()
                 .expectStatus().isOk()
                 .expectBody(String.class).returnResult().getResponseBody();
    }
}