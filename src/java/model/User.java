package model;

public class User {
    //atributos
    private String userName;
    private String userPass;
    private String userEmail;
    //construtor
    public User(String user, String pass){
        this.userName = user;
        this.userPass = pass;
    }
    //getter&setters
    public String getUserName(){
        return this.userName;
    }
    public void setUserName(String name){
        this.userName = name;
    }

    public void getUserPass(String pass) {
        this.userPass = pass;
    }

    public void getUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    //toString - Representação genérica do objeto
    @Override
    public String toString(){
        return "Nome:"+this.userName+"<br>Email: "
                +this.userEmail;
    }
    //métodos gerais
    public boolean isLogged(){
        return(this.userName.equals("malu")
                && this.userPass.equals("senha1234"));
    }
}
