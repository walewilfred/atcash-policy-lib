/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atcash.policy.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author Wale
 */
@Entity
@Data
public class Policy implements Serializable {

    private @Id
    @GeneratedValue
    Long id;
    private String policyName;
    private String policyIdentifier;

    private String providerType;
    private int contractIdentifier;
    @Temporal(TemporalType.DATE)
    private Date effectiveDate;
    @Temporal(TemporalType.DATE)
    private Date expiryDate;
    private int transactionLimit;
    @JoinColumn(name = "registrar", referencedColumnName = "id")
    @ManyToOne(optional = true, fetch = FetchType.EAGER)
    private Registrar registrar;

    @JoinColumn(name = "policyType", referencedColumnName = "id")
    @ManyToOne(optional = true, fetch = FetchType.EAGER)
    private PolicyType policyType;

}
