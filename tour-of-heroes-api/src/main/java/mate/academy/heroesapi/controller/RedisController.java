package mate.academy.heroesapi.controller;

import mate.academy.heroesapi.repository.HeroStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private HeroStatusRepository heroStatusRepository;

    @GetMapping
    public String get(@RequestParam String key) {
        return heroStatusRepository.getStatus(key);
    }

    @GetMapping("/add")
    public String add(@RequestParam String key, @RequestParam String value) {
        heroStatusRepository.put(key, value);
        return "Done!";
    }
}
