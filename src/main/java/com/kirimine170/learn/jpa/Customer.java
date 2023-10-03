package com.kirimine170.learn.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Customerクラス
 * このクラスは、DBのcustomerテーブルと関連付けられる。
 */
//TODO テーブル名はクラス名と同一？
@Entity
public class Customer
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;

    protected Customer()
    {
    };

    public Customer(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString()
    {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
    }

    public long getId()
    {
        return id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
}
