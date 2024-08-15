package com.telusko.jobsearch.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.telusko.jobsearch.model.Post;

public interface PostRepository extends MongoRepository<Post,String>
{

}