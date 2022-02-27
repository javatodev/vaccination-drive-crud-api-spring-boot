package com.dotitude.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "vaccination_record")
public class VaccinationRecordEntity {

    @Id
    @GeneratedValue
    private Long id;

    //PERSONAL DETAILS OF VACCINATED PERSON
    private String identificationNumber;
    private String firstName;
    private String lastName;
    private String addressLine01;
    private String addressLine02;
    private String city;

    //VACCINE DETAILS
    private String serialNumber;
    private Long dose;
    @Enumerated(EnumType.STRING)
    private VaccineBrand brand;

}
