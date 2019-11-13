package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @program: jpademo
 * @author: Programming Queen
 * @create: 2019-11-13 20:07
 **/

@Entity
public class Alien {
    @Id
    private int aid;
    private String aname;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                '}';
    }
}
