package com.example.gcvas.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = Rma.TABLE_NAME)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rma {
    
    public static final String TABLE_NAME = "Rma";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CodRma", nullable = false, unique = true)
    private Long id;

    @Column(name = "Data_Ano", unique = false, nullable = false, insertable = true, updatable =false, length = 15 )
    @NotNull
    private Integer dataano;

    @Column(name = "nomeunidade", unique = false, nullable = false, insertable = true, updatable =false, length = 50 )
    @NotBlank
    @Size(min = 2, max = 50)
    private String nomeuni;

    @Column(name = "numerounidade", unique = false, nullable = false, insertable = true, updatable =false, length = 15 )
    @NotNull
    private String numerouni;

    @Column(name = "Endereco", unique = false, nullable = false, insertable = true, updatable =true, length = 50 )
    @NotBlank
    @Size(min = 5, max = 50)
    private String endereco;

    @Column(name = "Municipio", unique = false, nullable = false, insertable = true, updatable =true, length = 50 )
    @NotBlank
    @Size(min = 5, max = 50)
    private String municipio;

    @Column(name = "A1", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer aum;

    @Column(name = "A2", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer adois;

    @Column(name = "B1", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer bum;

    @Column(name = "B2", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer bdois;

    @Column(name = "B3", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer btres;

    @Column(name = "B4", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer bquatro;

    @Column(name = "B5", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer bcinco;

    @Column(name = "B6", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer bseis;

    @Column(name = "C1", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer cum;

    @Column(name = "C2", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer cdois;

    @Column(name = "C3", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer ctres;

    @Column(name = "C4", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer cquatro;

    @Column(name = "C5", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer ccinco;

    @Column(name = "C6", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer cseis;

    @Column(name = "C7", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer csete;

    @Column(name = "C8", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer coito;

    @Column(name = "C9", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer cnove;

    @Column(name = "D1", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer dum;

    @Column(name = "D2", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer ddois;

    @Column(name = "D3", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer dtres;

    @Column(name = "D4", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer dquatro;

    @Column(name = "D5", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer dcinco;

    @Column(name = "D6", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer dseis;

    @Column(name = "D7", unique = false, nullable = false, insertable = true, updatable =false, length = 10 )
    @NotNull
    @Size(min = 1, max = 10)
    private Integer dsete;

}
