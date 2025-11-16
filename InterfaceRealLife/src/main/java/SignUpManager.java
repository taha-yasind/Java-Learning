public class SignUpManager {
private IUserCheckService iUserCheckService;

    public SignUpManager(IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
    }

    public void signUp(User user){
        if (iUserCheckService.checkUser(user)) {
            System.out.println("Kullanıcı Kayıt oldu."+ user.getName());
        }
        else
            System.out.println("Kullanıcı Kayıt oLamadı.");

    }
}
