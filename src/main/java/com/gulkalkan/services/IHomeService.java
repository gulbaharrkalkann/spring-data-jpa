package com.gulkalkan.services;

import com.gulkalkan.dto.DtoHome;

public interface IHomeService {

    public DtoHome findHomeById(Long id);
}
