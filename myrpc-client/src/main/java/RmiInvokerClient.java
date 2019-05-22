import org.springframework.context.support.ClassPathXmlApplicationContext;
import serializer.pojo.User;
import service.UserService;

/**
 * @author zhangzhidong
 * @since 2019/5/21
 */
public class RmiInvokerClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("rmi-rpc-client.xml");
        UserService userService = (UserService) context.getBean("userRmiServiceProxy");
        User user = userService.findByName("zzd");
        System.out.println(user.getUsername() + " " + user.getEmail());
    }
}
