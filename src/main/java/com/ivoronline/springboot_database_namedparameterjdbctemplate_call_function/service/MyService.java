package com.ivoronline.springboot_database_namedparameterjdbctemplate_call_function.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class MyService {

  //PROPERTIES
  @Autowired private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

  //=========================================================================================================
  // CALL FUNCTION
  //=========================================================================================================
  public String callFunction(String name) {

    String sql = "SELECT TEST.MY_FUNCTION(:personName) AS MESSAGE FROM DUAL";

    SqlParameterSource parameters = new MapSqlParameterSource()
      .addValue("personName", name);

    return namedParameterJdbcTemplate.queryForObject(
        sql
      , parameters
      , String.class
    );

  }

}
