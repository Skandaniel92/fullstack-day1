package dat3.fullstack.repositories;

import dat3.fullstack.entity.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player,Integer> {}

