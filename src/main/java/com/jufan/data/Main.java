package com.jufan.data;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
//    private static Logger data = LogManager.getLogger("com.jufan.worker.EventProcessor.data");
//    private static Logger data_test = LogManager.getLogger("com.jufan.worker.EventProcessor.data.test");

    public static void main(String[] args){



//        String line = "Uploading /Users/xiang/Documents/code/writeLog/target/writeLog-v1.jar to /cdh-master1/prod_sudo/writeLog-v1.jarUploading /Users/xiang/Documents/code/writeLog/target/writeLog-v1.jar to /cdh-master1/prod_sudo/writeLog-v1.jarUploading /Users/xiang/Documents/code/writeLog/target/writeLog-v1.jar to /cdh-master1/prod_sudo/writeLog-v1.jarUploading /Users/xiang/Documents/code/writeLog/target/writeLog-v1.jar to /cdh-master1/prod_sudo/writeLog-v1.jarUploading /Users/xiang/Documents/code/writeLog/target/writeLog-v1.jar to /cdh-master1/prod_sudo/writeLog-v1.jarUploading /Users/xiang/Documents/code/writeLog/target/writeLog-v1.jar to /cdh-master1/prod_sudo/writeLog-v1.jarUploading /Users/xiang/Documents/code/writeLog/target/writeLog-v1.jar to /cdh-master1/prod_sudo/writeLog-v1.jarUploading /Users/xiang/Documents/code/writeLog/target/writeLog-v1.jar to /cdh-master1/prod_sudo/writeLog-v1.jarUploading /Users/xiang/Documents/code/writeLog/target/writeLog-v1.jar to /cdh-master1/prod_sudo/writeLog-v1.jarUploading /Users/xiang/Documents/code/writeLog/target/writeLog-v1.jar to /cdh-master1/prod_sudo/writeLog-v1.jarUploading /Users/xiang/Documents/code/writeLog/target/writeLog-v1.jar to /cdh-master1/prod_sudo/writeLog-v1.jarUploading /Users/xiang/Documents/code/writeLog/target/writeLog-v1.jar to /cdh-master1/prod_sudo/writeLog-v1.jar";
//        int interval = Integer.parseInt(args[0]);
//
//        for(int i=0;i<Integer.MAX_VALUE;i++){
//            try{
//                Thread.sleep(interval);
//            }catch(InterruptedException e){
//                e.printStackTrace();
//            }
//
//            data.info("data:"+i+"  "+line);
//            data_test.info("data_test:"+i+"  "+line);
//        }


        InputStream in = Main.class.getClassLoader().getResourceAsStream("common.properties");
        Properties p = new Properties();
        try {
            p.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(p.get("flag"));

    }
}
