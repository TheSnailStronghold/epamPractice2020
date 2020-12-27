package org.example;
import org.apache.log4j.Logger;
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
        /*public static void main(String[] args){
        for(int num = 1; num <= 100; num++){
            if(num % 15 == 0){
                System.out.print("FizzBuzz");
            }else{
                if(num % 3 == 0) {
                    System.out.print("Fizz");
                }else{
                    if(num % 5 ==0){
                        System.out.print("Buzz");
                    }else{
                        System.out.print(num);
                    }
                }
            }
            System.out.print(" ");
        }
    }*/

    }

    /*public static void main( String[] args ){
        logger.warn("warning");
        logger.debug("debug");
        logger.info("info");
        logger.error("error");
        logger.fatal("fatal");

    }*/
}
