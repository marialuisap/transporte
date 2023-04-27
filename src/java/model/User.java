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
}
