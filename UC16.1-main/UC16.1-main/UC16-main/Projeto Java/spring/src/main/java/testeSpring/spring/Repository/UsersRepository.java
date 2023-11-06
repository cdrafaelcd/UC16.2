package testeSpring.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import testeSpring.spring.Entity.Paciente;

public interface UsersRepository extends JpaRepository<Paciente, Long>{

}
