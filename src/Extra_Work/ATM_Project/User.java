package Extra_Work.ATM_Project;

public class User implements Person{
    private String name;
    private String id;
    private String password;

    public User(String name, String id, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
