package spring.demo.storagegrid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import spring.demo.storagegrid.model.Account;
import spring.demo.storagegrid.model.Bucket;
import spring.demo.storagegrid.model.Usage;
import spring.demo.storagegrid.model.User;
import spring.demo.storagegrid.service.Storagegridservice;


@RestController
public class storagegridController {
	@Autowired
	private Storagegridservice storagegridservice;
	
	@PostMapping("/usage")
	public ResponseEntity<Usage>  addUsage(@RequestBody Usage usage)
	{
		storagegridservice.addUsage(usage);
      return new ResponseEntity<Usage>(usage, HttpStatus.CREATED);
	}
	
	
	@PostMapping("/bucket")
	public ResponseEntity<Bucket>  addBucket(@RequestBody Bucket bucket)
	{
		storagegridservice.addBucket(bucket);
      return new ResponseEntity<Bucket>(bucket, HttpStatus.CREATED);
	}
	
	@PostMapping("/account")
	public ResponseEntity<Account>  addAccount(@RequestBody Account account)
	{
		storagegridservice.addAccount(account);
      return new ResponseEntity<Account>(account, HttpStatus.CREATED);
	}
	
	@PostMapping("/user")
	public ResponseEntity<User>  addUser(@RequestBody User user)
	{
		storagegridservice.addUser(user);
      return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}

}
