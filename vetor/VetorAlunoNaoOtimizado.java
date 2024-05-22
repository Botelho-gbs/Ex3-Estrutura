package vetor;

import vetor.Aluno;
import vetor.IVetorAluno;

public class VetorAlunoNaoOtimizado implements IVetorAluno {

    private Aluno alunos[] = new Aluno[5];

    public void adiciona(Aluno aluno) {
        for(int i=0; i < this.alunos.length; i++) {
            if(this.alunos[i] == null) {
                this.alunos[i] = aluno;
                break;
            }
        }
    }

    public int tamanho() {
        int tamanho = 0;
        for(int i=0; i < this.alunos.length; i++) {
            if(this.alunos[i] == null) {
                break;
            }
            tamanho++;
        }
        return tamanho;
    }

    public boolean contem(Aluno aluno) {
        for(int i=0; i < this.alunos.length; i++) {
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
    }

}