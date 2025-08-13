package com.gulkalkan.controller.impl;


import com.gulkalkan.Configuration.DataSource;
import com.gulkalkan.Configuration.GlobalProperty;
import com.gulkalkan.Configuration.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/api/property")
public class PropertySourceController {

@Autowired
private GlobalProperty globalProperty;

    @GetMapping("/datasource")
    public DataSource getDataSource() {

        return null;
    }
@GetMapping("/getservers")
    public List<Server> getServers() {
      return   globalProperty.getServers();
    }
}
