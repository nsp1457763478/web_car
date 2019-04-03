package com.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: nsp
 * Date: 2019-03-28
 * Time: 14:35
 * Description: No Description
 */
public class UUIDUtil {
    public static String  getUUID() {
        //public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String newDate = sdf.format(new Date());
        String result = "";
        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            result += random.nextInt(10);
        }
        return newDate + result;
        //System.out.println(newDate + result);
    }
}
