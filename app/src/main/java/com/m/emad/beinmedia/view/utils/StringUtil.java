package com.m.emad.beinmedia.view.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by M.Emad
 */
public class StringUtil {


    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    private static final Pattern VALID_USERNAME_PATTERN = Pattern.compile("^[a-z0-9_-]{3,15}$", Pattern.CASE_INSENSITIVE);
    private static final Pattern VALID_DESCRIPTION_PATTERN = Pattern.compile("^[a-z0-9_-]{10,155}$", Pattern.CASE_INSENSITIVE);


    public static boolean isEmpty(String value) {
        return (value == null) || value.trim().equals("");
    }

    public static boolean isValidateEmail(String emailStr) {
        if (emailStr == null || emailStr.trim().isEmpty()){
            return false;
        }
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    public static boolean isValidateUserName(String userNameStr) {
        if (userNameStr == null || userNameStr.trim().isEmpty()){
            return false;
        }
        Matcher matcher = VALID_USERNAME_PATTERN.matcher(userNameStr);
        return matcher.find();
    }

    public static boolean isValidateDescription(String des){
        if (des == null || des.trim().isEmpty()){
            return false;
        }
        Matcher matcher = VALID_DESCRIPTION_PATTERN.matcher(des);
        return matcher.find();
    }


    public static boolean isValidPassword(String passwordStr){
        if (passwordStr == null ||  passwordStr.trim().isEmpty()){
            return false;
        }
        return passwordStr.length() > 3;
    }

    public static String MD5(String md5) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return null;
    }

    /**
     * Returns a <code>String</code> from given <code>InputStream</code>
     * @param inputStream The input stream.
     * @return The String read.
     * @throws IOException
     */
    public static String getStringFromInputStream(InputStream inputStream) throws IOException {
        final StringBuffer stringBuffer = new StringBuffer();
        if (inputStream != null) {
            final BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String string;
            while ((string = reader.readLine()) != null) {
                stringBuffer.append(string + "\n");
            }
            inputStream.close();
        }
        return stringBuffer.toString();
    }

}
