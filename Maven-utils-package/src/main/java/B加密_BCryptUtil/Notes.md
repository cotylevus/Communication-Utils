/*------------------------加密解密方法----------------------------*/

    public static void main(String[] args) {
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

            