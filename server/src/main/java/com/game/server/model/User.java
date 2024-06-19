package com.game.server.model;

import com.game.server.model.role.Role;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

@Entity
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;



    private String name;
    private String email;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private List<Role> roles;
    public User(){

    }
    public User(String name, String email, String password){
        this.email = email;
        this.password = password;
        this.name = name;
    }
    public Long getId() {
        return id;
    }





    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }
}
