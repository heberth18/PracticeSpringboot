package combolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

//La clases Entity se crea para sincronizarse con la BD
//Decoramos
//Los nombres de las tablas deben ir en mayuscula y en prural
@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
	
	//El campo ID corresponde a la llave primaria de la base de datos
	@Id
	//Tambien hay que mostrar como se genera esta llave en la base de datos
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	/*Cuando el nombre del atributo se llama igual al nombre del campo en la tabla
	se puede omitir la anotacion @colum*/
	private String nombre;
	private String apellido;
	private String email;
	/*Aca si debemos utilizar el colum, ya que el "createAt" se separa por mayuscula,
	mientras que la base de datos la vamos hacer con (_)*/
	@Column(name="create_at")
	
	//Utilizamos la anotacion temporal para indicar cual va hacer la transformacion en la base de datos
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	@jakarta.persistence.PrePersist
	public void PrePersist() {
		createAt = new Date();
	}
	
	public Long getId() {
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
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
