package com.ecommerce.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user")

public class UserEntity {
	@Id
    @Column(name = "UserId" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "fstname",length = 755)
    private String firstName;
    
    @Column(name = "lstname",length = 755)
    private String lastName;
    
    @Column(name = "email",length = 755)
    private String email;
    
    @Column(name = "phonenumber",length = 755)
    private String phoneNumber;
    
    @Column(name = "login",length = 755)
    private String login;
    
    @Column(name = "password",length = 755)
    private String password;
    @Override
    public String toString() {
        return "UserEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                + ", phoneNumber=" + phoneNumber + ", login=" + login + ", Password=" + password + "]";
    }
}
