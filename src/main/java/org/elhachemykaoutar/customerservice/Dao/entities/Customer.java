package org.elhachemykaoutar.customerservice.Dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data @Builder
public class Customer {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String email;

}
