package org.shandygafflover.sample001;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

	@Autowired
	ResourceLoader resourceLoader;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Resource usersCsv = resourceLoader.getResource("classpath:"+"users.csv");
		try {
			BufferedReader br = new BufferedReader(new FileReader(usersCsv.getFile()));
			String line;
			while ((line = br.readLine()) != null) {
				String[] userRow = line.split(",", 0);
				if(StringUtils.equals(username,userRow[0])) {
					return new User(userRow[0], userRow[1], AuthorityUtils.createAuthorityList(userRow[2]));
				}
			}
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		throw new UsernameNotFoundException("Not Found: " + username);

	}

}
