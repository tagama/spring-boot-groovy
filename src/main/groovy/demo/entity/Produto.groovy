package demo.entity

import groovy.transform.CompileStatic

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by Thiago on 28/02/2015.
 */
@Entity
@CompileStatic
class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String nome

    Date dataCriacao

}
