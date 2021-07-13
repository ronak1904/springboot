package spring.demo.storagegrid.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.demo.storagegrid.model.Account;
import spring.demo.storagegrid.model.Bucket;
import spring.demo.storagegrid.model.Usage;
import spring.demo.storagegrid.model.User;
import spring.demo.storagegrid.repository.AccountRepository;
import spring.demo.storagegrid.repository.BucketRepository;
import spring.demo.storagegrid.repository.UsageRepository;
import spring.demo.storagegrid.repository.UserRepository;


@Service
public class Storagegridservice {
	@Autowired
	private UsageRepository usageRepository;
	
	
	@Autowired
	private BucketRepository bucketRepository;
	
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private UserRepository userRepository;
	public Usage addUsage(Usage usage)
	{
		
	   
		Usage savedusage = usageRepository.save(usage);
		
	   // System.out.println("Name: " + person.getCollageName());
	    return savedusage;
	}
	
	public Bucket addBucket(Bucket bucket)
	{
		
	   
		Bucket savedbucket = bucketRepository.save(bucket);
		
	   // System.out.println("Name: " + person.getCollageName());
	    return savedbucket;
	}
	
	public Account addAccount(Account account)
	{
		
	   
		Account savedaccount = accountRepository.save(account);
		
	   // System.out.println("Name: " + person.getCollageName());
	    return  savedaccount;
	}
	
	public User addUser(User user)
	{
		
	   
		User saveduser = userRepository.save(user);
		
	   // System.out.println("Name: " + person.getCollageName());
	    return  saveduser;
	}

}
