package dev.Anka.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "username", length = 50, unique = true)
    private String username;
    @Column(name = "password", length = 50)
    private String password;
    @Column(name = "email", length = 50, unique = true)
    private String email;
    @Column(name = "date_joined")
    private LocalDateTime dateJoined;
    @Column(name = "is_active")
    private boolean isActive;
    @Column(name = "is_staff")
    private boolean isStaff;

}
