package com.example.springpostgresqldemo.services;

import com.example.springpostgresqldemo.dto.UserDto;
import com.example.springpostgresqldemo.entity.Adress;
import com.example.springpostgresqldemo.entity.Users;
import com.example.springpostgresqldemo.repository.IAddressRepository;
import com.example.springpostgresqldemo.repository.IUserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {

    private IUserRepository userRepository;
    private IAddressRepository addressRepository;


    @Override
    @Transactional
    public UserDto save(UserDto userDto) {
        Users user = new Users();
        user.setUserName(userDto.getUserName());
        user.setSurname(userDto.getSurname());
        Users userDb = userRepository.save(user);

        List<Adress> adressList = new ArrayList<>();
        userDto.getAddressList().forEach(item -> {
            Adress adress = new Adress();
            adress.setAdress(item);
//            adress.setAdressType();
//            adress.setActive();
            adress.setUser(userDb);
            adressList.add(adress);
        });
        addressRepository.saveAll(adressList);
        userDto.setId(userDb.getId());
        return userDto;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<UserDto> getAll() {
        List<Users> userList = userRepository.findAll();
        List<UserDto> userDtos = new ArrayList<>();

        userList.forEach(item -> {
            UserDto userDto = new UserDto();
            userDto.setUserName(item.getUserName());
            userDto.setSurname(item.getSurname());
            userDto.setId(item.getId());
            userDto.setAddressList(item.getAdresses().stream().map(Adress::getAdress).collect(Collectors.toList()));

            userDtos.add(userDto);
        });

        return userDtos;
    }

    @Override
    public Page<UserDto> userDto(Pageable pageable) {
        return null;
    }
}
