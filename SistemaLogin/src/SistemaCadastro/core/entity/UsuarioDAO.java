package SistemaCadastro.core.entity;

import SistemaCadastro.core.entity.conexao.ConexaoJDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO{

    public void Inserir(Usuario usuario)  {

        String sql = "INSERT INTO USUARIO ( NOME, SENHA, EMAIL, LOGIN) VALUES (?,?,?,?)";

        try (PreparedStatement ps = ConexaoJDBC.getConexao().prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getEmail());
            ps.setString(4, usuario.getLogin());

            ps.execute();

        } catch (SQLException e) {
            

        }
    }
    
    public Usuario buscarlogin(String login,String  senha) {

        String sql = "SELECT ID, NOME, SENHA, LOGIN, EMAIL WHERE LOGIN  = ? AND SENHA = ?";
        
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);

            ps.setString(1, login);
             ps.setString(2, senha);

            rs = ps.executeQuery();
            
            Usuario usuario = new Usuario();

            if (rs.next()) {

                usuario.setId(rs.getLong("ID"));
                usuario.setNome(rs.getString("NOME"));
                usuario.setLogin(rs.getString("LOGIN"));
                usuario.setSenha(rs.getString("SENHA"));
                usuario.setEmail(rs.getString("EMAIL"));
             
                       
            }
             
        } catch (SQLException ex) {
 
        }
        return null;
      
       
       
        
         

    }

    
    
       
}
