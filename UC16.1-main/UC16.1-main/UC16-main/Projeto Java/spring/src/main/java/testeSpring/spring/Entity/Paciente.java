package testeSpring.spring.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Paciente")
public class Paciente implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int dataNascimento;
	private String email;
	private String endereço;		
	private String complemento;
	private int cpf;
	private int ddd;
	private int telefone;
	
	@JsonIgnore
	@OneToMany(mappedBy = "consulta")
	private List<Consulta> consulta = new ArrayList<>();
	
	
	public	Paciente() {
		
	}

	public Paciente(Long id, String name, int data, String email, String endereço, String complemento, int cpf, int ddd,
			int telefone) {
		super();
		this.id = id;
		this.name = name;
		this.dataNascimento = data;
		this.email = email;
		this.endereço = endereço;
		this.complemento = complemento;
		this.cpf = cpf;
		this.ddd = ddd;
		this.telefone = telefone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getData() {
		return dataNascimento;
	}

	public void setData(int data) {
		this.dataNascimento = data;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public List<Consulta> getConsulta() {
		return consulta;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(id, other.id);
	}

	
	
}


