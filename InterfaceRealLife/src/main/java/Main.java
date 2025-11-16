public class Main {
    public static void main(String[] args) {
        SignUpManager signUpManager = new SignUpManager(new LengthUserCheckService());

        signUpManager.signUp(new User(1, "Taha", 26));
    }
}
