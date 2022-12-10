package saojudas.a3;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Principal {
 public static void main(String[] args) throws SQLException{
     
     String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
     int op;
     do{
         op = Integer.parseInt(JOptionPane.showInputDialog(menu));
         switch(op){
             case 1:
                 String marca = JOptionPane.showInputDialog("Insira a marca");
                 String modelo = JOptionPane.showInputDialog("Insira o modelo");
                 String cor = JOptionPane.showInputDialog("Insira a cor");
                 String ano = JOptionPane.showInputDialog("Insira o ano");
                 
                 Carro p = new Carro();
                 p.setMarca(marca);
                 p.setModelo(modelo);
                 p.setCor(cor);
                 p.setAno(ano);
                 p.setCodigo(10);
                 p.inserir();
                 break;
             case 2:
                 marca = JOptionPane.showInputDialog("Insira a marca");
                 modelo = JOptionPane.showInputDialog("Insira o modelo");
                 cor = JOptionPane.showInputDialog("Insira a cor");
                 ano = JOptionPane.showInputDialog("Insira o ano");
                 int codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o codigo"));

                 Carro p2 = new Carro();
                 p2.setMarca(marca);
                 p2.setModelo(modelo);
                 p2.setCor(cor);
                 p2.setAno(ano);
                 p2.setCodigo(codigo);
                 p2.atualizar();
                 
             
                  break;
             case 3:
              codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o codigo"));
              Carro p3 = new Carro();
              p3.setCodigo(codigo);
              p3.apagar();

                  break;
             case 4:
                 Carro p4 = new Carro();
                 p4.listar();
                  break;
             case 0:
                  break;
             default:
                 JOptionPane.showMessageDialog(null, "Opção Invalida");
         }
     }while(op!=0);
     
 }   
 
   
 }

