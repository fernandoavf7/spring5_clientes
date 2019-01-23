package com.bolsadeideas.springboot.backned.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
/*el nombre de tabla no es necesario si deseamos que la tabla 
 * se llame exactamente igual que la clase, en este caso difiere en
 * mayusculas y minusculas
 */
@Table(name="cliente")
public class Cliente implements Serializable{

	/* debe llevar @Id para indicar que es un id 
	 * e generatedValue identity para decir que sera autoincrementable
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private String email;
	/*
	 * se coloca column para indicar que el nombre de la columna 
	 * de la db es diferente al del atributo
	 * en este caso sera toda la db en minuscula como buena practica
	 */
	@Column(name="create_at")
	//indica que se trabajara con tipo Date
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	
	public long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	
	
	
}
