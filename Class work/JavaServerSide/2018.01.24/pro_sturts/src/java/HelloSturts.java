
import com.opensymphony.xwork2.ActionSupport;
import javax.annotation.ManagedBean;

@ManagedBean
public class HelloSturts extends ActionSupport{
    private String userName;
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    private String message;
    public String getMessage(){
        return message;
    }
    public String execute(){
        message="Hello, "+userName+".";
        return SUCCESS;
    }
}
