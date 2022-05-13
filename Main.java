import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int entrada;
        jsl pp = new jsl();
        entrada = s.nextInt();
//        pessoa p = new pessoa("Alvin", "esquilo@gmail.com", 15);
        pp.print();
        System.out.println(pp.pular(entrada));
        s.close();
    }
    
}