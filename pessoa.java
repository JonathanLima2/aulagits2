import java.util.Scanner;

public class pessoa {
    private String nome;
    private int idade;
    private String email;

    pessoa(){}

    pessoa(String n, String e, int i){
        this.setEmail(e);
        this.setIdade(i);
        this.setNome(n);
    }

    public void setNome(String n){this.nome = n;}
    public void setIdade(int i){this.idade = i;}
    public void setEmail(String e){this.email = e;}

    public String getNome(){return this.nome;}
    public String getEmail(){return this.email;}
    public int getIdade(){return this.idade;}

    public void print()
    {
        System.out.println("nome: "+this.getNome());
        System.out.println("idade: "+this.getIdade());
        System.out.println("email: "+this.getEmail());
    }
}

class jsl extends pessoa{
    private int pulacorda = 0;
    jsl()
    {
        this.setEmail("jdsl@icomp.ufam.edu.br");
        this.setIdade(22);
        this.setNome("jonathan Lima");
    }
    public void setP(int p){this.pulacorda = p;}
    public int getP(){return this.pulacorda;}
    public int pular(int i)
    {
        for (int n=0; n<i; n++)
            this.setP(n);
        return this.getP();
    }
}
