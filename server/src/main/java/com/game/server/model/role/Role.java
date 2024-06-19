package com.game.server.model.role;

import jakarta.persistence.*;
import org.hibernate.annotations.NaturalId;

@Entity
@Table(name="roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NaturalId
    @Enumerated(EnumType.STRING)
    @Column(name="name")
    private RoleName name;

    public Role(RoleName name){
        this.name = name;
    }
    public Role(){}

    public Long getId() {
        return id;
    }

    public void setName(RoleName name) {
        this.name = name;
    }

    public RoleName getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name.toString();
    }
}
