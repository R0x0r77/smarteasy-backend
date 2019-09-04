// package com.smarteasy.service;
//
// import java.util.Optional;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;
//
// import com.smarteasy.jpa_repositories.UsersRepository;
// import com.smarteasy.model.User;
// import com.smarteasy.model.UserDetailsImpl;
//
// @Service
// public class UserDetailsServiceImpl implements UserDetailsService {
//
// @Autowired
// private UsersRepository usersRepository;
//
// @Override
// public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
// Optional<User> optionalUser = usersRepository.findByFirstName(userName);
// return Optional.ofNullable(optionalUser).orElseThrow(() -> new UsernameNotFoundException("Username Not Found"))
// .map(UserDetailsImpl::new).get();
// }
// }