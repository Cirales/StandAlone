
package com.Proyecto2.ejemplo2.model;

//clase para elaborar la entidad de la aplicación 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Aprendiz {
    
    @Id
    @Column
    private Long iduser;
    
    @Column
    private String nomuser;
    
     @Column
    private String apellido;
     
      @Column
    private String email;
    
}
