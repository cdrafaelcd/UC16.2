package testeSpring.spring.Config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import testeSpring.spring.Entity.Consulta;
import testeSpring.spring.Entity.Paciente;
import testeSpring.spring.Entity.Enums.ConsultaStatus;
import testeSpring.spring.Repository.ConsultaRepository;
import testeSpring.spring.Repository.UsersRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private ConsultaRepository consultaRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Paciente p1 = new Paciente(null, "Rafael", 25092000, "teste@gmail.com", "Rua teste", "Complemento", 1234567810, 19, 1998965425);
		Paciente p2 = new Paciente(null, "Ferreira", 25092000, "teste@gmail.com", "Rua teste", "Complemento", 1234567810, 19, 1998965425);
		Paciente p3 = new Paciente(null, "Conceicao", 25092000, "teste@gmail.com", "Rua teste", "Complemento", 1234567810, 19, 1998965425);

		Consulta c1 = new Consulta(null, Instant.parse("2019-06-20T19:53:07Z"), ConsultaStatus.CONSULTA_AGENDADA, p1);
		Consulta c2 = new Consulta(null, Instant.parse("2019-07-21T03:42:10Z"), ConsultaStatus.CONSULTA_REALIZADA, p2);
		Consulta c3 = new Consulta(null, Instant.parse("2019-07-22T15:21:22Z"), ConsultaStatus.CONSULTA_CANCELADA, p1); 
		
		usersRepository.saveAll(Arrays.asList(p1, p2, p3));
		consultaRepository.saveAll(Arrays.asList(c1, c2, c3));

}
	
	
}
