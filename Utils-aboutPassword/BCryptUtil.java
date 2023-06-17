import org.mindrot.jbcrypt.BCrypt;

/**
 * BCrypt 加盐加密工具类
 *
 * @author DC
 */

public class BCryptUtil {

    // 加密密码
    public static String hashPassword(String password) {
        // 生成带有盐的哈希密码，BCrypt会自动生成盐并将其附加到哈希结果中
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        return hashedPassword;
    }

    // 验证密码
    public static boolean verifyPassword(String password, String hashedPassword) {
        // 使用BCrypt的checkpw方法来验证密码是否匹配
        boolean passwordMatch = BCrypt.checkpw(password, hashedPassword);
        return passwordMatch;
    }
}


/*------------------------加密解密方法----------------------------*/

    /*public static void main(String[] args) {
        String password = "myPassword123";

        // 加密密码
        String hashedPassword = hashPassword(password);
        System.out.println("原始密码: " + password);
        System.out.println("加密后的密码: " + hashedPassword);

        // 验证密码
        boolean isPasswordCorrect = verifyPassword(password, hashedPassword);
        System.out.println("验证密码: " + isPasswordCorrect);
    }


            <!--bcript加盐加密依赖-->
            <dependency>
            <groupId>org.mindrot</groupId>
            <artifactId>jbcrypt</artifactId>
            <version>0.4</version>
            </dependency>
            */