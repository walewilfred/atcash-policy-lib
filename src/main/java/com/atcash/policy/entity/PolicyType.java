/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atcash.policy.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author Wale
 */
@Entity
@Data
public class PolicyType implements Serializable {
  private @Id @GeneratedValue Long id;
private String policyTypeName;
private String description;

}
