package lista2.heranca_exemplo;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {

	List<String> materias = new ArrayList<String>();

	@Override
	public void apresentar() {
		System.out.println("Olá eu me chamo " + nome + ", tenho " + idade + " anos e ministro as materias " + materias);
	}

	public void ensinar() {
		System.out.println(nome + " está ensinando");
	}

	public void ensinar(String materia) {
		if (materias.contains(materia)) {
			System.out.println(nome + " está ensinando " + materia);
		} else {
			System.out.println(nome + " não pode ensinar " + materia + " pois está fora de sua área de atuação");
		}
	}
}