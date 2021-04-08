package alvira.nazli.javafundamental.abstraction;

public class Registration extends RegistrationAbsract {

    @Override
    public void setUser(String username) {
        System.out.println("Username : " + username);
    }

    @Override
    void setRole(String role) {
        super.setRole(role);
    }
}
