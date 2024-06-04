import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static void main(String[] args) {
        // TODO code application logic here
        String name = JOptionPane.showInputDialog("Escolha um nome");
        String animal = JOptionPane.showInputDialog(null, "Um animal de estimação");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Uma idade para o " + name));
        int numeroInteiro = Integer.parseInt(JOptionPane.showInputDialog(null, "Um numero interio"));
        double numerodecimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Um numero decimal"));
        
        
        
        String story = null;
        story += "Havia uma pessoa chamada " + name + "\n";
        story += name + " tinha " + age + "anos .\n";
        story += name + "tinha um" + animal + " de estimação.\n";
        story += "Um dia, " + name + "encontrou uma carreira. \n";
        story += "e " + name + "achou " + numeroInteiro + "," + numerodecimal + "R$ na carteira";
     
    }   
}