package curso_1;

public class Cachorro {
    public String nome;
    public int idade;
    public String raca;
    public String porte;

    public Cachorro(String nome, int idade, String raca, String porte) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.porte = porte;
    }
    public void latir() {
        System.out.println("Au au!");
    }

    public void comer(String alimento) {
        System.out.println(nome + " está comendo " + alimento + ".");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Rex",3,"Labrador", "grande");
        System.out.println("Nome: " + meuCachorro.getNome());
        System.out.println("Idade: " + meuCachorro.getIdade());
        System.out.println("Raça: " + meuCachorro.getRaca());
        meuCachorro.latir();
        meuCachorro.comer("ração");
        meuCachorro.dormir();
    }
}
