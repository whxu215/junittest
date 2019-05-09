package com.andy.junittest;

import java.math.BigDecimal;

public class MathExtendUtils {
    //默认运算精度
    private static final int DEFAULT_SCALE = 2;
    /**
     * 提供精确的加法运算
     * @param v1
     * @param v2
     * @return 两个参数数学加和，以字符串格式返回
     */
    public static BigDecimal add(String v1, String v2)
    {
        v1 = v1.equals("")?"0":v1;
        v2 = v2.equals("")?"0":v2;

        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.add(b2).setScale(DEFAULT_SCALE, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 提供精确的减法运算
     * @param v1
     * @param v2
     * @return 两个参数数学差，以字符串格式返回
     */
    public static BigDecimal subtract(String v1, String v2)
    {
        v1 = v1.equals("")?"0":v1;
        v2 = v2.equals("")?"0":v2;

        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.subtract(b2).setScale(DEFAULT_SCALE, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 提供精确的乘法运算
     * @param v1
     * @param v2
     * @return 两个参数的数学积，以字符串格式返回
     */
    public static BigDecimal multiply(String v1, String v2)
    {
        v1 = v1.equals("")?"0":v1;
        v2 = v2.equals("")?"0":v2;

        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.multiply(b2).setScale(DEFAULT_SCALE, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到
     * 小数点以后10位，以后的数字四舍五入,舍入模式采用ROUND_HALF_EVEN
     * @param v1
     * @param v2
     * @return 两个参数的商，以字符串格式返回
     */
    public static BigDecimal divide(String v1, String v2){
        v1 = v1.equals("")?"0":v1;
        v2 = v2.equals("")?"0":v2;

        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.divide(b2, DEFAULT_SCALE, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 比较大小
     * @param v1
     * @param v2
     * @return 返回为-1，0，1，代表小于，相等，大于
     */
    public static int compareTo(String v1, String v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.compareTo(b2);
    }

    /**
     *
     * @param d
     * @return
     */
    public static String double2str(double d) {
        return String.format("%.2f", d);
    }
}
