/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.utils;


import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

/**
 * Here is Javadoc.
 * <p/>
 * Created by chenlong on 2015-05-08.
 *
 * @author chenlong
 * @since 1.0
 */
public class Passwords {

    private static final SecureRandom SECURE_RANDOM;
    private static final byte[] SALT_BYTES = new byte[32];

    static {
        try {
            SECURE_RANDOM = SecureRandom.getInstance("SHA1PRNG", "SUN");
            // Why? See: https://www.cigital.com/justice-league-blog/2009/08/14/proper-use-of-javas-securerandom/
            SECURE_RANDOM.nextBytes(SALT_BYTES);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("No algorithm SHA1PRNG while initializing Passwords class", e);
        } catch (NoSuchProviderException e) {
            throw new RuntimeException("No provider SUN while initializing Passwords class", e);
        }
    }

//    public static String encrypt(String plainPwd, String salt) {
//        return DigestUtils.sha256Hex(salt + plainPwd);
//    }

//    public static String nextSalt() {
//        // TODO Periodically set a new seed
//        SECURE_RANDOM.setSeed(SECURE_RANDOM.generateSeed(SALT_BYTES.length));
//        SECURE_RANDOM.nextBytes(SALT_BYTES);
//        return Hex.encodeHexString(SALT_BYTES);
//    }

//    public static void main(String[] args) {
//        System.out.println(encrypt("123456", Passwords.nextSalt()));
//    }

}
