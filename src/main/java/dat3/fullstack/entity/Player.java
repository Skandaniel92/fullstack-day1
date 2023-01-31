package dat3.fullstack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public Player() { }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
