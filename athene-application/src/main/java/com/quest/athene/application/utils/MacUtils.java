/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.utils;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Here is Javadoc.
 * <p/>
 * Created by chenlong on 2015-05-19.
 *
 * @author chenlong
 * @since 1.0
 */
public class MacUtils {

    private static final String HMAC_SHA1 = "HmacSHA1";

    public static byte[] initHmacSHA1Key() {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance(HMAC_SHA1);
            SecretKey secretKey = keyGen.generateKey();
            return secretKey.getEncoded();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(String.format("No algorithm %s while generating secret key", HMAC_SHA1), e);
        }
    }

    public static byte[] hmacSHA1(byte[] data, byte[] key) {
        try {
            // 还原密钥
            SecretKey secretKey = new SecretKeySpec(key, HMAC_SHA1);
            // 实例化Mac
            Mac mac = Mac.getInstance(secretKey.getAlgorithm());
            // 初始化Mac
            mac.init(secretKey);
            // 生成消息摘要
            return mac.doFinal(data);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(String.format("No algorithm %s while generating secret key", HMAC_SHA1), e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(String.format("Invalid key while digesting data with %s", HMAC_SHA1), e);
        }
    }

}
