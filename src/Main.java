import controller.AlunoController;
//import controller.ProfessorController;
import model.AlunoView;

public class Main {

	public static void main(String[] args) {
//		ProfessorController apresentaProfessor = new ProfessorController();
//		apresentaProfessor.testaProfessor();
		
		AlunoController apresentaAluno = new AlunoController();
		new AlunoView();
		
//		apresentaAluno.inserirAluno();
//		apresentaAluno.listarTodos();
//		apresentaAluno.listarAniversariante(5);

	}

}
