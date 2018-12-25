package info.interventure.hackaton.gamestocker.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:slavisa.avramovic@escriba.de">avramovics</a>
 * @since 2018-12-25
 */
@RestController
@RequestMapping(value = "/")
@CrossOrigin
public class HomeController {

  @GetMapping
  public Map<String, String> hello() {
    HashMap<String, String> body = new HashMap<>();
    body.put("hell", "world");
    return body;
  }

}
