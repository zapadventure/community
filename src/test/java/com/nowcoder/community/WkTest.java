package com.nowcoder.community;

import java.io.IOException;

/**
 * @author superzap
 * @create 2022-10-02 15:58
 */
public class WkTest {

    public static void main(String[] args) {
        String cmd = "d:/Java/wkhtmltopdf/bin/wkhtmltoimage --quality 75 https://www.nowcoder.com d:/data/wk-images/3.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
