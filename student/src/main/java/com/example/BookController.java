package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
@Autowired 
BookRepository bookrepository;

@RequestMapping("/savebook")
public HashMap<String,Object> saveBook(@RequestBody Book book)
{
	HashMap<String,Object>message=new HashMap<String,Object>();
	try{
		
	int j=book.getNop();
	int i=1;
	while(i<j)
	{
		List<Account>acc=book.getAcc();
		Iterator<Account>acc1=acc.iterator();
		while(acc1.hasNext())
		{
			Account a=acc1.next();
			a.setStatus("available");
			a.setBook(book);
			accountrepository.save(acc);
		}
		i++;
	}
	bookrepository.save(book);
	message.put("status",true);
	
}
catch(Exception e)
	{
	System.out.print(e);
	message.put("status",false);
	}
return message;




	
}

@RequestMapping("/books")
public List<Book> getBooks()
{
	return(List<Book>) bookrepository.findAll();
}

@RequestMapping("/books/{bookId}")
public Book getBook(@PathVariable("bookId") int bookId)
{
	return bookrepository.findOne(bookId);
}



}

