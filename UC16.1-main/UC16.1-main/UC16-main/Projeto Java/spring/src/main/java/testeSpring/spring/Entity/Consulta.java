package testeSpring.spring.Entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import testeSpring.spring.Entity.Enums.ConsultaStatus;

@Entity
@Table(name = "tb_Consulta")
public class Consulta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss''", timezone = "GMT" )
	private Instant moment;
	
	private Integer consultaStatus;
	
	@ManyToOne
	@JoinColumn(name = "id_paciente")
	private Consulta paciente;
	
	@ManyToOne
	@JoinColumn(name = "id_agendamento")
	private Paciente consulta;
	
	public Consulta() {
	}

	public Consulta(Long id, Instant moment, ConsultaStatus consultaStatus, Paciente consulta) {
		super();
		this.id = id;
		this.moment = moment;
		setConsultaStatus(consultaStatus);
		this.consulta = consulta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	
	
	public ConsultaStatus getConsultaStatus() {
		return ConsultaStatus.valueOf(consultaStatus);
	}

	public void setConsultaStatus(ConsultaStatus consultaStatus) {
		if (consultaStatus != null) {
			this.consultaStatus = consultaStatus.getcode();
		}
	}
	public Paciente getConsulta() {
		return consulta;
	}

	public void setConsulta(Paciente consulta) {
		this.consulta = consulta;
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
		Consulta other = (Consulta) obj;
		return Objects.equals(id, other.id);
	}
	
	
}



