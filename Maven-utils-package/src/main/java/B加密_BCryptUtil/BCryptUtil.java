package B加密_BCryptUtil;

import org.mindrot.jbcrypt.BCrypt;

/**
 * BCrypt 加盐加密工具类
 *
 * @author DC
 */

public class BCryptUtil {

    // 加密密码 （自动加盐 默认10）
    public static String hashPassword(String password) {
        // 生成带有盐的哈希密码，BCrypt会自动生成盐并将其附加到哈希结果中
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        return hashedPassword;
    }
    // 加密密码 （手动加盐）
    public static String hashPassword(String password , Integer salts) {
        // 生成带有盐的哈希密码，BCrypt会自动生成盐并将其附加到哈希结果中
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt(salts));
        return hashedPassword;
    }


    // 验证密码
    public static boolean verifyPassword(String password, String hashedPassword) {
        // 使用BCrypt的checkpw方法来验证密码是否匹配
        boolean passwordMatch = BCrypt.checkpw(password, hashedPassword);
        return passwordMatch;
    }
}