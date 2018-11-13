package org.shandygafflover.sample001;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		String VALID_USERNAME = "username";

		if(StringUtils.equals(username, VALID_USERNAME)) {
			return new User(username, "password", AuthorityUtils.createAuthorityList("USER"));
		}

		throw new UsernameNotFoundException("Not Found: " + username);


	}

}
