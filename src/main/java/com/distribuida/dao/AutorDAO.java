import com.distribuida.model.Autor;
import com.distribuida.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorDAO extends JpaRepository<Autor, Integer> {
}