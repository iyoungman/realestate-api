package kr.ac.skuniv.realestate.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "charter_date")
public class CharterDate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(value = TemporalType.DATE)
    private Date date;

    @Column(name = "price")
    private Long price;

    @ManyToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "buildingNo")
    private Building building;

}