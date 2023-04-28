package com.app.web.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter 
@ToString

@Table(name="estudiantes")
public class Estudiante {
	public Estudiante(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
 
	@Column(name="nombre", nullable= false, length = 50)
	private String nombre;
	
	@Column(name="apellido", nullable= false, length = 50)
	private String apellido;
	
	@Column(name="email", nullable= false, length = 50, unique=true)
	private String email;

	
	
	
}
