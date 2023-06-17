###   这是一个轻型 Bcript 加密工具类，主要用于简单的密文加密



/*-------------------------------加密方法-------------------------------*/

​	hashPassword(String password)  默认salt加密 --> 返回值String

   hashPassword(String password , Integer salt) 手动salt加密 --> 返回值String

   verifyPassword(String password, String hashedPassword)  密码验证 --> 返回值Bolen



/*------------------------加密解密示例----------------------------*/

    public static void main(String[] args) {
        String password = "myPassword123";
        Integer salt = 15 ;
        // 加密密码
    
        默认salt值
        String hashedPassword = hashPassword(password);
    
        //手动salt值
        //String hashedPassword = hashPassword(password , salt);
       
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

​            