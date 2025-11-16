public class LengthUserCheckService implements IUserCheckService {
    @Override
    public boolean checkUser(User user) {
       if(user.getName().length()< 5){
           return false ;
       }
       return true;
    }
}
