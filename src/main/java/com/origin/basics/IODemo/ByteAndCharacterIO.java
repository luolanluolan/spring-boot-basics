package com.origin.basics.IODemo;

import java.io.*;

/**
 * @author LL
 * @date 2019/11/21 16:29
 * @describe 测试字节IO与字符IO是否用到缓冲区
 */
public class ByteAndCharacterIO {

    public static void main(String[] args) {
        File f = new File("E:"+ File.separator+"test.txt");
//        ByteAndCharacterIO.testByteIO(f);
        ByteAndCharacterIO.testCharacterIO(f);
    }

    public static void testByteIO(File f){

        OutputStream out = null;
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            out = new FileOutputStream(f);
            String str = "字节流输出：Hello LL";
            byte[] b = str.getBytes();
            out.write(b);
        }catch (Exception e){
            e.printStackTrace();
        }

        //不关闭流正常输出，证明字节流不使用缓冲区，直接对文件进行操作
//        out.close();
    }

    public static void testCharacterIO(File f){

        Writer out = null;
        try{
            if(!f.exists()){
                f.createNewFile();
            }
            out = new FileWriter(f);
            String str = "字符流输出：Hello LL";
            out.write(str);

            //想在不关闭之前将缓冲区内容输出，用out.flush();  强制性清空缓冲区中的内容
//            out.flush();
            //不关闭流无输出，证明字符流使用缓冲区，在关闭字符流时会强制性地将缓冲区中的内容进行输出
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
