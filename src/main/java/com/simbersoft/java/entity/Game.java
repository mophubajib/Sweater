package com.simbersoft.java.entity;

import javax.persistence.*;

@Entity
@Table(name="game")
public class Game {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="game_id", nullable = false)
    private Integer gameId;


    @Column(name="move_players")
    private Integer [] movePlayers;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer[] getMovePlayers() {
        return movePlayers;
    }

    public void setMovePlayers(Integer[] movePlayers) {
        this.movePlayers = movePlayers;
    }
}
