package alvira.nazli.javafundamental.abstraction;

public abstract class RegistrationAbsract {
    //modifier public
    public abstract void setUser(String username);

    //modifier default
    void setRole(String role){
        System.out.println("Role : " + role);
        setLevel(1);
    }

    //modifier default static
    static void setLevel(Integer level){
        System.out.println("Level : " + level);
    }
}
