package com.gulkalkan.controller;

import com.gulkalkan.dto.DtoHome;

public interface IHomeController {

    public DtoHome findHomeById(Long id);
}
