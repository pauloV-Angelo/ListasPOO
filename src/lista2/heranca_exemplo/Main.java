package lista2.heranca_exemplo;

public class Main {

	public static void main(String[] args) {
		Professor gilvan  = new Professor();
		Pessoa paulo = new Pessoa();
		paulo.nome = "Paulo";
		paulo.idade = 27;
		gilvan.nome = "Gilvan";
		gilvan.idade = 40;
		gilvan.materias.add("POO");
		gilvan.materias.add("Matematica e fisica para jogos");
		
		
		
		gilvan.apresentar();
		paulo.apresentar();
		gilvan.ensinar();
		gilvan.ensinar("POO");
		gilvan.ensinar("Historia do design");
	}

}
