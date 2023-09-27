package SistemaCadastro.core.entity;

/**
 *
 * @author Luana
 */
public class Usuario {
   
    private Long id;
    private String login;
    private String nome;
    private String senha;
    private String email;

    

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public void setLogin(String Login) {
        this.login = login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

        
    
}
    

