package es.indra.demoblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.indra.demoblog.model.Blog;
import es.indra.demoblog.service.BlogService;

@RestController
public class BlogController {

	@Autowired
	BlogService blogService;

	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public ResponseEntity<List<Blog>> getAllBlog() {
		List<Blog> todosLosBlogs = this.blogService.getAllBlog();
		ResponseEntity<List<Blog>> response = new ResponseEntity<List<Blog>>(todosLosBlogs, HttpStatus.OK);
		return response;
	}

	// Esta id "/blog/{id}" hace referencia a @PathVariable("id")
	@RequestMapping(value = "/blog/{id}", method = RequestMethod.GET)
	public ResponseEntity<Blog> getById(@PathVariable("id") int id) {
		return new ResponseEntity<Blog>(this.blogService.getBlogById(id), HttpStatus.OK);
	}

	@RequestMapping(value = "/blog", method = RequestMethod.POST)
	public ResponseEntity<Void> create(@RequestBody Blog blog) {
		this.blogService.saveBlog(blog);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/blog", method = RequestMethod.PUT)
	public ResponseEntity<String> update(@RequestBody Blog blog) {
		return new ResponseEntity<String>(this.blogService.editBlog(blog), HttpStatus.OK);
	}

	@RequestMapping(value = "/blog/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> removeById(@PathVariable("id") int id) {
		Blog blog = this.blogService.getBlogById(id);
		this.blogService.removeBlog(blog);
		return new ResponseEntity<String>("Blog eliminado", HttpStatus.OK);
	}

}