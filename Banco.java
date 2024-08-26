import lombok.*;

import java.util.List;


public class Banco {

	@Getter
	@Setter
	private String nome;
	private List<Conta> contas;
	public List<Conta> getContas() {
		return contas;
	}

}
