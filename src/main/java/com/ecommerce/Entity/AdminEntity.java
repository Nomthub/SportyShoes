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
@Table(name = "admin")

public class AdminEntity {
	@Id
    @Column(name = "AdminId" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Adminid;
    
    @Column(name = "name",length = 755)
    private String Name;
    
    @Column(name = "UserId",length = 755)
    private String userId;
    
    @Override
    public String toString() {
        return "AdminEntity [AdminId=" + Adminid + ", name=" + Name + ", UserId=" + userId + "]";
    }
}
