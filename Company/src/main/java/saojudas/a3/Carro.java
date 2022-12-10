package saojudas.a3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Carro {
    private int codigo;
    private String marca;
    private String modelo;
    private String cor;
    private String ano;
          
    public void inserir () throws SQLException{
        String sql = "INSERT INTO tb_carro(marca, modelo, cor, ano, codigo) VALUES(?, ?, ?, ?, ?)";
        
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c  = factory.obtemConexao()){
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, getMarca());
            ps.setString(2, getModelo());
            ps.setString(3, getCor());
            ps.setString(4, getAno());
            ps.setInt(5, getCodigo());
            
            ps.execute();
    
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    
       public void atualizar () throws SQLException{
        String sql = "UPDATE tb_carro SET marca = ?, modelo= ?, cor = ?, ano = ? WHERE codigo = ?";
        
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c  = factory.obtemConexao()){
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, getMarca());
            ps.setString(2, getModelo());
            ps.setString(3, getCor());
            ps.setString(4, getAno());
            ps.setInt(5, getCodigo());
            
            ps.execute();
    
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
       
         public void apagar () throws SQLException{
        String sql = "DELETE FROM tb_carro WHERE codigo = ?";
        
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c  = factory.obtemConexao()){
            
            PreparedStatement ps = c.prepareStatement(sql);
          
            ps.setInt(1, getCodigo());
            
            ps.execute();
    
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
         
        public void listar () throws SQLException{
        String sql = "SELECT * FROM tb_carro";
        
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c  = factory.obtemConexao()){
            
            PreparedStatement ps = c.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int codigo =  rs.getInt("codigo");
                String marca =  rs.getString("marca");
                String modelo =  rs.getString("modelo");
                String cor =  rs.getString("cor");
                String ano =  rs.getString("ano");
                JOptionPane.showMessageDialog(null, " O Codigo do carro é: " 
                        + codigo + "\n " + "A marca do carro é: " + marca + "\n "+
                        "O Modelo do carro é: " + modelo + "\n " + 
                        "A cor do carro é: " + cor + "\n "
                        + "O ano do carro é: " + ano);
            }
      
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
         
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the nome to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the fone to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the email to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    
        /**
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the email to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }
}