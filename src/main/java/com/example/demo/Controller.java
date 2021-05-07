package com.example.demo;

import org.apache.catalina.valves.JDBCAccessLogValve;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.quartz.QuartzProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@Autowired
private JdbcTemplate db;
private Logger logger= LoggerFactory.getLogger(Controller.class);
//For error logging in server

    @PostMapping("/lagre")
    public void registrert(Data innData){
        String Sid = "[0-9]{6}";
        String Fid="[A-Z]{4}[0-9]{4}";
        if (innData.getSid().matches(Sid) && innData.getFid().matches(Fid)){
            try{
                String sql1="INSERT INTO studentfag (Sid, Fid, Aar, Karakter, Prosent) VALUES(?,?,?,?,?)";
            db.update(sql1,innData.getSid(), innData.getFid(), innData.getAar(), innData.getKarakter(),innData.getProsent());

            }
            catch(Exception e){
                String errormessage="Something is wrong."+e;
                logger.error(errormessage);
            }
        }
    }



}
