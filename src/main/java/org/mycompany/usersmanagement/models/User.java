package org.mycompany.usersmanagement.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="users")
@ToString @EqualsAndHashCode
public class User {

    @Getter
    @Setter
    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name="name")
    private String name;

    @Getter
    @Setter
    @Column(name="lastname")
    private String lastname;

    @Getter
    @Setter
    @Column(name="email")
    private String email;

    @Getter
    @Setter
    @Column(name="telephone", nullable = true)
    private String telephone;

    @Getter
    @Setter
    @Column(name="password")
    private String password;
}
