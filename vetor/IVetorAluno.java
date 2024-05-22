package vetor;

public interface IVetorAluno {

    public void adiciona(Aluno aluno);

    public int tamanho();

    public boolean contem(Aluno aluno);

    public Aluno pega(int posicao);

    public void remove(int posicao);

}
