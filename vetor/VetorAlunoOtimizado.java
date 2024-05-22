import vetor.Aluno;
import vetor.IVetorAluno;

package vetor;

public class VetorAlunoOtimizado implements IVetorAluno {

    private Aluno alunos[] = new Aluno[5];
    private int totalAlunos = 0;

    public void adiciona(Aluno aluno) {
        this.alunos[totalAlunos] = aluno;
        totalAlunos++;
    }

    public int tamanho() {
        return totalAlunos;
    }

    public boolean contem(Aluno aluno) {
        for(int i=0; i < this.totalAlunos; i++) {
            if(this.alunos[i] == aluno) {
                return true;
            }
        }
        return false;
    }

    public Aluno pega(int posicao) {
        if(posicao < 0 || posicao >= this.tamanho()) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        return this.alunos[posicao];
    }

    public void remove(int posicao) {
        if(posicao < 0 || posicao >= this.tamanho()) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        this.alunos[posicao] = null;
        for(int i=posicao; i < this.tamanho(); i++) {
            this.alunos[i] = this.alunos[i+1];
        }
        totalAlunos--;
    }

}