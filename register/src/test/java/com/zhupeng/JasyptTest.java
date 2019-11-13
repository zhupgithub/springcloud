package com.zhupeng;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentPBEConfig;
import org.junit.Test;

/**
 * 在Spring boot开发中，需要在application.yml文件里配置数据库的连接信息，或者在启动时传入数据库密码，
 * 如果不加密，传明文，数据库就直接暴露了，相当于"裸奔"了，因此需要进行加密处理才行
 *
 * https://blog.csdn.net/linjingke32/article/details/81329614
 * jasypt-spring-boot-starter.jar
 * 相同的明文和相同的加密密钥，加密后的串却不一样（）
 */
public class JasyptTest {

    private final static String ALGORITHM = "PBEWithMD5AndDES"; //加密的算法，这个算法是默认的
    private final static String SECRETKEY = "zhupeng";

    @Test
    public void testEncrypt() throws Exception {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        EnvironmentPBEConfig config = new EnvironmentPBEConfig();

        config.setAlgorithm(ALGORITHM);          // 加密的算法，这个算法是默认的
        config.setPassword(SECRETKEY);                        // 加密的密钥
        standardPBEStringEncryptor.setConfig(config);

        String plainText = "zhupgithub"; //待加密数据
        String encryptedText = standardPBEStringEncryptor.encrypt(plainText);
        System.out.println("加密后的值：" + encryptedText);
    }

    @Test
    public void testDe() throws Exception {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        EnvironmentPBEConfig config = new EnvironmentPBEConfig();

        config.setAlgorithm(ALGORITHM);
        config.setPassword(SECRETKEY);
        standardPBEStringEncryptor.setConfig(config);
        String encryptedText = "dIsfna8hbMIM0EYYjULtjslNj0cPdCTD";
        String plainText = standardPBEStringEncryptor.decrypt(encryptedText);
        System.out.println("解密后的值：" + plainText);
    }
}