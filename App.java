package org.example;



import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
    public static Logger logger = Logger.getLogger(App.class);
    public static void main(String[] args) {
        for(int num=1;num<=100;num++){
            String res = "";
            if(num % 3 == 0){
                res+="Fizz";
            }
            if(num % 5 == 0){
                res += "Buzz";
            }
            if(res.length()>0){
                //System.out.println(res);
                logger.info("result " + res);
            }else {
                //System.out.println(num);
                logger.info("result " + num);
            }
        }

    }

    /*public static void main( String[] args ){
        logger.warn("warning");
        logger.debug("debug");
        logger.info("info");
        logger.error("error");
        logger.fatal("fatal");

    }*/
}
