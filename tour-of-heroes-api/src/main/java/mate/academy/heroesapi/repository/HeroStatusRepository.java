package mate.academy.heroesapi.repository;

import java.util.concurrent.TimeUnit;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

@Repository
public class HeroStatusRepository {

  private static final int DEFAULT_TTL = 5;
  private ValueOperations<String, String> valueOps;

  public HeroStatusRepository(
        RedisTemplate<String, String> redisTemplate) {
    valueOps = redisTemplate.opsForValue();
  }

  public String put(String key, String inputValue) {
    valueOps.set(key, inputValue, DEFAULT_TTL, TimeUnit.HOURS);
    return inputValue;
  }

  public String getStatus(String key) {
    return valueOps.get(key);
  }
}

