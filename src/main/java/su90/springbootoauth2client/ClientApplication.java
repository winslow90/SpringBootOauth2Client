/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package su90.springbootoauth2client;

import java.security.Principal;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author superman90
 */
@EnableAutoConfiguration
@Configuration
@EnableOAuth2Sso
@RestController
public class ClientApplication {
    
    @RequestMapping("/")
    public String home(Principal user) {
      return "Hello " + user.getName();
    }
    
    public static void main(String[] args) {
        new SpringApplicationBuilder(ClientApplication.class)
            .properties("spring.config.name=client").run(args);
      }
    
}
