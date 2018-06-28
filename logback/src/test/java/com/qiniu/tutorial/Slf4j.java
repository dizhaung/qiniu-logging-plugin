package com.qiniu.tutorial;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by jemy on 2018/6/11.
 */
public class Slf4j {
    @Test
    public void testSlf4j(){
        Logger logger= LoggerFactory.getLogger(Slf4j.class);
        logger.trace("slf4j trace level");
        logger.debug("slf4j debug level");
        logger.info("slf4j info level");
        logger.warn("slf4j warn level");
        logger.error("slf4j error level");

        try {
            FileInputStream fs = new FileInputStream(new File("xxx"));
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            logger.error("s", "o", new Throwable( e));
        }

        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
