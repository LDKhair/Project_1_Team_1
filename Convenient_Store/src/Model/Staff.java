package Model;

public class Staff {
    private String name, id, pass, gender;
    private boolean role = false;

    public Staff() {
    }

    public Staff(String name, String id, String pass, String gender) {
        this.name = name;
        this.id = id;
        this.pass = pass;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }
    
    
    
}
