package com.cydeo.Entiry;

import com.cydeo.Enum.UserRole;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "account_details")
public class Account extends BaseEntity{

    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private String age;
    private String postalCode;

    @Enumerated(EnumType.STRING)
    private UserRole role ;

    @OneToOne(mappedBy = "account")
    private User user;

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", age='" + age + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", role=" + role +
                '}';
    }
}
