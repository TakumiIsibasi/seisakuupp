package jp.ac.ohara.seisaku.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class UserModel {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long userid;

    @Column(length = 16, nullable = false)
    private String name;

    @Column(length = 32, nullable = false)
    private String password;
    
    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
