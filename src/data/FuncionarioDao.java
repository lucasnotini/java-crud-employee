package data;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class FuncionarioDao {
    
    //instancio classes para criar objetos a salvar dados da conexão com banco
        Connection conn;
        PreparedStatement st;
        ResultSet rs;
            
    //Crio método para Conectar com Banco de Dados (retorna true ou false)
    public boolean conectar(){
        
        //tento executar linhas do try, se não consigo, caio no catch
        try {
            //indico qual vai ser a Classe ponte/driver que está no com.mysql.jdbc.Driver (java database connector)
            Class.forName("com.mysql.cj.jdbc.Driver");
            //uso classe que faz a conexão (passo caminho do banco, usuario e senha) e guardo no objeto conn
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "root", "notini");
            return true;
        
        //multicatch para o ClassNotFoundException (caso driver não esteja na biblioteca) e para o SQLException 
        //(caso dê problemas ao conectar com banco)
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }
    
    public int salvar(Funcionario func){
            
            int status;
     
            try {
                //crio variavel string para armazenar comando de inserir no banco
                //String sql;
                //sql = "INSERT INTO funcionario VALUES('"+ func.getMatricula() +"', '"+ func.getNome() +"', '"+ func.getCargo() +"', "+ func.getSalario() +")";
                st = conn.prepareStatement("INSERT INTO funcionario VALUES(?,?,?,?)");
                st.setString(1, func.getMatricula());
                st.setString(2, func.getNome());
                st.setString(3, func.getCargo());
                st.setDouble(4, func.getSalario());
                //comando para executar inserção no banco usando o objeto st que criei, que abre sessão para trabalhar no banco de dados
                status = st.executeUpdate();
                return status; //retorna 1
                
            } catch (SQLException ex) {
                //System.out.println(ex.getErrorCode());
                return ex.getErrorCode(); //tentariva de inserir valor primário duplicado     
            }
    }
    
    //crio método para desconectar (vai ser chamado apenas após ter salvado)
    public void desconectar(){
            try {
                conn.close();
            } catch (SQLException ex) {
                
            }
    }
    
    //método consultar com tipo Funcionario e que recebe argumento (matricula)
    public Funcionario consultar (String matricula){
        
            try {
                
                Funcionario funcionario = new Funcionario(); // instancio objeto vazio da classe Funcionario
                
                st = conn.prepareStatement("SELECT * FROM funcionario WHERE matricula = ?");//uso o objeto st da classe PreparedStatement para buscar
                st.setString(1, matricula); //crio variavel da classe ResultSet para receber dados do banco
                rs = st.executeQuery(); //executo a Query que preparei
                                
                if (rs.next()) { //verifica se a consulta encontrou o funcionario com a matricula informada
                    //uso setters para salvar o que retornou do banco (que está no objeto rs) para
                    //meu objeto da classe Funcionario
                    funcionario.setMatricula(rs.getString("matricula"));
                    funcionario.setNome(rs.getString("nome"));
                    funcionario.setCargo(rs.getString("cargo"));
                    funcionario.setSalario(rs.getDouble("salario"));
                    
                    return funcionario;
                }
                
                else {
                    return null;
                } 
                } 
            
            catch (SQLException ex) {
                return null;
            }
            
        }
    
    public boolean excluir(String matricula){
            try {
                st = conn.prepareStatement("DELETE FROM funcionario WHERE matricula = ?");//com a conexão estabelecida preparo comando SQL
                st.setString(1, matricula); //uso matricula passada como argumento no comando de cima
                st.executeUpdate(); //executo o comando SQL que preparei
                return true;
            } 
            
            catch (SQLException ex) {
                return false;
            }  
    }
    
    public boolean alterar(Funcionario funcionario){
        
   
//        System.out.println("funcionario.getMatricula = " + funcionario.getMatricula());
//        System.out.println("funcionario.getNome = " + funcionario.getNome());
//        System.out.println("funcionario.getCargo = " + funcionario.getCargo());
//        System.out.println("funcionario.getSalario = " + funcionario.getSalario());
        
        try {
                st = conn.prepareStatement("UPDATE funcionario SET nome=?, cargo=?, salario=? WHERE matricula = ?");//com a conexão estabelecida preparo comando SQL
                //st.setString(4, funcionario.getMatricula());//substituo o "?" pelos valores que preciso usar
                st.setString(1, funcionario.getNome());
                st.setString(2, funcionario.getCargo());
                st.setDouble(3, funcionario.getSalario());
                st.setString(4, funcionario.getMatricula());
                st.executeUpdate(); //executo o comando SQL que preparei
                return true;
            } 
            
            catch (SQLException ex) {
                return false;
            }  
      
    }
    
}


