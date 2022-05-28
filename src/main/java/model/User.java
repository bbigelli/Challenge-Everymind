package model;

public class User {
        
    private String name;
    private String cpf;
    private String state;
    private String city;
    private String adress;
    private String complement;    
    private String email;
    private String user;
    private String password;
    private Integer id;

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public User(String name, String cpf, String state, String city, String adress, String complement, String email, String user, String password) {
        this.name = name;
        this.cpf = cpf;
        this.state = state;
        this.city = city;
        this.adress = adress;
        this.complement = complement;
        this.email = email;
        this.user = user;
        this.password = password;
    }    

    public User(String name, String cpf, String state, String city, String adress, String complement, String email, String user, String password, Integer id) {
        this.name = name;
        this.cpf = cpf;
        this.state = state;
        this.city = city;
        this.adress = adress;
        this.complement = complement;
        this.email = email;
        this.user = user;
        this.password = password;
        this.id = id;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }   
}    
