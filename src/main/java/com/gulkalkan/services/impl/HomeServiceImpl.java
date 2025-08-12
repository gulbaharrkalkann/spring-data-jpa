package com.gulkalkan.services.impl;

import com.gulkalkan.dto.DtoHome;
import com.gulkalkan.dto.DtoRoom;
import com.gulkalkan.entities.Home;
import com.gulkalkan.entities.Room;
import com.gulkalkan.repository.HomeRepository;
import com.gulkalkan.services.IHomeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class HomeServiceImpl implements IHomeService {

    @Autowired
    private HomeRepository homeRepository;

    @Override
    public DtoHome findHomeById(Long id) {
       DtoHome dtoHome = new DtoHome();
        Optional < Home> optional= homeRepository.findById(id);
        if (optional.isEmpty()){
            return null;
        }
        Home dbhome = optional.get();

        List<Room> dbrooms=optional.get().getRoom();
        BeanUtils.copyProperties(dbhome, dtoHome);

        if (dbrooms !=null && !dbrooms.isEmpty()){
            for (Room room:dbrooms){
                DtoRoom dtoRoom = new DtoRoom();
                BeanUtils.copyProperties(room, dtoRoom);
                dtoHome.getRooms().add(dtoRoom);
            }
        }


        return dtoHome;
    }
}
