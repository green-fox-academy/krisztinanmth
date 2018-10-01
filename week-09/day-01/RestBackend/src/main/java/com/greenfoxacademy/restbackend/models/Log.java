package com.greenfoxacademy.restbackend.models;

import javax.persistence.Entity;
import java.sql.Date;

/**
 * date = new SimpleDateFormat("yyyy.MM.dd-HH:mm:ss").format(Calendar.getInstance().getTime());
 */
@Entity
public class Log {

  private Date createdAt;
  private String endpoint;
  private String data;
}
