//package ru.reksoft.interns.projectwebstore.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import ru.reksoft.interns.projectwebstore.dto.UsersDto;
//import ru.reksoft.interns.projectwebstore.service.UsersService;
//
//public class UserDetails implements UserDetailsService {
//    @Autowired
//    private UsersService usersService;
//   // @Override
//
//
//    @Override
//    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        return null;
//    }
//
//    public UserDetails loadUser(Integer id) {
//        UsersDto users= usersService.getUsers(id);
//        String role=users.getRule();
//        UserDetails userDetails= User(users.getLogin(),users.getPassword(),role);
//        return userDetails;
//    }
//}
